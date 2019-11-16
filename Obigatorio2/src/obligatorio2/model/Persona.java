/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public abstract class Persona implements Serializable{
    
    private String nombre;
    private String cedula;
    private String mail;
    
    public Persona(String nombre, String cedula, String mail){
        this.nombre = nombre;
        this.cedula = cedula;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getMail(){
        return mail;
    }
    
    public void setMail(String mail){
        this.mail = mail;
    }
    
}
