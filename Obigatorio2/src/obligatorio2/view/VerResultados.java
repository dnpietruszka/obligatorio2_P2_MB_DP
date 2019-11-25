/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.view;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import obligatorio2.model.Envio;
import obligatorio2.model.Equipo;
import obligatorio2.model.Problema;
import obligatorio2.model.Resultado;
import obligatorio2.model.Sistema;

/**
 *
 * @author diego
 */
public class VerResultados extends javax.swing.JFrame {
    private JLabel[] labelProblemas;
    private JLabel[] labelEquipos;
    private JButton[][] botones;
    private JLabel[] labelSumarizacion;
    private Sistema sistema;
    /**
     * Creates new form VerResultados
     */
    public VerResultados(Sistema s) {
        initComponents();
        sistema = s;
        // crear botones y agregarlos al panel
        inicializarMatrizBotones();
        inicializarLabelProblemas();
        inicializarLabelEquipos();
        inicializarLabelSumarizacion();
    }
    
    private void inicializarMatrizBotones(){
        ArrayList<Envio> listaEnvios = sistema.getListaEnvios();
        int cantFilas =  sistema.getListaEquipos().size();
        int cantColumnas =  sistema.getListaProblemas().size();
        pnlMatrizBotones.setLayout(new GridLayout(cantFilas, cantColumnas));
        botones = new JButton[cantFilas][cantColumnas];
        for (int i = 0; i < cantFilas; i++) {
            Resultado r = new Resultado();
            
            Equipo equipo = sistema.getListaEquipos().get(i);
            equipo.setResultado(r);
            for (int j = 0; j < cantColumnas; j++) {
                Problema p = sistema.getListaProblemas().get(j);
                JButton jButton = new JButton("");
                jButton.setMargin(new Insets(5,5,5,5));
                
                if (!equipo.contieneEnvio(listaEnvios)){
                    jButton.setBackground(java.awt.Color.white);
                } else {
                    ArrayList<Envio> listaEnviosEquipo = equipo.getEnviosEquipo(listaEnvios);
                    if(equipo.contieneProblema(listaEnviosEquipo, p)){
                        ArrayList<Envio> listaEnviosProblema = p.getEnviosProblema(listaEnviosEquipo, p);
                        jButton.setText(String.valueOf(listaEnviosProblema.size()));
                        HashMap<String, Object> mapaResultado = p.getResultadoProblema(listaEnviosProblema);
                        int minutos = (int)mapaResultado.get("minutos");
                        boolean resultado = (boolean)mapaResultado.get("resultado");
                        if(resultado){
                            r.setTotalMinutos(equipo.getResultado().getTotalMinutos() + minutos);
                            r.setTotalPuntos(equipo.getResultado().getTotalPuntos() + 1);
                            jButton.setBackground(java.awt.Color.green);
                            jButton.setText(minutos + "/" + String.valueOf(listaEnviosProblema.size()));
                        } else {
                            jButton.setBackground(java.awt.Color.red);
                            jButton.setText(String.valueOf(listaEnviosProblema.size()));
                        }
                    } else {
                        jButton.setBackground(java.awt.Color.white);
                    }
                    
                }
                sistema.serializar();
                jButton.addActionListener(new ListenerBoton(i, j));
                pnlMatrizBotones.add(jButton);
                botones[i][j] = jButton;
            }
        }
    }
    
    private void inicializarLabelProblemas(){
        int cantProblemas =  sistema.getListaProblemas().size();
        pnlMatrizProblemas.setLayout(new GridLayout(1, cantProblemas));
        labelProblemas = new JLabel[cantProblemas];
        for (int i = 0; i < cantProblemas; i++) {
            JLabel jLabel = new JLabel();
            jLabel.setOpaque(true);
            EmptyBorder margin = new EmptyBorder(10,10,10,10);
            jLabel.setBorder(margin);
            if (i%2 == 0){
                jLabel.setBackground(java.awt.Color.LIGHT_GRAY);
            } else {
                jLabel.setBackground(java.awt.Color.GRAY);
            }
            String tituloProblema = sistema.getListaProblemas().get(i).getTitulo();
            jLabel.setText(tituloProblema);
            pnlMatrizProblemas.add(jLabel);
            labelProblemas[i] = jLabel;
        }
    }
    
