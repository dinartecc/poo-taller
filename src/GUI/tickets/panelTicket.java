/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.tickets;

import GUI.autos.*;
import GUI.cliente.*;
import GUI.clienteRegistrar;
import GUI.cliente.empresaRegistrar;
import GUI.moduloBuscar;
import conexion.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class panelTicket extends javax.swing.JPanel {

    /**
     * Creates new form panelCliente
     */
      moduloBuscar mbt;
      moduloBuscar mbs;
      moduloBuscar mba;
      
      // 0 = ticket, 1 = servicio, 2 = auto 
      int buscarTabla;
      
      // habilita modo crear o editar
      boolean modoCrear;
      
    public panelTicket() {
        initComponents();
        //incializa los paneles
        panelBuscar.setLayout(new java.awt.BorderLayout());
        
        //buscarTabla por defecto ticket. Modo por defecto editar
        buscarTabla=0;
        modoCrear = false;
        
        //titulos del buscar
        String [] titulosT = {"ID", "FECHACREACION", "FECHAFINALIZACION", "MATRICULA", "CLIENTE", "CANTIDADSERVICIOS"};
        String [] titulosS = {"ID", "NOMBRE", "PRECIO", "COMPLETADO", "DESCRIPCION" };
        String [] titulosA = {"MATRICULA", "MARCA", "MODELO", "AÑO", "CLIENTE", "CLIENTEID" };
        
        //inicializa modulo buscar
        mbt = new moduloBuscar("ticketFull", titulosT );
        mba = new moduloBuscar("autoFull", titulosA);
        mbs = new moduloBuscar("servicio", titulosS);
        
        
//        mba = new moduloBuscar("autoFull", titulosA);

    
        nombre.setEnabled(false);
        precio.setEnabled(false);
        desc.setEnabled(false);
        comple.setEnabled(false);
        
        panelBuscar.add(mbt);
         
        
        
        
        
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBuscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botizq = new javax.swing.JButton();
        botder = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        modoLabel = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        guar1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ticket = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comple = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        botcen = new javax.swing.JButton();

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Modo:");

        botizq.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        botizq.setText("Eliminar Seleccion");
        botizq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botizqActionPerformed(evt);
            }
        });

        botder.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        botder.setText("Editar Servicios");
        botder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botderActionPerformed(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        nuevo.setText("Nuevo Ticket");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        modoLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        modoLabel.setText("Editar");

        titulo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        titulo.setText("TICKETS");

        guar1.setText("Guardar Cambios");
        guar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guar1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Precio:");

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Completado:");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Id:");

        ticket.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ticket.setEnabled(false);
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });

        precio.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        nombre.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Ticket #:");

        id.setEditable(false);
        id.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        id.setEnabled(false);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");

        comple.setText("Si");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setText("Descripcion:");

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        botcen.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        botcen.setText("Facturar");
        botcen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botcenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(modoLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titulo)
                                .addGap(110, 110, 110)
                                .addComponent(nuevo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre)
                                    .addComponent(precio)
                                    .addComponent(comple)
                                    .addComponent(ticket, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(id)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(guar1)))
                .addGap(21, 21, 21)
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(479, Short.MAX_VALUE)
                .addComponent(botizq)
                .addGap(78, 78, 78)
                .addComponent(botcen)
                .addGap(76, 76, 76)
                .addComponent(botder)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botizq)
                            .addComponent(botder)
                            .addComponent(botcen))
                        .addGap(18, 18, 18)
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo)
                            .addComponent(nuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(modoLabel))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comple))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guar1)
                        .addGap(75, 75, 75))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private int validarInputs() {
        try {
           Integer.parseInt(ticket.getText());
           Float x = Float.parseFloat(precio.getText());
           
           if ( nombre.getText().equals("") || x < 0 ) {
               return 0;
           }
           
           return 1;
           
        }
        catch (Exception e) {
            
        }
        return 0;
    }
    
    
    private void cambiarModCre ( boolean modo ) {
        
        // si se quiere activar el modo crear
        if ( modo ) {
            modoCrear = true;
            modoLabel.setText("Crear");
            limpiar();
        }
        // si se quiere activar el modo editar 
        else {
            modoCrear = false;
            modoLabel.setText("Editar");
        }
        
    }
    
    private void cambiarModBus( int modo ) {
        
        //Si quita el panel actual
        panelBuscar.remove(0);
        
        // si ya esta el modo buscarCliente, se retorna al regular
        switch ( modo ) {
            // para los tickets
            case 0 : {
                
                buscarTabla = 0;
                botizq.setText("Eliminar Seleccion");
                botder.setText("Editar Servicios");
                botcen.setText("Facturar");

                panelBuscar.add(mbt);
                titulo.setText("TICKETS");
                
                //dactiva botones que se usan
                nuevo.setEnabled(true);
                botcen.setEnabled(true);
                
                nombre.setEnabled(false);
                precio.setEnabled(false);
                desc.setEnabled(false);
                comple.setEnabled(false);
                
                
                
               mbt.actualizarTabla();
               break;
            }
               
            // para los servicios
            case 1 : {
                buscarTabla = 1;
                botizq.setText("Eliminar Servicio");
                botder.setText("Editar Servicio");
                botcen.setText("Regresar a Tickets");
                nuevo.setText("Nuevo Servicio");
            
                panelBuscar.add(mbs);
                mbs.setCondicion("ticketId = " + ticket.getText() );
                titulo.setText("SERVICIOS");
                
                 nombre.setEnabled(true);
                precio.setEnabled(true);
                desc.setEnabled(true);
                comple.setEnabled(true);
                
                //dactiva botones que se usan
                nuevo.setEnabled(true);
                botcen.setEnabled(true);
            
                mbs.actualizarTabla();
                break;
            }
            // para buscar tabla
            case 2 : {
                buscarTabla = 2;
                botizq.setText("Cancelar Busqueda");
                botder.setText("Seleccionar Registro");
            
                panelBuscar.add(mba);
                titulo.setText("AUTOS");
                
                //desactiva botones que no se usan
                nuevo.setEnabled(false);
                botcen.setEnabled(false);
                
                
            
                mba.actualizarTabla();
                break;
                
            }
        } 
        
        panelBuscar.revalidate();
        
    }
    
    
    private void botizqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botizqActionPerformed
       
        switch ( buscarTabla ) {
            case 0 : {
                //obtiene seleccion
                String elim = mbt.getValores()[0];
                    
                //si no hay seleccion no hace nada
                if ( elim == "" ) {
                    System.out.println("No hay seleccion elim");
                    return;
                }
                
                // mensaje confirmacion
                int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere borrar el registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if ( reply == JOptionPane.YES_OPTION ) {
                    


                    if(Utils.eliminarTabla("ticket", "id= " + elim ) == 0) {
                        System.out.println("ELIM");
                        return;
                    }

                    limpiar();
                    mbt.actualizarTabla();
                    break;
                }
            }
            case 2: {
                //obtiene seleccion
                String elim = mbs.getValores()[0];
                    
                //si no hay seleccion no hace nada
                if ( elim == "" ) {
                    System.out.println("No hay seleccion elim");
                    return;
                }
                
                // mensaje confirmacion
                int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere borrar el registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if ( reply == JOptionPane.YES_OPTION ) {
                    


                    if(Utils.eliminarTabla("servicios", "id= " + elim ) == 0) {
                        System.out.println("ELIM");
                        return;
                    }

                    limpiar();
                    mbs.actualizarTabla();
                    break;
                }
            }
            case 3 : {
                cambiarModBus(0);
            }
        }
        
    }//GEN-LAST:event_botizqActionPerformed

    private void botderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botderActionPerformed
        // TODO add your handling code here:
        
       switch ( buscarTabla ) {
           case 0: {
               
               
             // Si no selecciona nada, no hace nada xd
               String ticketID = mbt.getValores()[0];
               if (ticketID == "" ) {
                   System.out.println("no hay ticket seleccionado");
                   return;
               }
               ticket.setText(ticketID);
           
               cambiarModBus( 1 );
               
                 
               break;
           }
           case 1: {
               
               String valores[] = mbs.getValores();
               if (valores[0] == "" ) {
                   System.out.println("no hay servicio seleccionado");
                   return;
               }
               
               String [] titulosS = {"ID", "NOMBRE", "PRECIO", "COMPLETADO", "DESCRIPCION" };
               id.setText(valores[0]);
               nombre.setText(valores[1]);
               precio.setText(valores[2]);
               comple.setSelected(valores[3].equals("1"));
               desc.setText(valores[4]);
               
               
               cambiarModCre(false);
               
               
              
           }
           
       }
        
     
    }//GEN-LAST:event_botderActionPerformed

    private void limpiar() {
        nombre.setText("");
        precio.setText("");
        id.setText("");
        comple.setSelected(false);
        desc.setText("");
    }

    
    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        
       switch (buscarTabla) {
           case 0 : {
               registrarNuevoT rt = new registrarNuevoT();
               rt.setVisible(true);
               break;
           }
           case 1 : {
               cambiarModCre(true);
               break;
           }
       }
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void guar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guar1ActionPerformed
        if(validarInputs() == 0) {
            System.out.println("validar inputs");
            return;
        }
        
        if(modoCrear) {
            
            String[] columnas = {"nombre","precio","descripcion","completado", "ticketId"},
                    valores = {"'" + nombre.getText() + "'", precio.getText(), 
                        "'"+desc.getText()+"'", comple.isSelected() ? "1": "0", ticket.getText()
                    };
            
            if (Utils.insertarTabla("servicio", columnas, valores) < 0 ) {
                System.out.print("NO SE INSERTO SERVICIO");
                return;
            }
            cambiarModCre(false);
            limpiar();
            mbs.actualizarTabla();
        }
        else {
            String valores = "nombre = '" + nombre.getText() + "', precio = "+ precio.getText() +", descripcion = '" + desc.getText() + "', completado = " + (comple.isSelected() ? "1": "0" ) + ", ticketId = " + ticket.getText(),
                   condicion = "id = " + id.getText() ;
            
            if (Utils.actualizarTabla("servicio", valores, condicion) < 0 ) {
                System.out.print("NO SE ACtualizo SERVICIO");
                return;
            }
            cambiarModCre(false);
            mbs.actualizarTabla();
        }
        

    }//GEN-LAST:event_guar1ActionPerformed

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketActionPerformed

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        
    }//GEN-LAST:event_idMouseClicked

    private void botcenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botcenActionPerformed
        // TODO add your handling code here:
        switch(buscarTabla) {
            case 0 : {
                
                String valores[] = mbt.getValores();
                if (valores[0] == "" ) {
                    System.out.println("No se selecciono nada");
                    return;
                }
                
                int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea facturar el ticket?\n"
                        + "A menos que cancele la factura, no podrá editar los servicios.", "Confirmación", JOptionPane.YES_NO_OPTION);
                if ( reply == JOptionPane.YES_OPTION ) {
                    
                    facturarT ft = new facturarT();
                    ft.setVisible(true);
                    ft.setNumTick(valores[0]);
                    
                }
                break;
            }
            case 1 : {
                cambiarModBus(0);
            }
            
        }
    }//GEN-LAST:event_botcenActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed



    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botcen;
    private javax.swing.JButton botder;
    private javax.swing.JButton botizq;
    private javax.swing.JCheckBox comple;
    private javax.swing.JTextArea desc;
    private javax.swing.JButton guar1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modoLabel;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField ticket;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
