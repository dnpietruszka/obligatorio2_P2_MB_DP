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
            Equipo equipo = sistema.getListaEquipos().get(i);
            for (int j = 0; j < cantColumnas; j++) {
                Problema p = sistema.getListaProblemas().get(j);
                JButton jButton = new JButton("");
                jButton.setMargin(new Insets(5,5,5,5));
                Resultado r = new Resultado();
                if (!equipo.contieneEnvio(listaEnvios)){
                    jButton.setBackground(java.awt.Color.white);
                } else {
                    ArrayList<Envio> listaEnviosEquipo = equipo.getEnviosEquipo(listaEnvios);
                    if(equipo.contieneProblema(listaEnviosEquipo, p)){
                        jButton.setText("Tengo problema");
                        ArrayList<Envio> listaEnviosProblema = p.getEnviosProblema(listaEnviosEquipo, p);
                        jButton.setText(String.valueOf(listaEnviosProblema.size()));
                        HashMap<String, Object> mapaResultado = p.getResultadoProblema(listaEnviosProblema);
                        int minutos = (int)mapaResultado.get("minutos");
                        boolean resultado = (boolean)mapaResultado.get("resultado");
                        
                        if(resultado){
                            r.setTotalMinutos(r.getTotalMinutos() + minutos);
                            r.setTotalPuntos(r.getTotalPuntos() + 1);
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
                equipo.setResultado(r);
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

        pnlMatrizBotones = new javax.swing.JPanel();
        pnlMatrizProblemas = new javax.swing.JPanel();
        pnlMatrizEquipos = new javax.swing.JPanel();
        pnlMatrizSumarizacion = new javax.swing.JPanel();
        pnlTotal = new javax.swing.JPanel();
        txtSumarizacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlMatrizBotones.setLayout(null);

        pnlMatrizProblemas.setLayout(null);

        pnlMatrizEquipos.setLayout(null);

        pnlMatrizSumarizacion.setLayout(null);

        pnlTotal.setBackground(new java.awt.Color(204, 204, 255));
        pnlTotal.setLayout(null);

        txtSumarizacion.setText("TOTAL");
        pnlTotal.add(txtSumarizacion);
        txtSumarizacion.setBounds(10, 30, 50, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pnlMatrizEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMatrizProblemas, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMatrizBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMatrizSumarizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMatrizProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(pnlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMatrizEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(pnlMatrizBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMatrizSumarizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );

        setBounds(0, 0, 792, 516);
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
    private javax.swing.JLabel txtSumarizacion;
    // End of variables declaration//GEN-END:variables
}
