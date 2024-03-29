/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.view;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import obligatorio2.model.Docente;
import obligatorio2.model.Problema;
import obligatorio2.model.Sistema;

/**
 *
 * @author diego
 */
public class AltaProblema extends javax.swing.JFrame {
    
    private Sistema sistema;
    /**
     * Creates new form AltaProblema
     */
    public AltaProblema(Sistema s) {
        initComponents();
        sistema = s;
        this.cargarDocentes();
        this.cargarProblemas();
        lstProblemas.setModel(modeloProblema);
    }
    
    private void cargarDocentes(){
        ArrayList<Docente> listaDocentes = sistema.getListaDocentes();
        if (listaDocentes.size() > 0){
            for (int i = 0; i < listaDocentes.size(); i++){
                modeloDocente.addElement(listaDocentes.get(i));
            }
            cbDocente.setModel(modeloDocente);
        }
    }
    
    private void limpiarCampos(){
        txtTitulo.setText("");
        txtDescripcion.setText("");
        txtLink.setText("");
    }
    
    private void cargarProblemas(){
        ArrayList<Problema> listaProblemas = sistema.getListaProblemas();
        if (listaProblemas.size() > 0){
            for (int i = 0; i < listaProblemas.size(); i++){
                modeloProblema.addElement(listaProblemas.get(i));
            }
            lstProblemas.setModel(modeloProblema);
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

        pnlRegistroProblema = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblLink = new javax.swing.JLabel();
        lblDocente = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtLink = new javax.swing.JTextField();
        cbDocente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        pnlVistaProblemas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProblemas = new javax.swing.JList<>();
        txtTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Problema");

        lblTitulo.setText("Titulo");

        lblDescripcion.setText("Descripcion");

        lblLink.setText("Link");

        lblDocente.setText("Docente");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroProblemaLayout = new javax.swing.GroupLayout(pnlRegistroProblema);
        pnlRegistroProblema.setLayout(pnlRegistroProblemaLayout);
        pnlRegistroProblemaLayout.setHorizontalGroup(
            pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroProblemaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegistroProblemaLayout.createSequentialGroup()
                        .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDocente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegistroProblemaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(pnlRegistroProblemaLayout.createSequentialGroup()
                        .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlRegistroProblemaLayout.setVerticalGroup(
            pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroProblemaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLink)
                    .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDocente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(pnlRegistroProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(lstProblemas);

        javax.swing.GroupLayout pnlVistaProblemasLayout = new javax.swing.GroupLayout(pnlVistaProblemas);
        pnlVistaProblemas.setLayout(pnlVistaProblemasLayout);
        pnlVistaProblemasLayout.setHorizontalGroup(
            pnlVistaProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVistaProblemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlVistaProblemasLayout.setVerticalGroup(
            pnlVistaProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVistaProblemasLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtTitulo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTitulo1.setText("ALTA DE PROBLEMAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(pnlRegistroProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlVistaProblemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(txtTitulo1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlVistaProblemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRegistroProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String titulo = txtTitulo.getText();
        String descripcion = txtDescripcion.getText();
        String link = txtLink.getText();
        Object o = cbDocente.getSelectedItem();
        ArrayList<Problema> listaProblemas = sistema.getListaProblemas();
        boolean noEsUnico=true;
        for (Problema prob : listaProblemas){
            if (prob.getTitulo().equalsIgnoreCase(titulo)){
                JOptionPane.showMessageDialog(this, "El titulo del problema ya esta utilizado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                noEsUnico=false;
            }
        }
        if (noEsUnico){
            Problema p = new Problema(titulo, descripcion, link, (Docente)o);
            modeloProblema.addElement(p);
            sistema.agregarProblema(p);
            sistema.serializar();
            JOptionPane.showMessageDialog(this, "Problema ingresado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
        }    
    }//GEN-LAST:event_btnEnviarActionPerformed

    DefaultComboBoxModel modeloDocente = new DefaultComboBoxModel();
    DefaultListModel modeloProblema = new DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbDocente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstProblemas;
    private javax.swing.JPanel pnlRegistroProblema;
    private javax.swing.JPanel pnlVistaProblemas;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JLabel txtTitulo1;
    // End of variables declaration//GEN-END:variables
}
