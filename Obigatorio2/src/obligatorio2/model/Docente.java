/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

/**
 *
 * @author matias
 */
public class Docente extends Persona {
    private int añoIngreso;
    
    public Docente (String nombre, String cedula, String mail, int añoIngreso){
        super(nombre, cedula, mail);
        this.añoIngreso = añoIngreso;
    }
    
    public int getAñoIngreso(){
        return añoIngreso;
    }
    
    public void setAñoIngreso(int añoIngreso){
        this.añoIngreso = añoIngreso;
    }
}
