/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {
    
    public static String hashear (String ori) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        

        // Change this to UTF-16 if needed
        md.update(ori.getBytes(StandardCharsets.UTF_8));
        byte[] digest = md.digest();

        String hex = String.format("%064x", new BigInteger(1, digest));
        
        System.out.println(ori);
        System.out.println(hex);
        return hex;
    
    } 
    
    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
      public static DefaultTableModel queryTabla( String nombreT, String [] columnas, String buscar, int condicion, String id  ) {
      DefaultTableModel tabla = new DefaultTableModel();
      int numCol = columnas.length;
      try {
          String tsql = "select * from " + nombreT + " where "+ columnas[condicion] +" like '%" + buscar + "%'" ;
          tsql += " and " + id;
          System.out.println(tsql);
          Conexion conex = new Conexion();
          ResultSet res;
          Statement st = null;
          Connection conn = conex.getConexion();
          
          st = conn.createStatement();
          res = conex.Listar(tsql);
          
          
          tabla.setColumnIdentifiers(columnas);
          
          while (res.next()) {
              Object obj[] = new Object[numCol];
              for( int i = 0 ; i < numCol ; i ++) {
                  obj[i] = res.getString( columnas[i] );
              }
              tabla.addRow(obj);
          }
          
          
          
      }
      catch (Exception e) {
          
      }
      
      
      return tabla;
  }
    
  
    public static DefaultTableModel queryTabla( String nombreT, String [] columnas, String buscar, int condicion  ) {
      DefaultTableModel tabla = new DefaultTableModel();
      int numCol = columnas.length;
      try {
          String tsql = "select * from " + nombreT + " where "+ columnas[condicion] +" like '%" + buscar + "%'" ;
          System.out.println(tsql);
          Conexion conex = new Conexion();
          ResultSet res;
          Statement st = null;
          Connection conn = conex.getConexion();
          
          st = conn.createStatement();
          res = conex.Listar(tsql);
          
          
          tabla.setColumnIdentifiers(columnas);
          
          while (res.next()) {
              Object obj[] = new Object[numCol];
              for( int i = 0 ; i < numCol ; i ++) {
                  obj[i] = res.getString( columnas[i] );
              }
              tabla.addRow(obj);
          }
          
          
          
      }
      catch (Exception e) {
          System.out.println(e);
      }
      
      
      return tabla;
  }
    
  public static DefaultTableModel queryTabla( String nombreT, String [] columnas ) {
      DefaultTableModel tabla = new DefaultTableModel();
      int numCol = columnas.length;
      try {
          String tsql = "select * from " + nombreT ;
          Conexion conex = new Conexion();
          ResultSet res;
          Statement st = null;
          Connection conn = conex.getConexion();
          
          st = conn.createStatement();
          res = conex.Listar(tsql);
          
          
          tabla.setColumnIdentifiers(columnas);
          
          while (res.next()) {
              Object obj[] = new Object[numCol];
              for( int i = 0 ; i < numCol ; i ++) {
                  obj[i] = res.getString( columnas[i] );
              }
              tabla.addRow(obj);
          }
          
          
          
      }
      catch (Exception e) {
          
      }
      
      return tabla;
  }
  
  public static int actualizarTabla ( String nombreT, String valores, String id ) {
      int band = 0;
      Conexion conex = new Conexion();
      int rs;
      Statement st = null;
      Connection conn = conex.getConexion();
      
      String consulta = "Update "+ nombreT + " set " + valores + " where " + id ;
      
      System.out.println(consulta);
      
      
 
      try {
          st = conn.createStatement();
          rs = st.executeUpdate(consulta);
          if ( rs==1 ) {
              band=1;
          }
      }
      catch (Exception owo) {
          System.out.println(owo.getMessage());
          
      }
      return band;
  
  } 
  
  public static int eliminarTabla( String nombreT, String condicion) {
      
       int band = 0;
      Conexion conex = new Conexion();
      int rs;
      Statement st = null;
      Connection conn = conex.getConexion();
      
      String consulta = "delete from "+ nombreT + " where " + condicion ;
      
      System.out.println(consulta);
      
      
 
      try {
          st = conn.createStatement();
          rs = st.executeUpdate(consulta);
          if ( rs==1 ) {
              band=1;
          }
      }
      catch (Exception owo) {
          System.out.println(owo.getMessage());
          
      }
      return band;
      
      
  }
  
  public static int insertarTabla ( String nombreT, String columnas [], String valores[] ) {
      int band = -1;
      Conexion conex = new Conexion();
      int rs;
      Statement st = null;
      Connection conn = conex.getConexion();
      
      String consulta = "Insert into "+ nombreT + " (" ;
      
      for (int i = 0; i < columnas.length; i++) {
          if ( i > 0 ) {
               consulta += ", ";
          }
           consulta += columnas[i];
      }
      consulta+=") values (";
      
      for (int i = 0; i < valores.length; i++) {
          if ( i > 0 ) {
               consulta += ", ";
          }
           consulta += valores[i];
          
      }
      consulta+=")";
      
      
      
 
      try {
          st = conn.createStatement();
          rs = st.executeUpdate(consulta, Statement.RETURN_GENERATED_KEYS);
          if ( rs==1 ) {
              band = 0;
            try (ResultSet llave = st.getGeneratedKeys()) {
                if (llave.next()) {
                   band = llave.getInt(1);
               }
            }
              
          }
          
      }
      catch (Exception owo) {
          System.out.println(owo.getMessage());
          
      }
      return band;
  
  } 
}
