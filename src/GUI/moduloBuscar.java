/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import conexion.Conexion;
import java.sql.Connection;
import conexion.Utils;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class moduloBuscar extends javax.swing.JPanel {

    /**
     * Creates new form prueba
     */
    
    private String nombreT;
    private String [] columnas;
    private int numCol;
    public String [] seleccion;
    
    
    public moduloBuscar(String nombreT, String[] columnas) {
        initComponents();
        
        tabla.getTableHeader().setReorderingAllowed(false);
        this.nombreT = nombreT;
        this.columnas = columnas;
        this.numCol = columnas.length;
        this.seleccion = new String[numCol];
        
        
        
       tabla.setModel(Utils.queryTabla(nombreT, columnas, "", 0));
       
       
       
       DefaultComboBoxModel modelo = new DefaultComboBoxModel();
       
       for ( int i = 0; i < numCol; i ++) {
           modelo.addElement(columnas[i]);
       }
       
       lista.setModel(modelo);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lista = new javax.swing.JComboBox<>();
        boton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Buscar por:");

        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "la opcion1", "la opcion2", "la opcion 3" }));

        boton.setText("Buscar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(boton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public String[] getValores () {
         
        for (int i = 0; i < this.numCol; i++ ) {
 
            try {
                seleccion[i] = tabla.getModel().getValueAt( tabla.getSelectedRow(), i).toString();
            }
            catch (Exception e) {
                seleccion[i] = "";
            }
            
            
        }
        return seleccion;
    }
    
    public void actualizarTabla() {
     tabla.setModel(Utils.queryTabla(nombreT, columnas, input.getText(), lista.getSelectedIndex()));   
    }
    
    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        
        actualizarTabla();
        
    }//GEN-LAST:event_botonActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}