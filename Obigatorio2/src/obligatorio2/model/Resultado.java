/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

import java.io.Serializable;
import obligatorio2.utils.ArchivoLectura;

/**
 *
 * @author diego
 */
public class Resultado implements Serializable{
    
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
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
