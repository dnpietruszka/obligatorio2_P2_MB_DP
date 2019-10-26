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
public class Estudiante {
    
    private String nombre;
    private long CI;
    private String mail;
    private int numero;
    private int semestre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCI() {
        return CI;
    }

    public void setCI(long CI) {
        this.CI = CI;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
        return this.CI == ((Estudiante)e).getCI();
    }
    
}
