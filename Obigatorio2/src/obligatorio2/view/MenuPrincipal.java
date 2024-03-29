/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2.view;

import javax.swing.JOptionPane;
import obligatorio2.model.Sistema;



/**
 *
 * @author diego
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private Sistema sistema;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Sistema s) {
        initComponents();
        sistema = s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JMenuBar();
        mnAltaEstudiante = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnDocente = new javax.swing.JMenu();
        mnAltaDocente = new javax.swing.JMenuItem();
        mnEquipo = new javax.swing.JMenu();
        mnAltaEquipo = new javax.swing.JMenuItem();
        mnProblema = new javax.swing.JMenu();
        mnAltaProblema = new javax.swing.JMenuItem();
        mnCargarSolucion = new javax.swing.JMenuItem();
        mnCargarSolucionManual = new javax.swing.JMenuItem();
        mnResultados = new javax.swing.JMenu();
        mnVisualizarResultados = new javax.swing.JMenuItem();
        mnEstadisticas = new javax.swing.JMenu();
        mnVisualizarEstadisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnAltaEstudiante.setText("Estudiante");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Alta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnAltaEstudiante.add(jMenuItem1);

        menuPrincipal.add(mnAltaEstudiante);

        mnDocente.setText("Docente");

        mnAltaDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD2, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnAltaDocente.setText("Alta");
        mnAltaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaDocenteActionPerformed(evt);
            }
        });
        mnDocente.add(mnAltaDocente);

        menuPrincipal.add(mnDocente);

        mnEquipo.setText("Equipo");

        mnAltaEquipo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD3, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnAltaEquipo.setText("Alta");
        mnAltaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaEquipoActionPerformed(evt);
            }
        });
        mnEquipo.add(mnAltaEquipo);

        menuPrincipal.add(mnEquipo);

        mnProblema.setText("Problema");

        mnAltaProblema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnAltaProblema.setText("Alta");
        mnAltaProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAltaProblemaActionPerformed(evt);
            }
        });
        mnProblema.add(mnAltaProblema);

        mnCargarSolucion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD5, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCargarSolucion.setText("Cargar Solucion");
        mnCargarSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCargarSolucionActionPerformed(evt);
            }
        });
        mnProblema.add(mnCargarSolucion);

        mnCargarSolucionManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD6, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCargarSolucionManual.setText("Cargar Solucion Manual");
        mnCargarSolucionManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCargarSolucionManualActionPerformed(evt);
            }
        });
        mnProblema.add(mnCargarSolucionManual);

        menuPrincipal.add(mnProblema);

        mnResultados.setText("Resultados");

        mnVisualizarResultados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD7, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnVisualizarResultados.setText("Visualizar");
        mnVisualizarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVisualizarResultadosActionPerformed(evt);
            }
        });
        mnResultados.add(mnVisualizarResultados);

        menuPrincipal.add(mnResultados);

        mnEstadisticas.setText("Estadisticas");

        mnVisualizarEstadisticas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD8, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnVisualizarEstadisticas.setText("Visualizar");
        mnVisualizarEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVisualizarEstadisticasActionPerformed(evt);
            }
        });
        mnEstadisticas.add(mnVisualizarEstadisticas);

        menuPrincipal.add(mnEstadisticas);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AltaEstudiante altaEstudiante = new AltaEstudiante(sistema);
        altaEstudiante.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnAltaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaDocenteActionPerformed
        AltaDocente altaDocente = new AltaDocente(sistema);
        altaDocente.setVisible(true);
    }//GEN-LAST:event_mnAltaDocenteActionPerformed

    private void mnAltaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaEquipoActionPerformed
        if (sistema.getListaEstudiantes().size() > 2){
            AltaEquipo altaEquipo = new AltaEquipo(sistema);
            altaEquipo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Deben existir al menos 3 estudiantes registrados en el sistema para registrar equipos", "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mnAltaEquipoActionPerformed

    private void mnAltaProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAltaProblemaActionPerformed
        if(sistema.getListaDocentes().size() > 0){
            AltaProblema altaProblema = new AltaProblema(sistema);
            altaProblema.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Debe existir al menos 1 docente en el sistema para poder registrar problemas", "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_mnAltaProblemaActionPerformed

    private void mnCargarSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCargarSolucionActionPerformed
        if(sistema.getListaEquipos().size() > 0){
            if(sistema.getListaProblemas().size() > 0){
                CargarSolucionEstudiante cargarSolucion = new CargarSolucionEstudiante(sistema);
                cargarSolucion.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Debe existir al menos 1 problema en el sistema para poder verificar ejercicios", "ATENCION", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe existir al menos 1 equipo en el sistema para poder verificar ejercicios", "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_mnCargarSolucionActionPerformed

    private void mnVisualizarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVisualizarResultadosActionPerformed
        if(sistema.getListaEquipos().size() > 0){
            if(sistema.getListaProblemas().size() > 0){
                VerResultados verResultados = new VerResultados(sistema);
                verResultados.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Debe existir al menos 1 problema en el sistema para poder ver resultados", "ATENCION", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe existir al menos 1 equipo en el sistema para poder ver resultados", "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_mnVisualizarResultadosActionPerformed

    private void mnVisualizarEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVisualizarEstadisticasActionPerformed
        VerEstadisticas verEstadisticas = new VerEstadisticas(sistema);
        verEstadisticas.setVisible(true);
    }//GEN-LAST:event_mnVisualizarEstadisticasActionPerformed

    private void mnCargarSolucionManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCargarSolucionManualActionPerformed

        if(sistema.getListaEquipos().size() > 0){
            if(sistema.getListaProblemas().size() > 0){
                CargarSolucionManual cargarSolucionManual = new CargarSolucionManual(sistema);
                cargarSolucionManual.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Debe existir al menos 1 problema en el sistema para poder cargar resultados", "ATENCION", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe existir al menos 1 equipo en el sistema para poder cargar resultados", "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_mnCargarSolucionManualActionPerformed
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem mnAltaDocente;
    private javax.swing.JMenuItem mnAltaEquipo;
    private javax.swing.JMenu mnAltaEstudiante;
    private javax.swing.JMenuItem mnAltaProblema;
    private javax.swing.JMenuItem mnCargarSolucion;
    private javax.swing.JMenuItem mnCargarSolucionManual;
    private javax.swing.JMenu mnDocente;
    private javax.swing.JMenu mnEquipo;
    private javax.swing.JMenu mnEstadisticas;
    private javax.swing.JMenu mnProblema;
    private javax.swing.JMenu mnResultados;
    private javax.swing.JMenuItem mnVisualizarEstadisticas;
    private javax.swing.JMenuItem mnVisualizarResultados;
    // End of variables declaration//GEN-END:variables
}
