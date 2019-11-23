/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.view;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import obligatorio2.model.Docente;
import obligatorio2.model.Sistema;

/**
 *
 * @author diego
 */
public class AltaDocente extends javax.swing.JFrame {
    
    private Sistema sistema;

    /**
     * Creates new form AltaDocente
     */
    public AltaDocente(Sistema s) {
        initComponents();
        sistema = s;
        this.cargarDocentes();
        lstDocente.setModel(modeloDocente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistroDocente = new javax.swing.JPanel();
        lblNombreDocente = new javax.swing.JLabel();
        lblCIDocente = new javax.swing.JLabel();
        lblMailDocente = new javax.swing.JLabel();
        lblAnioIngresoDocente = new javax.swing.JLabel();
        txtNombreDocente = new javax.swing.JTextField();
        txtCIDocente = new javax.swing.JTextField();
        txtMailDocente = new javax.swing.JTextField();
        txtAnioIngresoDocente = new javax.swing.JTextField();
        btnEnviarDocente = new javax.swing.JButton();
        btnLimpiarDocente = new javax.swing.JButton();
        pnlListaDocente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDocente = new javax.swing.JList<>();

        setTitle("Ingresar Docente");

        lblNombreDocente.setText("Nombre");

        lblCIDocente.setText("CI");

        lblMailDocente.setText("Mail");

        lblAnioIngresoDocente.setText("Año Ingreso");

        txtNombreDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDocenteActionPerformed(evt);
            }
        });

        btnEnviarDocente.setText("Enviar");
        btnEnviarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarDocenteActionPerformed(evt);
            }
        });

        btnLimpiarDocente.setText("Limpiar");
        btnLimpiarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroDocenteLayout = new javax.swing.GroupLayout(pnlRegistroDocente);
        pnlRegistroDocente.setLayout(pnlRegistroDocenteLayout);
        pnlRegistroDocenteLayout.setHorizontalGroup(
            pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroDocenteLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroDocenteLayout.createSequentialGroup()
                        .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreDocente)
                            .addComponent(lblCIDocente)
                            .addComponent(lblMailDocente)
                            .addComponent(lblAnioIngresoDocente))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(txtCIDocente)
                            .addComponent(txtMailDocente)
                            .addComponent(txtAnioIngresoDocente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistroDocenteLayout.createSequentialGroup()
                        .addComponent(btnEnviarDocente)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarDocente)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlRegistroDocenteLayout.setVerticalGroup(
            pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroDocenteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDocente)
                    .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCIDocente)
                    .addComponent(txtCIDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMailDocente)
                    .addComponent(txtMailDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnioIngresoDocente)
                    .addComponent(txtAnioIngresoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarDocente)
                    .addComponent(btnLimpiarDocente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(lstDocente);

        javax.swing.GroupLayout pnlListaDocenteLayout = new javax.swing.GroupLayout(pnlListaDocente);
        pnlListaDocente.setLayout(pnlListaDocenteLayout);
        pnlListaDocenteLayout.setHorizontalGroup(
            pnlListaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaDocenteLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlListaDocenteLayout.setVerticalGroup(
            pnlListaDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaDocenteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnlRegistroDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(pnlListaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRegistroDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlListaDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDocenteActionPerformed

    private void limpiarCampos(){
        txtNombreDocente.setText("");
        txtCIDocente.setText("");
        txtMailDocente.setText("");
        txtAnioIngresoDocente.setText("");
    }
    
    private void cargarDocentes(){
        ArrayList<Docente> listaDocentes = sistema.getListaDocentes();
        
        if (listaDocentes.size() > 0){
            for (int i = 0; i < listaDocentes.size(); i++){
                modeloDocente.addElement(listaDocentes.get(i));
            }
            lstDocente.setModel(modeloDocente);
        }
    }
    
    private void btnEnviarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarDocenteActionPerformed
        String nombre = txtNombreDocente.getText();
        String cedula = txtCIDocente.getText();
        String mail = txtMailDocente.getText();
        int anioIngreso = 0;
        
        boolean correcto=true;
        try{
            anioIngreso = Integer.parseInt(txtAnioIngresoDocente.getText());
        }
            catch (NumberFormatException e){
                System.out.println("Error, el año de ingreso debe ser un numero");
                correcto = false;
            }
        if (anioIngreso < 0){
            System.out.println("El año de ingreso debe ser positivo");
            correcto = false;
        }
        
        if (nombre.equals(" ") || nombre.equals("")){
            System.out.println("Nombre de docente no valido");
            correcto = false;
        }
        if ((!cedula.matches("[0-9]+") || cedula.length()!=8)){
            System.out.println("Numero de cedula no valido");
            correcto = false;
        }
        if (!mail.contains("@")){
            System.out.println("Email de docente no valido");
            correcto = false;
        }
        if (correcto){
            Docente d = new Docente(nombre, cedula, mail, anioIngreso);
            sistema.agregarDocente(d);
            sistema.serializar();
            modeloDocente.addElement(d);
            JOptionPane.showMessageDialog(this, "Docente ingresado correctamente", "INFO", JOptionPane.INFORMATION_MESSAGE);
            this.limpiarCampos();
        }    
    }//GEN-LAST:event_btnEnviarDocenteActionPerformed

    private void btnLimpiarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarDocenteActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarDocenteActionPerformed

    DefaultListModel modeloDocente = new DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarDocente;
    private javax.swing.JButton btnLimpiarDocente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnioIngresoDocente;
    private javax.swing.JLabel lblCIDocente;
    private javax.swing.JLabel lblMailDocente;
    private javax.swing.JLabel lblNombreDocente;
    private javax.swing.JList<String> lstDocente;
    private javax.swing.JPanel pnlListaDocente;
    private javax.swing.JPanel pnlRegistroDocente;
    private javax.swing.JTextField txtAnioIngresoDocente;
    private javax.swing.JTextField txtCIDocente;
    private javax.swing.JTextField txtMailDocente;
    private javax.swing.JTextField txtNombreDocente;
    // End of variables declaration//GEN-END:variables
}
