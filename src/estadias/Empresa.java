/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadias;

/**
 *
 * @author endfox
 */
public class Empresa {
    
    private String nombre;
    private String direccion;
    
    public Empresa(String nombre,String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
}
