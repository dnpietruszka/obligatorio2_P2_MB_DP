/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.view;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import obligatorio2.model.Envio;
import obligatorio2.model.Equipo;
import obligatorio2.model.Problema;
import obligatorio2.model.Sistema;


/**
 *
 * @author matias
 */
public class VerEstadisticas extends javax.swing.JFrame {

    /**
     * Creates new form VerEstadisticas
     */
    
    // Table 
    JTable j; 
    private Sistema sistema;

    public VerEstadisticas(Sistema s) {
        sistema = s;
        this.setTitle("Estadisticas"); 
        // Data to be displayed in the JTable 
        ArrayList<Problema> listaProblemas = sistema.getListaProblemas();
        ArrayList<Envio> listaEnvios = sistema.getListaEnvios();
        int cantidadProblemas = listaProblemas.size();
        String[][] datos = new String[cantidadProblemas][3];
        for(int i = 0; i < cantidadProblemas; i++){
            Problema p = listaProblemas.get(i);
            ArrayList<Envio> listaEnviosProblema = p.getEnviosProblema(listaEnvios, p);
            for (int j = 0; j < 3; j++){
                switch(j){
                    case 0:
                        //Columna Ejercicio
                        datos[i][j] = p.getTitulo();
                        break;
                    case 1:
                        //Columna CantidadOK
                        int contadorOK = 0;
                        for(int k = 0; k < listaEnviosProblema.size(); k++){
                            if(listaEnviosProblema.get(k).getResultado().isResultado()){
                                contadorOK++;
                            }
                        }
                        datos[i][j] = String.valueOf(contadorOK);
                        break;
                    case 2:
                        //Columna Tiempo 1era ok
                        int tiempoPrimeraOK = 0;
                        boolean encontreCorrecta = false;
                        
                        for(int k = 0; k < listaEnviosProblema.size() && !encontreCorrecta; k++){
                            if(listaEnviosProblema.get(k).getResultado().isResultado()){
                                int tiempo = listaEnviosProblema.get(k).getTiempo();
                                tiempoPrimeraOK = tiempo;
                                encontreCorrecta = true;
                            }
                        }
                        datos[i][j] = String.valueOf(tiempoPrimeraOK);;
                        break;
                }
                       
                
                
            }
        }
        // Column Names 
        String[] columnNames = { "Ejercicio", "Cantidad OK", "Tiempo 1era ok" }; 
  
        // Initializing the JTable 
        j = new JTable(datos, columnNames); 
        j.setBounds(30, 40, 200, 300); 
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        this.add(sp); 
        // Frame Size 
        this.setSize(500, 200); 
        // Frame Visible = true 
        this.setVisible(true); 
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEstadisticas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstadisticas = new javax.swing.JTable();
        txtTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        tblEstadisticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblEstadisticas);

        javax.swing.GroupLayout pnlEstadisticasLayout = new javax.swing.GroupLayout(pnlEstadisticas);
        pnlEstadisticas.setLayout(pnlEstadisticasLayout);
        pnlEstadisticasLayout.setHorizontalGroup(
            pnlEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadisticasLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEstadisticasLayout.setVerticalGroup(
            pnlEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadisticasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlEstadisticas);
        pnlEstadisticas.setBounds(30, 40, 480, 340);

        txtTitulo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTitulo1.setText("ESTADISTICAS");
        getContentPane().add(txtTitulo1);
        txtTitulo1.setBounds(240, 10, 100, 17);

        setBounds(0, 0, 564, 426);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlEstadisticas;
    private javax.swing.JTable tblEstadisticas;
    private javax.swing.JLabel txtTitulo1;
    // End of variables declaration//GEN-END:variables
}
