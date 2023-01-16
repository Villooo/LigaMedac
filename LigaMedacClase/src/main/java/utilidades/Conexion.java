/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Víctor
 */
public class Conexion {
    
  private Connection conectar;
  private String host;
  private String user;
  private String password;
    
    public Connection conectar() throws SQLException, ClassNotFoundException{
        host = "localhost:3306/ligamedac";
        user = "root";
        password = "12341234ABC";
        Class.forName("com.mysql.jdbc.Driver");
        
        conectar = DriverManager.getConnection("jdbc:mysql://" + host + "?"+ "user=" + user + "&password=" + password );
        return conectar;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
