/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LABA
 */
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private Date ultimaModificacion;
    private int numero;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String direccion, Date ultimaModificacion, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ultimaModificacion = ultimaModificacion;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(Date ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    
  public ArrayList<Cliente> VerClientes(){
            ArrayList<Cliente> lista = new ArrayList();
            try{
                String tsql ="select * from Clientes";
                Conexion conex = new Conexion();
                ResultSet res;
                Statement st = null;
                Connection conn = conex.getConexion();
                
                st = conn.createStatement();
                res= conex.Listar(tsql);
                while (res.next()){
                    Cliente c= new Cliente();
                    c.setId(res.getInt("id"));
                    c.setUltimaModificacion(res.getDate("ultimaModificacion"));
                    c.setNombre(res.getString ("nombre"));
                    c.setDireccion(res.getString("direccion"));
                    c.setNumero(res.getInt("numero"));
                    lista.add(c);
                }
            }catch (Exception ex){
                
            }
            return lista;
        }  
  
  public DefaultTableModel buscarNombreRegistros(String nombre) {
      DefaultTableModel tabla = new DefaultTableModel();
      try {
          String tsql = "select * from Clientes where nombre like '%"+nombre+"%'";
          Conexion conex = new Conexion();
          ResultSet res;
          Statement st = null;
          Connection conn = conex.getConexion();
          
          st = conn.createStatement();
          res = conex.Listar(tsql);
          
          String Titulos[] = {"ID", "NOMBRE", "DIRECCION", "ULTIMAMODIFICACION", "NUMERO" };
          tabla.setColumnIdentifiers(Titulos);
          
          while (res.next()) {
              Object obj[] = new Object[5];
              obj[0] = res.getString("ID");
              obj[1] = res.getString("NOMBRE");
              obj[2] = res.getString("DIRECCION");
              obj[3] = res.getString("ULTIMAMODIFICACION");
              obj[4] = res.getString("Numero");
              
              tabla.addRow(obj);
          }
          
          
          
      }
      catch (Exception e) {
          
      }
      
      return tabla;
  }
  
  public DefaultTableModel verRegistros() {
      DefaultTableModel tabla = new DefaultTableModel();
      try {
          String tsql = "select * from Clientes";
          Conexion conex = new Conexion();
          ResultSet res;
          Statement st = null;
          Connection conn = conex.getConexion();
          
          st = conn.createStatement();
          res = conex.Listar(tsql);
          
          String Titulos[] = {"ID", "NOMBRE", "DIRECCION", "ULTIMAMODIFICACION", "NUMERO" };
          tabla.setColumnIdentifiers(Titulos);
          
          while (res.next()) {
              Object obj[] = new Object[5];
              obj[0] = res.getInt("ID");
              obj[1] = res.getString("NOMBRE");
              obj[2] = res.getString("DIRECCION");
              obj[3] = res.getDate("ULTIMAMODIFICACION");
              obj[4] = res.getInt("Numero");
              
              tabla.addRow(obj);
          }
          
          
          
      }
      catch (Exception e) {
          
      }
      
      return tabla;
  }
  
  public int EliminarCliente( int id ){
      int band = 0;
      Conexion conex = new Conexion();
      int rs;
      Statement st = null;
      Connection conn = conex.getConexion();
      
      String consulta = "DELETE FROM Clientes WHERE id = " + id;
      try {
          st = conn.createStatement();
          rs = st.executeUpdate(consulta);
          if ( rs==1 ) {
              band=1;
          }
      }
      catch (Exception owo) {
          
      }
      return band;
  }
  
  public int GuardarClientes(){
      int band = 0;
      Conexion conex = new Conexion();
      int rs;
      Statement st = null;
      Connection conn = conex.getConexion();
      
      String consulta = "Insert into Clientes (nombre, direccion, numero )  values ('" + getNombre() + "', '" + getDireccion() + "', " + getNumero() + ")";
      try {
          st = conn.createStatement();
          rs = st.executeUpdate(consulta);
          if ( rs==1 ) {
              band=1;
          }
      }
      catch (Exception owo) {
          
      }
      return band;
  }
  
  public int ActualizarClientes(){
      int band = 0;
      Conexion conex = new Conexion();
      int rs;
      Statement st = null;
      Connection conn = conex.getConexion();
      
      String consulta = "Update Clientes set nombre = '" + getNombre() + "', direccion = '" + getDireccion() + "', numero=" + getNumero() + " where id = " +getId();
      try {
          st = conn.createStatement();
          rs = st.executeUpdate(consulta);
          if ( rs==1 ) {
              band=1;
          }
      }
      catch (Exception owo) {
          
      }
      return band;
  }
}
