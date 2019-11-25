/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.view;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import obligatorio2.model.Envio;
import obligatorio2.model.Equipo;
import obligatorio2.model.Problema;
import obligatorio2.model.Resultado;
import obligatorio2.model.Sistema;
import obligatorio2.utils.ArchivoLectura;

/**
 *
 * @author diego
 */
public class CargarSolucionEstudiante extends javax.swing.JFrame {
    
    private Sistema sistema;
    private String pathEquipo = "";

    /**
     * Creates new form CargarSolucionEstudiante
     */
    public CargarSolucionEstudiante(Sistema s) {
        initComponents();
        sistema = s;
        this.cargarProblemas();
        this.cargarEquipos();
        lstResultado.setCellRenderer( new CeldasResultados() );
        lstResultado.setModel(modeloResultados);
        FileFilter filter = new FileNameExtensionFilter("TXT Files","txt");
        flSelect.setFileFilter(filter);
        flSelect.addChoosableFileFilter(filter);
        
    }
    
    private void cargarProblemas(){
        ArrayList<Problema> listaProblemas = sistema.getListaProblemas();
        if (listaProblemas.size() > 0){
            for (int i = 0; i < listaProblemas.size(); i++){
                modeloProblemas.addElement(listaProblemas.get(i));
            }
            lstProblemas.setModel(modeloProblemas);
        }
    }
    
