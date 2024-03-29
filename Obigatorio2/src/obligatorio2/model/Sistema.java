/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import obligatorio2.utils.ArchivoLectura;

/**
 *
 * @author diego
 */
public class Sistema implements Serializable  {
    
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Docente> listaDocentes;
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Problema> listaProblemas;
    private ArrayList<Envio> listaEnvios;
    
    public Sistema(){
        listaEstudiantes = new ArrayList<Estudiante>();
        listaDocentes = new ArrayList<Docente>();
        listaEquipos = new ArrayList<Equipo>();
        listaProblemas = new ArrayList<Problema>();
        listaEnvios = new ArrayList<Envio>();
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    
    public void agregarEstudiante(Estudiante e){
        listaEstudiantes.add(e);
    }
    
    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }
    
    public void agregarDocente(Docente d){
        listaDocentes.add(d);
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void agregarEquipo(Equipo e) {
        this.listaEquipos.add(e);
    }

    public ArrayList<Problema> getListaProblemas() {
        return listaProblemas;
    }
    
    public void agregarProblema(Problema p) {
        this.listaProblemas.add(p);
    }

    public ArrayList<Envio> getListaEnvios() {
        return listaEnvios;
    }
    
    public void agregarEnvio(Envio e) {
        this.listaEnvios.add(e);
    }
    
    public Equipo buscarEquipoPorNombre(String nombreEquipo){
        for(int i = 0; i < listaEquipos.size(); i ++){
            Equipo e = listaEquipos.get(i);
            if(e.getNombre().equals(nombreEquipo)){
                return e;
            }
        }
        return null;
    }
    
    public Problema buscarProblemaPorNombre(String nombreProblema){
        for(int i = 0; i < listaProblemas.size(); i ++){
            Problema p = listaProblemas.get(i);
            if(p.getTitulo().equals(nombreProblema)){
                return p;
            }
        }
        return null;
    }

    public void serializar(){
        FileOutputStream fileOut;
         try {
             fileOut = new FileOutputStream("sistema");
             ObjectOutputStream out = new ObjectOutputStream(fileOut);
             out.writeObject(this);
             out.close();
             fileOut.close();
           } catch (FileNotFoundException e) {
                  e.printStackTrace();
           } catch (IOException e) {
                  e.printStackTrace();
           }
    }
    
    public int getSiguienteNumeroEquipo(){
        int size = this.listaEquipos.size();
        if(size > 0){
            Collections.sort(listaEquipos);
            return listaEquipos.get((size-1)).getNumero()+1;
        } else {
            return 1;
        }
    }
}
