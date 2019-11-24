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
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import obligatorio2.model.Envio;
import obligatorio2.model.Equipo;
import obligatorio2.model.Problema;
import obligatorio2.model.Sistema;

public class ModeloGrilla{
    
    private Sistema sistema;
    
    public void verGrilla(JTable table, int cantidadColumnas){
        
        table.setDefaultRenderer(Object.class, new GestionCeldasGrilla());
        
        ArrayList<Problema> listaProblemas = sistema.getListaProblemas();
        ArrayList<Envio> listaEnvios = sistema.getListaEnvios();
        ArrayList<String> titulosList = new ArrayList<>();
        for (int i = 0; i < listaProblemas.size(); i++){
            titulosList.add(listaProblemas.get(i).getTitulo());
        }
        //se asignan las columnas al arreglo para enviarse al momento de construir la tabla
        String titulos[] = new String[titulosList.size()];
        for (int i = 0; i < titulos.length; i++) {
            titulos[i] = titulosList.get(i);
        }
        //obtenemos los datos de la lista y los guardamos en la matriz
        //que luego se manda a construir la tabla
        Object[][] dataResultados = obtenerMatrizDatos();
        DefaultTableModel d = new DefaultTableModel(dataResultados,
            titulos){
            public boolean isCellEditable (int row, int column){
                //Definimos si una celda puede ser o no editable
                return false;
            }
        };
        
        table.setModel(d);
        table.setRowHeight(90);
        JTableHeader header = table.getTableHeader();
        //Dimension d = header.getPreferredSize();
        //d.height = HEADER_HEIGHT;
        //header.setPreferredSize(d); //addColumn case test
        header.setPreferredSize(new Dimension(50, 30));

        table.getTableHeader().setReorderingAllowed(false);
        table.setRowHeight(150);//tamaño de las celdas
        table.setGridColor(new java.awt.Color(0, 0, 0)); 
        //Se define el tamaño de largo para cada columna y su contenido
        
        table.getColumnModel().getColumn(0).setPreferredWidth(60);//documento
        table.getColumnModel().getColumn(1).setPreferredWidth(60);
        table.getColumnModel().getColumn(0).setMaxWidth(200);
        table.getColumnModel().getColumn(1).setMaxWidth(200);
        table.getColumnModel().getColumn(0).setWidth(200);
        table.getColumnModel().getColumn(1).setWidth(200);
    }
  
    public ModeloGrilla(Sistema s) {
        sistema = s;
    }
    
    //
    // Llena la información de la tabla usando la lista de personas trabajada 
    // anteriormente, guardandola en una matriz que se retorna con toda 
    // la información para luego ser asignada al modelo
    // @param titulosList
    // @return
    //
    private Object[][] obtenerMatrizDatos() {   
        //se crea la matriz donde las filas son dinamicas pues corresponde
        //a todos los usuarios, mientras que las columnas son estaticas
        // correspondiendo a las columnas definidas por defecto
        //
        ArrayList<Problema> listaProblemas = sistema.getListaProblemas();
        ArrayList<Equipo> listaEquipos = sistema.getListaEquipos();
        Object informacion[][] = new Object[listaEquipos.size()][listaProblemas.size()];
        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[0].length; j++){
                JButton btn = new JButton("algo");
                informacion[i][j] = btn;
            }
        }
        return informacion;
    }
    
    private Object[][] obtenerMatrizDatosEquipos(ArrayList<String> titulosList) {   
        //se crea la matriz donde las filas son dinamicas pues corresponde
        //a todos los usuarios, mientras que las columnas son estaticas
        // correspondiendo a las columnas definidas por defecto
        ArrayList<Equipo> listaEquipos = sistema.getListaEquipos();
        Object informacion[][] = new Object[listaEquipos.size()][1];
        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[0].length; j++){
                informacion[i][j] = listaEquipos.get(j).getNombre();
            }
        }
        return informacion;
    }
}
