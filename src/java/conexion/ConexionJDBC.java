package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionJDBC {
    Connection conexion = null;
    String db= "gimnasio";
    String host = "localhost";
    String port = "5432";
    String user  = "postgres";
    String pass = "1234";
    
    
    String  driverDb = "org.postgresql.Driver";
    String url="jdbc:postgresql://" + host + ":" + port + "/" +db;
    
    
    public Connection conectar(){
        try{
            Class.forName(driverDb);
             conexion = DriverManager.getConnection(url, user, pass);
             if(!conexion.isClosed()){
                 System.out.println("Exito Conexion");               
             }
             return conexion;
        } catch (ClassNotFoundException | SQLException ex){
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
        
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
}

