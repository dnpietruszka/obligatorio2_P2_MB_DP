/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Sistema {
    
    private ArrayList<Estudiante> listaEstudiantes;
    
    public Sistema(){
    
        listaEstudiantes = new ArrayList<Estudiante>();
    
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
    
}
