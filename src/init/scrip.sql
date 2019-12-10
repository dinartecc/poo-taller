create database tallerpoo;

use tallerpoo;

create table Cliente (
	id int identity (1,1) primary key,
	nombre varchar (40),
	numero int,
	direccion varchar (160),
	tipo VARCHAR(8) NOT NULL CHECK (tipo IN('persona', 'empresa'))
);


create table Persona (
	id int not null,
	cedula varchar (15),
	edad int,
	CONSTRAINT FK_C_P foreign key (id) references Cliente(id) on delete cascade
);

create table Empresa (
	id int not null,
	RUC varchar (20),
	recibeCredito bit
	CONSTRAINT FK_C_E foreign key (id  ) references Cliente(id) on delete cascade
);

create table Marca (
	id int identity (1,1) primary key,
	nombre varchar(20)
);


create table Modelo (
	nombre varchar(20),
	id int identity (1,1) primary key,
	marcaId int not null,
	constraint FK_M_M foreign key (marcaId) references marca(id)
);

create table Auto ( 
	matricula varchar (10) primary key,
	modeloId id not null,
	anyo int,
	clienteId int,
	constraint FK_A_C foreign key (clienteId) references Cliente (id),
	constraint FK_A_M foreign key (modeloId) references Modelo(id)
	
);



create table Ticket (
	id int identity (1,1) primary key,
	fechaCreacion date not null default GETDATE(),
	fechaFinalizacion date,
	matricula varchar (10) not null,
	constraint FK_T_A foreign key (matricula) references auto(matricula)
);

create table Servicio (
	id int identity (1,1) primary key,
	nombre varchar(30) not null,
	descripcion varchar (255),
	ticketId int not null,
	precio smallmoney,
	completado bit default 0,
	constraint FK_S_T foreign key (ticketId) references ticket (id)
);



create table Factura (
	numFac int primary key identity ( 10000000, 1),
	fecha datetime not null default GETDATE(),
	clienteId int, 
	ticketId int not null,
	monto smallmoney,
	cancelado bit default 0,
	constraint FK_F_T foreign key (ticketId) references ticket(id),
	constraint FK_F_C foreign key (clienteId) references cliente(id)
);

create table Usuario (
	usuario varchar(40) primary key,
	contrasena varchar(256)
);

create view ClienteFull as (
select c.id, nombre, numero, tipo, edad, cedula, RUC, recibeCredito as Credito, direccion
from Cliente as c 
left join Persona as p on C.id = P.id 
left join empresa as e on C.id = e.Id);

create view AutoFull as (
	select MATRICULA, ma.nombre as 'MARCA', mo.nombre as 'MODELO', ANYO as 'AÑO', c.Nombre as 'CLIENTE', c.id as 'CLIENTEID', modeloId as 'MODELOID' from Auto as a 
	join Cliente as c on a.clienteId = c.id
	join Modelo as mo on mo.id = a.modeloId
	join Marca as ma on ma.id = mo.marcaId
);

create view ModeloFull as (
	select mo.id 'ID', mo.nombre as 'NOMBRE', ma.nombre as 'MARCA', ma.id as 'MARCAID' from 
	Modelo as mo 
	join Marca as ma on ma.id = mo.marcaId
);



create view TicketFull as (
	select t.id as 'ID', fechaCreacion, fechaFinalizacion, a.matricula as 'MATRICULA', c.nombre as 'CLIENTE', count(s.id) as 'CantidadServicios' 
	from ticket as t	 
	left join servicio as s on t.id = s.ticketId 
	join auto as a on t.matricula = a.matricula
	join cliente as c on a.clienteId = c.id
	group by t.id, fechaCreacion, fechaFinalizacion, a.matricula, c.nombre
);



create view FacturaFull as (
	select numFAC as 'NUMEROFAC', fecha as 'FECHA', monto as 'MONTO', 
	(case cancelado when 1 then 'Si' else '' end) as 'CANCELADO',
	matricula as 'MATRICULA', nombre as 'CLIENTE', clienteId as 'CLIENTEID',
	ticketId as 'TICKET'
	from Factura as f
	left join Cliente as c on  c.id = f.clienteId
	left join Ticket as t on f.ticketId = t.id
);



create view facturasCanceladas as (
select count(numFac) as 'NUM', sum (cast(cancelado as int))  as 'ANU', ticketId from factura group by ticketId
);

create view totalesTicket as (
select t.id as 'ID', sum(s.precio )'TOTAL' from ticket as t join servicio as  s on t.id = s.ticketId group by t.id
);

CREATE TRIGGER SumaServicios
ON factura
AFTER  INSERT
AS
begin
declare @id as int , @numFac as int
	set @id=(select ticketId  from inserted)
	set @numFac=(select numFac from inserted)
	update factura set monto = ( select total from totalesTicket where id = @id ) where numFac = @numFac
end



CREATE TRIGGER MarcarFinalizado
ON servicio
AFTER  UPDATE, INSERT, DELETE
AS
begin
	declare @tid as int,
			@numS as int,
			@numC as int

	set @tid=(select ticketId  from inserted)
	select @numS=COUNT(id), @numC = (0+sum(cast(completado as int))) from servicio where ticketId=@tid;
	if @numS > 0 and @numC = @numS
		update Ticket set fechaFinalizacion = GETDATE() where id = @tid
	else
		update Ticket set fechaFinalizacion = null where id = @tid
end