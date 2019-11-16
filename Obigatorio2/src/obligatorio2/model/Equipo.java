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
 * @author matias
 */
public class Equipo implements Comparable<Equipo>, Serializable {
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;
    private int numero;
    
    public Equipo(String nombre, int numero, ArrayList<Estudiante> listaEstudiantes){
        this.nombre = nombre;
        this.listaEstudiantes = listaEstudiantes;
        this.numero = numero;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public ArrayList<Estudiante> getListaEstudiantes(){
        return this.listaEstudiantes;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public int compareTo(Equipo e) {
        return e.getNumero() - this.getNumero();
    }
    
    @Override
    public String toString(){
        String retorno = this.getNombre();
        retorno+=" (";
        boolean esPrimero = true;
        for (int i = 0; i < this.listaEstudiantes.size(); i++){
            if (esPrimero){
                retorno+=this.listaEstudiantes.get(i).getNombre();
            } else {
                retorno+= ", " + this.listaEstudiantes.get(i).getNombre();
            }
            esPrimero = false;
        }
        retorno+=")";
        return retorno;
    }
}
