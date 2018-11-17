/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel Cotto
 */
public class Cliente {
    Integer codigo;
    String nombre;
    String apellido;
    Integer edad;
    String dui;
    String nit;
    String sexo;
    String ingreso;
    Integer membresia;

   public Cliente() {
       
    }
   
    public Cliente(Integer codigo, String nombre, String apellido, Integer edad, String dui, String nit, String sexo, String ingreso, Integer membresia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dui = dui;
        this.nit = nit;
        this.sexo = sexo;
        this.ingreso = ingreso;
        this.membresia = membresia;
    }
    
    
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String nacimiento) {
        this.ingreso = nacimiento;
    }

    public Integer getMembresia() {
        return membresia;
    }

    public void setMembresia(Integer membresia) {
        this.membresia = membresia;
    }
    
        public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
    
}
