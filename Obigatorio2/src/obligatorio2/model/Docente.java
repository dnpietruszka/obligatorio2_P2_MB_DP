/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

import java.io.Serializable;

/**
 *
 * @author matias
 */
public class Docente extends Persona implements Serializable {
    private int anioIngreso;
    
    public Docente (String nombre, String cedula, String mail, int añoIngreso){
        super(nombre, cedula, mail);
        this.anioIngreso = anioIngreso;
    }
    
    public int getAñoIngreso(){
        return anioIngreso;
    }
    
    public void setAñoIngreso(int añoIngreso){
        this.anioIngreso = añoIngreso;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
}
