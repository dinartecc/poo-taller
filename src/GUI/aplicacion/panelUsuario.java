/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.aplicacion;

import java.security.SecureRandom;
import GUI.moduloBuscar;
import conexion.Utils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class panelUsuario extends javax.swing.JPanel {

    /**
     * Creates new form panelUsuario
     */
    
    
    boolean modoCrear;
    moduloBuscar  mbu;
    public panelUsuario() {
        initComponents();
        panelBuscar.setLayout(new java.awt.BorderLayout());
        String [] titulosU = {"USUARIO"};
        
        modoCrear=false;
        usuario.setEnabled(false);
        
        //inicializa modulo buscar
        mbu = new moduloBuscar("usuario", titulosU );
        panelBuscar.add(mbu);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        botizq = new javax.swing.JButton();
        botder = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        modoLabel = new javax.swing.JLabel();
        guar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel1.setText("USUARIOS");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setText("Confirmar contraseña:");

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel5.setText("Modo:");

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

        nuevo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        nuevo.setText("Nuevo Usuario");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        modoLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        modoLabel.setText("Editar");

        guar.setText("Guardar Cambios");
        guar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guarActionPerformed(evt);
            }
        });

        jLabel6.setText("Longitud de al menos 6 caracteres.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(contra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(usuario, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guar)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(modoLabel))
                                    .addComponent(jLabel1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botizq)
                        .addGap(184, 184, 184)
                        .addComponent(botder)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botizq)
                    .addComponent(botder)
                    .addComponent(nuevo)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(modoLabel))
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(guar)
                        .addGap(52, 52, 52))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    
    
    public int validarInputs() {
  
        String getcont = new String(contra.getPassword()),
                getconf = new String(confirm.getPassword());
        
        System.out.println(getcont);
        System.out.println(getconf);
        System.out.println(usuario.getText().equals(""));
        System.out.println(usuario.getText().contains(" "));
        System.out.println(getcont.length() < 6);
        System.out.println(!getcont.equals(getconf));
        
        if(usuario.getText().equals("") || usuario.getText().contains(" ") || getcont.length() < 6 || !getcont.equals(getconf) ) {
            return 0;
        }
        return 1;
    }
    
    public void limpiar() {
        contra.setText("");
        confirm.setText("");
        usuario.setText("");
    }
        
    
    private void botizqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botizqActionPerformed
        // Si se busca un cliente en este momento, sera un boton cancelara este modo
        
            String elim = mbu.getValores()[0];
            if (elim == "") {
                
                    System.out.println("nada");
                
                return;
            }
            
            if (elim.equals("admin")) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar admin");
                return;
            }
        
            int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere borrar el registro?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if ( reply == JOptionPane.YES_OPTION ) {
            

                if(Utils.eliminarTabla("usuario", "usuario= '"+ elim +"'") == 0) {
                    System.out.println("ELIM");
                    return;
                }

                limpiar();
                mbu.actualizarTabla();

        }

    }//GEN-LAST:event_botizqActionPerformed

    private void botderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botderActionPerformed
        // TODO add your handling code here:
        
   
        String valores [] = mbu.getValores();
        //Si no selecciona nada, no hace nada ex
        if(valores[0] == "") {
            System.out.println("No hay nada selec");
            return;
        }

        //pone la tabla en modo editar
        modoCrear = false;
        modoLabel.setText("Editar");
        
        
        limpiar();
        usuario.setText(valores[0]);
        usuario.setEnabled(false);

        
    }//GEN-LAST:event_botderActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        modoCrear = true;
        modoLabel.setText("Crear");
        
        limpiar();
        usuario.setEnabled(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void guarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guarActionPerformed

        if ( validarInputs() == 0 ) {
            JOptionPane.showMessageDialog(null, "Verifique sus datos");
            contra.setText("");
            confirm.setText("");
            return;
        }
        //Si se esta craendo un nuevo registro
        if (modoCrear) {

            String getcont = new String(contra.getPassword());
            
            
            String columnas[] = {"usuario", "contrasena"};
            String hashed;
            try {
                hashed = Utils.hashear(getcont);
            } catch (NoSuchAlgorithmException ex) {
                return;
            }
            
            String valores[] = {"'"+usuario.getText()+"'", "'"+ hashed +"'" };

            if(Utils.insertarTabla("usuario", columnas, valores) < 0 ) {
                System.out.println("algo no se inserto");
                return;
            }
            limpiar();
            

        }

        //Si se esta editando
        else {
            String getcont = new String(contra.getPassword());
            String hashed;
            try {
                hashed = Utils.hashear(getcont);
            } catch (NoSuchAlgorithmException ex) {
                return;
            }
            String valores = "contrasena = '" + hashed +"'";

            String condicion = "usuario = '" +  usuario.getText() +  "'";

            if (Utils.actualizarTabla("usuario", valores, condicion) == 0) {
                System.out.println ("error al update");
                return;
            };

            limpiar();

        }

    }//GEN-LAST:event_guarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botder;
    private javax.swing.JButton botizq;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JPasswordField contra;
    private javax.swing.JButton guar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel modoLabel;
    private javax.swing.JButton nuevo;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
