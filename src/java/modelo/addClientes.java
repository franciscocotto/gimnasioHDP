/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.ConexionJDBC;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;



public class addClientes {
  
       public void agrega(Cliente cliente){
            ConexionJDBC con = new ConexionJDBC();    
            con.conectar();
            String sql = "INSERT INTO public.\"Cliente\" (nombre,apellidos,dui,nit,sexo,fechanacimiento,membresia)"+"VALUES(?,?,?,?,?,?,?)";
            String status = "";
            try(PreparedStatement pst = con.getConexion().prepareStatement(sql)){
                pst.setString(1, cliente.nombre);
                pst.setString(2, cliente.apellido);
                pst.setString(3, cliente.dui);
                pst.setString(4, cliente.nit);
                pst.setString(5, cliente.sexo);
                pst.setString(6, cliente.nacimiento);
                pst.setString(7, cliente.membresia);
                int i = pst.executeUpdate();
                if (i != 0) {
                    status = "Guardado";
                } else {
                    status = "No Guardado";
                 }
                con.conectar().close();
 
            } catch (SQLException ex) {
                ex.printStackTrace();         
        }
            
            
       }
       
         public void edita(Cliente cliente){
            ConexionJDBC con = new ConexionJDBC();    
            con.conectar();
            String sql = "UPDATE public.\"Cliente\"\n" +
            "SET  nombre=?, apellidos=?, dui=?, nit=?, sexo=?, fechanacimiento=?, membresia=?\n" +
            "WHERE  id_campo="+cliente.codigo+";";
            String status = "";
            try(PreparedStatement pst = con.getConexion().prepareStatement(sql)){
                pst.setString(1, cliente.nombre);
                pst.setString(2, cliente.apellido);
                pst.setString(3, cliente.dui);
                pst.setString(4, cliente.nit);
                pst.setString(5, cliente.sexo);
                pst.setString(6, cliente.nacimiento);
                pst.setString(7, cliente.membresia);
                int i = pst.executeUpdate();
                 if (i != 0) {
                    status = "Editado";
                } else {
                    status = "No Editado";
                 }
                con.conectar().close();
 
            } catch (SQLException ex) {
                ex.printStackTrace();         
        }
            
            
            
       }
      
       public void elimina(Cliente cliente) throws SQLException{
            ConexionJDBC con = new ConexionJDBC();    
            con.conectar();
            Statement stmt =  con.conectar().createStatement();
            stmt.execute( "DELETE FROM public.\"Cliente\"\n" +
           "WHERE  id_campo="+cliente.codigo+";");             
            
       }
          
        
}
   


    
    

