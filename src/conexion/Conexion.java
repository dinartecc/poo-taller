/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LABA
 */
public class Conexion {
    public Connection getConexion(){
        try{
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                                   "Databasename= tallerpoo; " +
                                   "user=sa; password=123; ";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return (DriverManager.getConnection (connectionUrl));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
    }
    public ResultSet Listar (String sql){
        Statement st =null;
        ResultSet rs = null;
        
        try {
            Connection conn = this.getConexion();
            st =conn.createStatement();
            rs=st.executeQuery(sql);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    return rs;
    }
}
