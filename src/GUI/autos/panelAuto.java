/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.autos;

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
public class panelAuto extends javax.swing.JPanel {

    /**
     * Creates new form panelCliente
     */
      moduloBuscar mba;
      moduloBuscar mbc;
      moduloBuscar mbm;
      String modeloId;
      
      boolean modoCrear = false;
      // 0 = auto, 1 == cliente
      int buscarTabla = 0;
      
    public panelAuto() {
        initComponents();
        //incializa los paneles
        panelBuscar.setLayout(new java.awt.BorderLayout());
        
        //titulos del buscar
        String [] titulosC = {"ID", "NOMBRE", "NUMERO", "TIPO", "EDAD", "CEDULA", "RUC", "CREDITO", "DIRECCION"};
        String [] titulosA = {"MATRICULA", "MARCA", "MODELO", "AÑO", "CLIENTE", "CLIENTEID", "MODELOID" };
        String [] titulosM = {"ID", "NOMBRE", "MARCA", "MARCAID"};
        
        //inicializa modulo buscar
        mbc = new moduloBuscar("clienteFull", titulosC );
        
        matri.setEnabled(false);
        
        mba = new moduloBuscar("autoFull", titulosA);
        mbm = new moduloBuscar("modeloFull", titulosM);
        
        
        panelBuscar.add(mba);
        
        
        
 
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
        guar = new javax.swing.JButton();
        nuevoA = new javax.swing.JButton();
        modoLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        matri = new javax.swing.JTextField();
        anyo = new javax.swing.JTextField();
        mar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
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
        botder.setText("Editar Seleccion");
        botder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botderActionPerformed(evt);
            }
        });

        guar.setText("Guardar Cambios");
        guar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guarActionPerformed(evt);
            }
        });

        nuevoA.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        nuevoA.setText("Nuevo Auto");
        nuevoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAActionPerformed(evt);
            }
        });

        modoLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        modoLabel.setText("Editar");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Dueño:");

        matri.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        matri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriActionPerformed(evt);
            }
        });

        anyo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        mar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        mar.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Matricula:");

        cliente.setEditable(false);
        cliente.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setText("Modelo: ");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setText("Año:");

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setText("Marca:");

        modelo.setEditable(false);
        modelo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeloMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel1.setText("AUTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(matri)
                                .addComponent(anyo)
                                .addComponent(mar)
                                .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(guar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(modoLabel)))))
                .addGap(76, 76, 76)
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(nuevoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botizq)
                .addGap(184, 184, 184)
                .addComponent(botder)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botizq)
                    .addComponent(botder)
                    .addComponent(nuevoA)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(modoLabel))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(matri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(anyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(mar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(guar))
                    .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private int validarInputs() {
        try {
           Integer.parseInt(anyo.getText());
           Integer.parseInt(cliente.getText());
           
           if ( matri.getText().equals("") || modelo.getText().equals("") || mar.getText().equals("")  ) {
               return 0;
           }
           
           return 1;
           
        }
        catch (Exception e) {
            
        }
        return 0;
    }
    
    private void cambiarModBus( int modo ) {
        
        //Si quita el panel actual
        panelBuscar.remove(0);
        
        // si ya esta el modo buscarCliente, se retorna al regular
        switch ( modo ) {
            case 0 : {
                
                buscarTabla = 0;
                botizq.setText("Eliminar Seleccion");
                botder.setText("Editar Seleccion");

                panelBuscar.add(mba);

               mba.actualizarTabla();
               break;
            }
               
            
            case 1 : {
                buscarTabla = 1;
                botizq.setText("Cancelar Busqueda");
                botder.setText("Seleccionar Cliente");
            
                panelBuscar.add(mbc);
            
                mbc.actualizarTabla();
                break;
            }
            case 2 : {
                buscarTabla = 2;
                botizq.setText("Cancelar Busqueda");
                botder.setText("Seleccionar Modelo");
                
                panelBuscar.add(mbm);
                
                mbm.actualizarTabla();
            }
        } // de lo contrario se activa
        
        panelBuscar.revalidate();
        
    }
    
    
    private void botizqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botizqActionPerformed
        // Si se busca un cliente en este momento, sera un boton cancelara este modo
        if ( buscarTabla > 0 ) {
            cambiarModBus( 0 );
            
        }
        // De lo contrario, eliminara la seleccion
        else {
            int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere borrar el registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if ( reply == JOptionPane.YES_OPTION ) {
                String elim = mba.getValores()[0];


                if(Utils.eliminarTabla("auto", "matricula = '"+ elim +"'") == 0) {
                    System.out.println("ELIM");
                }

                limpiar();
                mba.actualizarTabla();

            }
            
            
        }
        
    }//GEN-LAST:event_botizqActionPerformed

    private void botderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botderActionPerformed
        // TODO add your handling code here:
        // Si se busca un cliente, se pone en el campo su id
       switch ( buscarTabla ) {
           case 0: {
               
               String valores [] = mba.getValores();
               //Si no selecciona nada, no hace nada ex
               if(valores[0] == "") {
                   System.out.println("No hay nada selec");
                   return;
               }
               
               //pone la tabla en modo editar
               modoCrear = false;
               modoLabel.setText("Editar");
               
               //pone la matricula que no se pueda cambiar
               matri.setText(valores[0]);
               matri.setEnabled(false);
               
               mar.setText(valores[1]);
               modelo.setText(valores[2]);
               anyo.setText(valores[3]);
               cliente.setText(valores[5]);
               
                 
               break;
           }
           case 1: {
               // Si no selecciona nada, no hace nada xd
               if (mbc.getValores()[0] == "" ) {
                   System.out.println("NO SE PUEDE XD");
               }
               
               String id = mbc.getValores()[0];
               cliente.setText(id);
           
               cambiarModBus( 0 );
           }
           case 2 : {
               if (mbm.getValores()[0] == "" ) {
                   System.out.println("NO SE PUEDE XD");
               }
               
               String [] valores = mbm.getValores();
               modelo.setText(valores[ 1]);
               modeloId = valores[0];
               mar.setText(valores[2]);
           
               cambiarModBus( 0 );
           }
           
       }
        
     
    }//GEN-LAST:event_botderActionPerformed

    private void limpiar() {
        matri.setText("");
        modelo.setText("");
        anyo.setText("");
        cliente.setText("");
        mar.setText("");
    }

    
    private void guarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guarActionPerformed

        if ( validarInputs() == 0 ) {
            System.out.println("Datos incorrectos");
            return;
        }
        //Si se esta craendo un nuevo registro
        if (modoCrear) {
            
           
            String columnas[] = {"matricula", "modeloId", "anyo", "clienteId"};
            String valores[] = {"'"+matri.getText()+"'", modeloId , anyo.getText() , cliente.getText()};
            
            if(Utils.insertarTabla("auto", columnas, valores) < 0 ) {
                System.out.println("algo no se inserto");
                return;
            }
            limpiar();
            cambiarModBus(0);
           
        }
        
        //Si se esta editando
        else {
            
            String valores = "modeloId = " + modeloId
                   + ", anyo =" + anyo.getText() + ", clienteId = " + cliente.getText();
           
           String condicion = "matricula = '" +  matri.getText() +  "'";
           
           if (Utils.actualizarTabla("auto", valores, condicion) == 0) {
               System.out.println ("error al update");
               return;
           };
           
           limpiar();
           
           cambiarModBus(0);
            
        }

            
        
        
        
    }//GEN-LAST:event_guarActionPerformed

    private void nuevoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAActionPerformed
        modoCrear = true;
        modoLabel.setText("Crear");
        matri.setEnabled(true);
    }//GEN-LAST:event_nuevoAActionPerformed

    private void matriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriActionPerformed

    private void clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseClicked
        cambiarModBus(1);
    }//GEN-LAST:event_clienteMouseClicked

    private void modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeloMouseClicked
        cambiarModBus(2);
    }//GEN-LAST:event_modeloMouseClicked



    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anyo;
    private javax.swing.JButton botder;
    private javax.swing.JButton botizq;
    private javax.swing.JTextField cliente;
    private javax.swing.JButton guar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mar;
    private javax.swing.JTextField matri;
    private javax.swing.JTextField modelo;
    private javax.swing.JLabel modoLabel;
    private javax.swing.JButton nuevoA;
    private javax.swing.JPanel panelBuscar;
    // End of variables declaration//GEN-END:variables
}
