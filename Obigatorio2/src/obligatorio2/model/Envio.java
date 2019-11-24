/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Envio implements Serializable{
    
    private Equipo equipo;
    private Problema problema;
    private Resultado resultado;
    private int tiempo;
    private String lenguaje;
    
    public Envio(Equipo e, Problema p, Resultado resultado, int tiempo, String lenguaje){
        this.setEquipo(e);
        this.setResultado(resultado);
        this.setProblema(p);
        this.setTiempo(tiempo);
        this.setLenguaje(lenguaje);
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
