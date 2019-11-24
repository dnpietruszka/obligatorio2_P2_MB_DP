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
 
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
 
 
//
// Esta clase permite gestionar la tabla y los eventos realizados sobre ella
// cada celda seria un objeto personalizable
// @author diego
// 
//
public class GestionCeldasGrilla extends DefaultTableCellRenderer{
  
    public GestionCeldasGrilla(){
   
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JButton){
            JButton button = (JButton)value;
            return button;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

}