    private void inicializarLabelEquipos(){
        int cantEquipos =  sistema.getListaEquipos().size();
        pnlMatrizEquipos.setLayout(new GridLayout(cantEquipos, 1));
        labelEquipos = new JLabel[cantEquipos];
        for (int i = 0; i < cantEquipos; i++) {
            JLabel jLabel = new JLabel();
            jLabel.setOpaque(true);
            EmptyBorder margin = new EmptyBorder(10,10,10,10);
            jLabel.setBorder(margin);
            if (i%2 == 0){
                jLabel.setBackground(java.awt.Color.LIGHT_GRAY);
            } else {
                jLabel.setBackground(java.awt.Color.GRAY);
            }
            String nombreEquipo = sistema.getListaEquipos().get(i).getNombre();
            jLabel.setText(nombreEquipo);
            pnlMatrizEquipos.add(jLabel);
            labelEquipos[i] = jLabel;
        }
    }
    
    private void inicializarLabelSumarizacion(){
        int cantEquipos =  sistema.getListaEquipos().size();
        pnlMatrizSumarizacion.setLayout(new GridLayout(cantEquipos, 1));
        labelSumarizacion = new JLabel[cantEquipos];
        for (int i = 0; i < cantEquipos; i++) {
            JLabel jLabel = new JLabel();
            jLabel.setOpaque(true);
            EmptyBorder margin = new EmptyBorder(10,10,10,10);
            jLabel.setBorder(margin);
            if (i%2 == 0){
                jLabel.setBackground(java.awt.Color.LIGHT_GRAY);
            } else {
                jLabel.setBackground(java.awt.Color.GRAY);
            }
            Equipo equipo = sistema.getListaEquipos().get(i);
            equipo.getResultado().getTotalMinutos();
            equipo.getResultado().getTotalPuntos();
            jLabel.setText(equipo.getResultado().getTotalPuntos() + "/" + equipo.getResultado().getTotalMinutos());
            pnlMatrizSumarizacion.add(jLabel);
            labelSumarizacion[i] = jLabel;
        }
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMatrizEquipos = new javax.swing.JPanel();
        pnlMatrizBotones = new javax.swing.JPanel();
        pnlMatrizProblemas = new javax.swing.JPanel();
        pnlMatrizSumarizacion = new javax.swing.JPanel();
        pnlTotal = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlMatrizEquipos.setLayout(null);

        pnlMatrizBotones.setLayout(null);

        pnlMatrizProblemas.setLayout(null);

        pnlMatrizSumarizacion.setLayout(null);

        pnlTotal.setBackground(new java.awt.Color(204, 204, 255));

        txtTotal.setText("TOTAL");

        javax.swing.GroupLayout pnlTotalLayout = new javax.swing.GroupLayout(pnlTotal);
        pnlTotal.setLayout(pnlTotalLayout);
        pnlTotalLayout.setHorizontalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlTotalLayout.setVerticalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtTotal)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnlMatrizEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMatrizProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(pnlMatrizBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMatrizSumarizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMatrizProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMatrizBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(pnlMatrizSumarizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMatrizEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setBounds(0, 0, 988, 562);
    }// </editor-fold>//GEN-END:initComponents

    
    private class ListenerBoton implements ActionListener {
        private int x;
        private int y;
        public ListenerBoton(int i, int j) {
            // en el constructor se almacena la fila y columna que se presionó
            x = i;
            y = j;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // cuando se presiona un botón, se ejecutará este método
            clickBoton(x, y);
        }
    }
    private void clickBoton(int fila, int columna) {
        ArrayList<Envio> listaEnvios = sistema.getListaEnvios();
        Problema p =  sistema.getListaProblemas().get(columna);
        Equipo equipo = sistema.getListaEquipos().get(fila);
        ArrayList<Envio> listaEnviosEquipo = equipo.getEnviosEquipo(listaEnvios);
        ArrayList<Envio> listaEnviosProblema = p.getEnviosProblema(listaEnviosEquipo, p);
        if(listaEnviosProblema.size() > 0){
            String lines = "Secuencia envios: \n";
            for(int i = 0; i < listaEnviosProblema.size(); i++){
                Envio e = listaEnviosProblema.get(i);
                if(e.getResultado().isResultado()){
                    lines += "Envio numero: " + (i+1) + ", Equipo: " + e.getEquipo() + ", Resultado: correcto" + "\n";
                } else {
                    lines += "Envio numero: " + (i+1) + ", Equipo: " + e.getEquipo() + ", Resultado: incorrecto" + "\n";
                }
                
            }
            JOptionPane.showMessageDialog(this, lines, "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No hay envios registrados en el sistema para problema y equipo seleccionado", "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlMatrizBotones;
    private javax.swing.JPanel pnlMatrizEquipos;
    private javax.swing.JPanel pnlMatrizProblemas;
    private javax.swing.JPanel pnlMatrizSumarizacion;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
