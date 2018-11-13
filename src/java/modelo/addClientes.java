/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.ConexionJDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Angel
 */
public class addClientes {
    List<Cliente> usuario = new ArrayList<>();
    
    public addClientes(){
        if(usuario==null){
            usuario = new ArrayList();     
        }
    }  
        
       public void agrega(Cliente cliente){
            ConexionJDBC con = new ConexionJDBC();    
            con.conectar();
            String sql = "INSERT INTO Cliente(id_cliente, nombre, apellidos, dui, nit,fechanacimiento, membresia)"
                        + "VALUES(1,hola,adios,milagro,prueba,esta,g)";
            try(PreparedStatement pst = con.getConexion().prepareStatement(sql)){
                  usuario.add(cliente);
            } catch (SQLException ex) {
            Logger.getLogger(addClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
       }

          
        
}
   


    
    

