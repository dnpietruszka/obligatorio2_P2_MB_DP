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
public class Resultado implements Serializable{
    
    private boolean resultado;
    private int totalMinutos;
    private int totalPuntos;
    
    public Resultado(){
        this.setTotalMinutos(0);
        this.setTotalPuntos(0);
    }

    public boolean isResultado() {
        return resultado;
    }
    
    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public int getTotalMinutos() {
        return totalMinutos;
    }

    public void setTotalMinutos(int totalMinutos) {
        this.totalMinutos = totalMinutos;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public String verificarResultado (String lineaEquipo, String lineaOficial){
        
        if(lineaEquipo.trim().equals(lineaOficial)){
            return "correcto";
        } else {
            if(lineaEquipo.trim().equalsIgnoreCase(lineaOficial)){
                return "error-formato";
            }
        }
        return "incorrecto";
    }
}
