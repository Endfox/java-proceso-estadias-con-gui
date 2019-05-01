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
public class Alumno {
    
    protected String nombre;
    protected String apellidos;
    protected String carrera;
    protected String especialidad;
    protected String matricula;
    protected Empresa empresa;
    
    public Alumno(String nombre, String apellidos,String carrera, String especialidad,
                    String matricula, Empresa empresa){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.especialidad = especialidad;
        this.matricula = matricula;
        this.empresa = empresa;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Empresa getEmpresa(){
        return (Empresa) this.empresa;
    }
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
    public String getCarrera(){
        return this.carrera;
    }
   
}
