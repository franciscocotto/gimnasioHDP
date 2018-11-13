package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionJDBC {
    Connection conexion = null;
    String db= "Gimnasio";
    String host = "localhost";
    String port = "5432";
    String user  = "admin";
    String pass = "admin";
    
    
    String  driverDb = "org.postgresql.Driver";
    String url="jdbc:postgresql://" + host + ":" + port + "/" +db;
    
    
    public Connection conectar(){
        try{
            Class.forName(driverDb);
             conexion = DriverManager.getConnection(url, user, pass);
             if(!conexion.isClosed()){
                 System.out.println("Error @" + db);               
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

