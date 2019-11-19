/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.utils;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author matias
 */
public class ArchivoLectura {
    private Scanner in;
    private String linea;
    
    public ArchivoLectura(String unNombre){
        try{
            in = new Scanner (Paths.get(unNombre));
            
        } catch (IOException e){
            System.err.println("Error");
            System.exit(1);
        }
    }
    
    public boolean hayMasLineas(){
        boolean hay = false;
        linea = null;
        if (in.hasNext()){
            linea = in.nextLine();
            hay = true;
            
        }
        return hay;
    }
    
    public String linea(){
        //para devolver la ultima linea que se lee
        return linea;
    }
    
    
    public void cerrar(){
        //cierra
        in.close();
    }
}
