/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2;

import obligatorio2.model.Sistema;
import obligatorio2.view.AltaEstudiante;

/**
 *
 * @author diego
 */
public class Principal {
    
    public static void main(String[] args){
        Sistema s = new Sistema();
        AltaEstudiante altaEstudiante = new AltaEstudiante(s);
        altaEstudiante.setVisible(true);
    }
    
}
