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
public class Problema {
    
    
    private String titulo;
    private String descripcion;
    private String link;
    private Docente docente;
    
    public Problema(String titulo, String decripcion, String link, Docente d){
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
    
    @Override
    public String toString(){
        return this.getTitulo();
    }
}
