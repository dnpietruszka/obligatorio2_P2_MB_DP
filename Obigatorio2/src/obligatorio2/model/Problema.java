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
