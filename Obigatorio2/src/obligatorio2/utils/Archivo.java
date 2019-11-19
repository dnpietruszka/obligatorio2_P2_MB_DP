/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.utils;

/**
 *
 * @author diego
 */
public class Archivo {
    
    public void verificarEjericio (String archivoEquipo, String archivoOficial){
        ArchivoLectura aEquipo = new ArchivoLectura(archivoEquipo);
        ArchivoLectura aOficial = new ArchivoLectura(archivoOficial);
        //Archivo grabacion iria en esta linea
        while (aOficial.hayMasLineas()){
            String lineaArchivoOficial = aOficial.linea();
            System.out.println(lineaArchivoOficial);
            while (aEquipo.hayMasLineas()){
                String lineaArchivoEquipo = aEquipo.linea();
                System.out.println(lineaArchivoEquipo);
            }
        }
        aEquipo.cerrar();
        aOficial.cerrar();
        //cerramos archivos
    }
    
}
