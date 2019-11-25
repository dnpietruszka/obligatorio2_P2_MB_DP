/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author diego
 */
public class Problema implements Serializable {
   
    private String titulo;
    private String descripcion;
    private String link;
    private Docente docente;
    
    public Problema(String titulo, String descripcion, String link, Docente d){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.link = link;
        this.docente = d;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    public HashMap<String, Object> getResultadoProblema(ArrayList<Envio> listaEnvios){
        HashMap<String, Object> retorno = new HashMap<String, Object>();
        boolean resultadoCorrecto = false;
        int puntos = 0;
        int minutos = 0;
        boolean hayIncorrectos = false;
        for(int i = 0; i < listaEnvios.size(); i++){
            if(listaEnvios.get(i).getProblema().equals(this)){
                Envio e = listaEnvios.get(i);
                if(e.getResultado().isResultado()){
                    resultadoCorrecto = true;
                    puntos = 1;
                    if(hayIncorrectos){
                        minutos = e.getTiempo() + 20;
                    } else {
                        minutos = e.getTiempo();
                    }
                } else {
                    hayIncorrectos = true;
                }
            }
        }
        retorno.put("resultado", resultadoCorrecto);
        retorno.put("minutos", minutos);
        retorno.put("puntos", puntos);
        return retorno;
    }
    
    public ArrayList<Envio> getEnviosProblema(ArrayList<Envio> listaEnvios, Problema p){
        ArrayList<Envio> listaRetorno = new ArrayList<Envio>();
        for (int i = 0; i < listaEnvios.size(); i++){
            Problema problemaListaEnvio = listaEnvios.get(i).getProblema();
            if(this.equals(problemaListaEnvio)){
                Envio envio = listaEnvios.get(i);
                listaRetorno.add(envio);
            }
        }
        return listaRetorno;
    }
    
    @Override
    public String toString(){
        return this.getTitulo();
    }
    
    @Override
    public boolean equals(Object e){
        return this.getTitulo().equals(((Problema)e).getTitulo());
    }
}
