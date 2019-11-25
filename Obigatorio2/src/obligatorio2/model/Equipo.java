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
    private Resultado resultado;
    
    
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
    
    public ArrayList<Envio> getEnviosEquipo(ArrayList<Envio> listaEnvios){
        ArrayList<Envio> listaRetorno = new ArrayList<Envio>();
        for (int i = 0; i < listaEnvios.size(); i++){
            Equipo equipoListaEnvio = listaEnvios.get(i).getEquipo();
            if(this.equals(equipoListaEnvio)){
                Envio envio = listaEnvios.get(i);
                listaRetorno.add(envio);
            }
        }
        return listaRetorno;
    }
    
    public boolean contieneEnvio(ArrayList<Envio> listaEnvios){
        for (int i = 0; i < listaEnvios.size(); i++){
            Equipo equipoListaEnvio = listaEnvios.get(i).getEquipo();
            if(this.equals(equipoListaEnvio)){
                return true;
            }
        }
        return false;
    }
    
    public boolean contieneProblema(ArrayList<Envio> listaEnvios, Problema p){
        for (int i = 0; i < listaEnvios.size(); i++){
            Problema problemaListaEnvio = listaEnvios.get(i).getProblema();
            if(problemaListaEnvio.equals(p)){
                return true;
            }
        }
        return false;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    @Override
    public int compareTo(Equipo e) {
        return this.getNumero() - e.getNumero();
    }
    
    @Override
    public String toString(){
        String retorno = this.getNombre();
        retorno+=" [";
        boolean esPrimero = true;
        for (int i = 0; i < this.listaEstudiantes.size(); i++){
            if (esPrimero){
                retorno+=this.listaEstudiantes.get(i).getNombre();
            } else {
                retorno+= ", " + this.listaEstudiantes.get(i).getNombre();
            }
            esPrimero = false;
        }
        retorno+="]";
        return retorno;
    }
    
    @Override
    public boolean equals(Object e){
        return this.getNombre().equals(((Equipo)e).getNombre());
    }
}
