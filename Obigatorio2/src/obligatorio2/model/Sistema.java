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

/**
 *
 * @author diego
 */
public class Sistema implements Serializable  {
    
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Docente> listaDocentes;
    
    public Sistema(){
    
        listaEstudiantes = new ArrayList<Estudiante>();
        listaDocentes = new ArrayList<Docente>();
    
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    
    public void agregarEstudiante(Estudiante e){
        listaEstudiantes.add(e);
    }
    
    public void eliminarEstudiante(Estudiante e){
        listaEstudiantes.remove(e);
    }
    
    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }
    
    public void agregarDocente(Docente d){
        listaDocentes.add(d);
    }
    
    public void eliminarDocente(Docente d){
        listaDocentes.remove(d);
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
}
