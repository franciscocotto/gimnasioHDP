/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.ConexionJDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author Angel Cotto
 */
public class addMembresias {
    
    
      
       public void agrega(Membresias membresia){
            ConexionJDBC con = new ConexionJDBC();    
            con.conectar();
            String sql = "INSERT INTO public.membresia (nombremembresia,descripcion,costo,beneficios)"+"VALUES(?,?,?,?)";
            String status = "";
            try(PreparedStatement pst = con.getConexion().prepareStatement(sql)){
                pst.setString(1, membresia.nombre);
                pst.setString(2, membresia.descripcion);
                pst.setString(3, membresia.costo);
                pst.setString(4, Arrays.toString(membresia.beneficios).replaceAll("\\[([^\\]]+)\\]", "$1"));
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
       
        public void edita(Membresias membresia){
            ConexionJDBC con = new ConexionJDBC();    
            con.conectar();
            String sql = "UPDATE public.membresia SET  nombremembresia=?,descripcion=?,costo=?,beneficios=?\n" +
            "WHERE  id_membresia="+membresia.codigo+";";
            String status = "";
            try(PreparedStatement pst = con.getConexion().prepareStatement(sql)){
                pst.setString(1, membresia.nombre);
                pst.setString(2, membresia.descripcion);
                pst.setString(3, membresia.costo);
                pst.setString(4, Arrays.toString(membresia.beneficios).replaceAll("\\[([^\\]]+)\\]", "$1"));            
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
       
       
      public void elimina(Membresias membresia) throws SQLException{
            ConexionJDBC con = new ConexionJDBC();    
            con.conectar();
            Statement stmt = con.conectar().createStatement();
            stmt.execute("DELETE FROM public.membresia WHERE id_membresia="+membresia.codigo+";"); 
            
            
       }
    
    
    
    
}
