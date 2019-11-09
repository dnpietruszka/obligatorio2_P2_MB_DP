/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

/**
 *
 * @author diego
 */
public class Estudiante extends Persona {
    
    private int numero;
    private int semestre;
    
    
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
    
    @Override
    public boolean equals(Object e){
        return this.getCedula().equals(((Estudiante)e).getCedula());
    }
    
}
