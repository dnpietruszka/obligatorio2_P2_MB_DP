/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.model;
import java.util.Formatter;
import java.io.*;

/**
 *
 * @author matias
 */
public class ArchivoGrabacion {
    private Formatter out;
    
    public ArchivoGrabacion(String unNombre){
        try{
            out = new Formatter (unNombre);
            
        }catch (FileNotFoundException e){
            System.out.println("No es posible crear");
            System.exit(1);
        }
    }
    
    public ArchivoGrabacion (String unNombre, boolean ext){
        //si el parametro es true, indica que se va a extender sino se sobreescribe
       try{
           FileWriter f = new FileWriter(unNombre, ext);
           out = new Formatter(f);
       }catch(IOException e){
           System.out.println("no se puede crear o extender");
           System.exit(1);
           
       } 
    }
    
    public void grabarLinea(String linea){
        //se usa para el formato del String, %n se usa para una nueva linea, %s para que sea cualquier tipo
        out.format("%s%n", linea);
    }
    
    public void cerrar(){
        //para cerrar
        out.close();
    }
    
}
