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
public class Estudiante extends Persona implements Serializable {
    
    private int numero;
    private int semestre;
    private Equipo equipo;
    
    
    public Estudiante(String nombre, String cedula, String mail, int numero, int semestre){
        super(nombre, cedula, mail);
        this.numero = numero;
        this.semestre = semestre;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    @Override
    public boolean equals(Object e){
        return this.getCedula().equals(((Estudiante)e).getCedula());
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
    
}