    private void cargarEquipos(){
        ArrayList<Equipo> listaEquipos = sistema.getListaEquipos();
        if (listaEquipos.size() > 0){
            for (int i = 0; i < listaEquipos.size(); i++){
                modeloEquipos.addElement(listaEquipos.get(i));
            }
            lstEquipos.setModel(modeloEquipos);
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

        pnlProblemas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProblemas = new javax.swing.JList<>();
        pnlEquipos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEquipos = new javax.swing.JList<>();
        pnlResultado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstResultado = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        pnlArchivo = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        cbLenguaje = new javax.swing.JComboBox<>();
        lblLenguaje = new javax.swing.JLabel();
        flSelect = new javax.swing.JFileChooser();
        btnVerificar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        lblInformacionErrores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso Manual");

        jScrollPane1.setViewportView(lstProblemas);

        javax.swing.GroupLayout pnlProblemasLayout = new javax.swing.GroupLayout(pnlProblemas);
        pnlProblemas.setLayout(pnlProblemasLayout);
        pnlProblemasLayout.setHorizontalGroup(
            pnlProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProblemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlProblemasLayout.setVerticalGroup(
            pnlProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(lstEquipos);

        javax.swing.GroupLayout pnlEquiposLayout = new javax.swing.GroupLayout(pnlEquipos);
        pnlEquipos.setLayout(pnlEquiposLayout);
        pnlEquiposLayout.setHorizontalGroup(
            pnlEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEquiposLayout.setVerticalGroup(
            pnlEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jScrollPane3.setViewportView(lstResultado);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Resultado");

        javax.swing.GroupLayout pnlResultadoLayout = new javax.swing.GroupLayout(pnlResultado);
        pnlResultado.setLayout(pnlResultadoLayout);
        pnlResultadoLayout.setHorizontalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
        );
        pnlResultadoLayout.setVerticalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTiempo.setText("Tiempo");

        cbLenguaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAVA", "Python", "C++" }));
        cbLenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLenguajeActionPerformed(evt);
            }
        });

        lblLenguaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLenguaje.setText("Lenguaje");

        flSelect.setApproveButtonText("Seleccionar");
        flSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        flSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlArchivoLayout = new javax.swing.GroupLayout(pnlArchivo);
        pnlArchivo.setLayout(pnlArchivoLayout);
        pnlArchivoLayout.setHorizontalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArchivoLayout.createSequentialGroup()
                .addGroup(pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlArchivoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblTiempo)
                        .addGap(29, 29, 29)
                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLenguaje)
                        .addGap(18, 18, 18)
                        .addComponent(cbLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlArchivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(flSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlArchivoLayout.setVerticalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiempo)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLenguaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(flSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVerificar.setText("VERIFICAR");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlProblemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(lblInformacionErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(pnlArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInformacionErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnVerificar)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbLenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLenguajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLenguajeActionPerformed

    private void flSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flSelectActionPerformed
        String com = evt.getActionCommand();
        if (com.equals("ApproveSelection")) {
            //Boton Seleccionar
            pathEquipo = flSelect.getSelectedFile().getAbsolutePath();
        } else {
            flSelect.setSelectedFile(new File(""));
        }
    }//GEN-LAST:event_flSelectActionPerformed

    
    private static class CeldasResultados extends DefaultListCellRenderer {
        public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus ) {
            Component c = super.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus );
            String valorCelda = (String)value;
            if(valorCelda.contains("error de formato")){
                c.setBackground(Color.yellow);
            } else {
                if(valorCelda.contains("error de datos")){
                    c.setBackground(Color.red);
                } else {
                    c.setBackground(Color.green);
                }
            }

            return c;
        }
    }
    
    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        //Validamos si hay seleccionado un equipo y problema
        lblInformacionErrores.setText("");
        modeloResultados.removeAllElements();
        Object objetoProblema = lstProblemas.getSelectedValue();
        Object objetoEquipo = lstEquipos.getSelectedValue();
        if (objetoProblema != null && objetoEquipo != null){
            if(!pathEquipo.equals("") && pathEquipo != null){
                int tiempo;
                try{
                    tiempo = Integer.parseInt(txtTiempo.getText());
                } catch(NumberFormatException e){
                    tiempo = -1;
                }
                if(tiempo != -1){
                    Equipo equipo = (Equipo)objetoEquipo;
                    Problema problema = (Problema)objetoProblema;
                    String pathProblema = problema.getLink();
                    System.out.println(pathProblema);
                    System.out.println(pathEquipo);
                    ArchivoLectura aEquipo = new ArchivoLectura(pathEquipo);
                    ArchivoLectura aOficial = new ArchivoLectura(pathProblema);
                    Resultado r = new Resultado();
                    int contadorLineas = 0;
                    int contadorLineasErroneas = 0;
                    while (aOficial.hayMasLineas()){
                        contadorLineas ++;
                        String lineaOficial = aOficial.linea();
                        if(aEquipo.hayMasLineas()){
                            String lineaEquipo = aEquipo.linea();
                            String resultado = r.verificarResultado(lineaEquipo, lineaOficial);
                            switch(resultado){
                                case "correcto":
                                    if(contadorLineas <= 20){
                                        modeloResultados.addElement("+Linea " + contadorLineas + ": ok");
                                    }
                                    System.out.println("+Linea " + contadorLineas + ":" + resultado);
                                    break;
                                case "incorrecto":
                                    contadorLineasErroneas++;
                                    if(contadorLineas <= 20){
                                        modeloResultados.addElement("*Linea " + contadorLineas + ": error de datos");
                                    }
                                    System.out.println("*Linea " + contadorLineas + ":" + resultado);
                                    break;
                                case "error-formato":
                                    contadorLineasErroneas++;
                                    if(contadorLineas <= 20){
                                        modeloResultados.addElement("*Linea " + contadorLineas + ": error de formato");
                                    }
                                    System.out.println("*Linea " + contadorLineas + ":" + resultado);
                                    break;    

                            }
                        }
                    }
                    boolean resultado = false;
                    if(contadorLineasErroneas > 0){
                        lblEstado.setText("INCORRECTO");
                        lblInformacionErrores.setText(contadorLineasErroneas + " errores en " + contadorLineas + " lineas");
                    } else {
                        resultado = true;
                        lblEstado.setText("CORRECTO");
                    }
                    r.setResultado(resultado);
                    String lenguaje = (String)cbLenguaje.getSelectedItem();
                    Envio envio = new Envio(equipo, problema, r, tiempo, lenguaje);
                    sistema.agregarEnvio(envio);
                    sistema.serializar();
                } else {
                    JOptionPane.showMessageDialog(this, "El tiempo seleccionado no es correcto", "ATENCION", JOptionPane.WARNING_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado un archivo", "ATENCION", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un equipo y/o problema", "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed
    DefaultListModel modeloEquipos = new DefaultListModel();
    DefaultListModel modeloProblemas = new DefaultListModel();
    DefaultListModel modeloResultados = new DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cbLenguaje;
    private javax.swing.JFileChooser flSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblInformacionErrores;
    private javax.swing.JLabel lblLenguaje;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JList<String> lstEquipos;
    private javax.swing.JList<String> lstProblemas;
    private javax.swing.JList<String> lstResultado;
    private javax.swing.JPanel pnlArchivo;
    private javax.swing.JPanel pnlEquipos;
    private javax.swing.JPanel pnlProblemas;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
