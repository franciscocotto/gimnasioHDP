/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.ConexionJDBC;
import java.util.ArrayList;
import java.util.List;


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
                        + "VALUES(?,?,?,?,?,?,?)";
            usuario.add(cliente);
       }

          
        
}
   


    
    

