/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wendy
 */
public class dao {
    final String user="root";
    final String pass="12345";
    final String driver="com.mysql.jdbc.Driver";
    final String url="jdbc:mysql://localhost:3305/safp";
    
    public Connection conecta(){
        Connection  con=null;
        try {
            Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de driver: "+ex.getMessage());
        
        }catch (SQLException ex){
            System.out.println("Error de mysql: "+ex.getMessage());
        }
        return con;
    }
}
