/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.view;
import java.util.ArrayList;
import javax.swing.*;
import obligatorio2.model.Estudiante;
import obligatorio2.model.Sistema;
/**
 *
 * @author diego
 */
public class AltaEstudiante extends javax.swing.JFrame {
    
    private Sistema sistema;

    /**
     * Creates new form RegistroEstudiante
     */
    public AltaEstudiante(Sistema s) {
        initComponents();
        sistema = s;
        this.cargarEstudiantes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistroEstudiante = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblCI = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        txtEnviar = new javax.swing.JButton();
        txtLimpiar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtCI = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        pnlListaEstudiante = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        txtTitulo = new javax.swing.JLabel();

        lblNombre.setText("Nombre");

        lblCI.setText("CI");

        lblMail.setText("Mail");

        lblNumero.setText("Número");

        lblSemestre.setText("Semestre");

        txtEnviar.setText("Enviar");
        txtEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnviarActionPerformed(evt);
            }
        });

        txtLimpiar.setText("Limpiar");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroEstudianteLayout = new javax.swing.GroupLayout(pnlRegistroEstudiante);
        pnlRegistroEstudiante.setLayout(pnlRegistroEstudianteLayout);
        pnlRegistroEstudianteLayout.setHorizontalGroup(
            pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroEstudianteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlRegistroEstudianteLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(txtLimpiar))
                    .addGroup(pnlRegistroEstudianteLayout.createSequentialGroup()
                        .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCI)
                            .addComponent(lblNombre)
                            .addComponent(lblMail)
                            .addComponent(lblNumero)
                            .addComponent(lblSemestre))
                        .addGap(27, 27, 27)
                        .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtCI)
                            .addComponent(txtMail)
                            .addComponent(txtNumero)
                            .addComponent(txtSemestre))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlRegistroEstudianteLayout.setVerticalGroup(
            pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroEstudianteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCI))
                .addGap(22, 22, 22)
                .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail))
                .addGap(22, 22, 22)
                .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addGap(21, 21, 21)
                .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemestre))
                .addGap(37, 37, 37)
                .addGroup(pnlRegistroEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnviar)
                    .addComponent(txtLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(lstEstudiantes);

        javax.swing.GroupLayout pnlListaEstudianteLayout = new javax.swing.GroupLayout(pnlListaEstudiante);
        pnlListaEstudiante.setLayout(pnlListaEstudianteLayout);
        pnlListaEstudianteLayout.setHorizontalGroup(
            pnlListaEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListaEstudianteLayout.setVerticalGroup(
            pnlListaEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaEstudianteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTitulo.setText("REGISTRO DE ESTUDIANTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(pnlRegistroEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlListaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(txtTitulo)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlListaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRegistroEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarEstudiantes(){
        ArrayList<Estudiante> listaEstudiantes = sistema.getListaEstudiantes();
        
        if (listaEstudiantes.size() > 0){
            for (int i = 0; i < listaEstudiantes.size(); i++){
                defaultListModel.addElement(listaEstudiantes.get(i));
            }
            lstEstudiantes.setModel(defaultListModel);
        }
    }
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnviarActionPerformed
        String nombre = txtNombre.getText();
        String cedula = txtCI.getText();
        String mail = txtMail.getText();
        int numero = Integer.parseInt(txtNumero.getText());
        int semestre = Integer.parseInt(txtSemestre.getText());
        Estudiante e = new Estudiante(nombre, cedula, mail, numero, semestre);
        e.getCedula();
        sistema.agregarEstudiante(e);
        sistema.serializar();
        JOptionPane.showMessageDialog(this, "Estudiante ingresado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_txtEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
    DefaultListModel defaultListModel = new DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCI;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JPanel pnlListaEstudiante;
    private javax.swing.JPanel pnlRegistroEstudiante;
    private javax.swing.JTextField txtCI;
    private javax.swing.JButton txtEnviar;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSemestre;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
