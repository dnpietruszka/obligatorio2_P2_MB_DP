/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;
import java.util.ArrayList;

/**
 *
 * @author matias
 */
public class Equipo {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    
    public Equipo(String nombre){
        this.nombre = nombre;
        this.estudiantes = new ArrayList<Estudiante>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }
}
