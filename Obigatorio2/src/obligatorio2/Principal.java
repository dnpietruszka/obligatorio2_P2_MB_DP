/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import obligatorio2.model.Sistema;
import obligatorio2.view.MenuPrincipal;

/**
 *
 * @author diego
 */
public class Principal {
    
    public static void main(String[] args){
        Sistema s;
        try {
                FileInputStream fileIn = new FileInputStream("sistema");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                s = (Sistema) in.readObject();
                System.out.println("Serialized data is read from /tmp/item.ser");
                System.out.println("After Deserialization" + s);
        } catch (FileNotFoundException e) {
                s = new Sistema();
        } catch (IOException e) {
               e.printStackTrace();
        } catch (ClassNotFoundException e) {
               e.printStackTrace();
        }
        s = new Sistema();
        MenuPrincipal menuPrincipal = new MenuPrincipal(s);
        menuPrincipal.setVisible(true);
    }
    
}
