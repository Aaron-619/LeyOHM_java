package ohm;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Window extends javax.swing.JFrame {

    public Window() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        panel.setBackground(Color.LIGHT_GRAY);
    }

    private void calculoVoltaje() {
        float Resistencia = Float.valueOf(valRes.getText());
        float corriente = Float.valueOf(valCor.getText());
        float voltaje = 0;
        Circuito c1 = new Circuito(Resistencia, corriente, voltaje);
        String respuesta = Float.toString(c1.calculoVoltaje(corriente, Resistencia));
        valorOHM.setText(respuesta + " V");
    }

    private void calculoCorriente() {
        float Resistencia = Float.valueOf(valRes.getText());
        float corriente = 0;
        float voltaje = Float.valueOf(valVolt.getText());
        Circuito c1 = new Circuito(Resistencia, corriente, voltaje);
        String respuesta = Float.toString(c1.calculoCorriente(Resistencia, voltaje));
        valorOHM.setText(respuesta + " A");
    }

    private void calculoResistencia() {
        float Resistencia = 0;
        float corriente = Float.valueOf(valCor.getText());
        float voltaje = Float.valueOf(valVolt.getText());
        Circuito c1 = new Circuito(Resistencia, corriente, voltaje);
        String respuesta = Float.toString(c1.CalculoResistencia(voltaje, corriente));
        valorOHM.setText(respuesta + " Ω");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        labelT = new javax.swing.JLabel();
        voltaje = new javax.swing.JRadioButton();
        corriente = new javax.swing.JRadioButton();
        resistencia = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        valVolt = new javax.swing.JTextField();
        valCor = new javax.swing.JTextField();
        valRes = new javax.swing.JTextField();
        resTxt = new javax.swing.JLabel();
        valorOHM = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        radioB = new javax.swing.JRadioButton();
        cleanWindow = new javax.swing.JButton();

        GrupoBotones.add(voltaje);
        GrupoBotones.add(resistencia);
        GrupoBotones.add(corriente);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelT.setText("LEY DE OHM");

        voltaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltaje.setText("Voltaje");
        voltaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltajeActionPerformed(evt);
            }
        });

        corriente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        corriente.setText("Corriente");
        corriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrienteActionPerformed(evt);
            }
        });

        resistencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resistencia.setText("Resistencia");
        resistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistenciaActionPerformed(evt);
            }
        });

        resTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resTxt.setText("Resultado: ");

        valorOHM.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        radioB.setText("DARK MODE");
        radioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBActionPerformed(evt);
            }
        });

        cleanWindow.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cleanWindow.setText("Limpiar");
        cleanWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanWindowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(radioB)
                .addGap(122, 122, 122)
                .addComponent(cleanWindow, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelT)
                            .addComponent(voltaje)
                            .addComponent(corriente)
                            .addComponent(resistencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valVolt)
                            .addComponent(valCor)
                            .addComponent(valRes)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(resTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorOHM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelT)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltaje)
                    .addComponent(valVolt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corriente)
                    .addComponent(valCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resistencia)
                    .addComponent(valRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(resTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(valorOHM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioB)
                    .addComponent(cleanWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBActionPerformed
        if (radioB.isSelected()) {
            panel.setBackground(Color.DARK_GRAY);
            labelT.setForeground(Color.WHITE);
            radioB.setForeground(Color.WHITE);
            voltaje.setForeground(Color.WHITE);
            resistencia.setForeground(Color.WHITE);
            corriente.setForeground(Color.WHITE);
            resTxt.setForeground(Color.WHITE);
            valorOHM.setForeground(Color.WHITE);

        } else {
            panel.setBackground(Color.LIGHT_GRAY);
            labelT.setForeground(Color.BLACK);
            radioB.setForeground(Color.BLACK);
            voltaje.setForeground(Color.BLACK);
            resistencia.setForeground(Color.BLACK);
            corriente.setForeground(Color.BLACK);
            resTxt.setForeground(Color.BLACK);
            valorOHM.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_radioBActionPerformed

    private void corrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrienteActionPerformed
        if (corriente.isSelected()) {
            valCor.setEnabled(false);
            valVolt.setEnabled(true);
            valRes.setEnabled(true);
            valRes.setText(" ");
            valVolt.setText(" ");
            valCor.setText(" ");
            valorOHM.setText(" ");
        } else {
            valCor.setEnabled(true);
        }
    }//GEN-LAST:event_corrienteActionPerformed

    private void voltajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltajeActionPerformed
        if (voltaje.isSelected()) {
            valVolt.setEnabled(false);
            valRes.setEnabled(true);
            valCor.setEnabled(true);
            valRes.setText(" ");
            valVolt.setText(" ");
            valCor.setText(" ");
            valorOHM.setText(" ");

        } else {
            valVolt.setEnabled(true);
        }
    }//GEN-LAST:event_voltajeActionPerformed

    private void resistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistenciaActionPerformed
        if (resistencia.isSelected()) {
            valRes.setEnabled(false);
            valCor.setEnabled(true);
            valVolt.setEnabled(true);
            valRes.setText(" ");
            valVolt.setText(" ");
            valCor.setText(" ");
            valorOHM.setText(" ");

        } else {
            valRes.setEnabled(true);
        }
    }//GEN-LAST:event_resistenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //calculoVoltaje();
        //calculoCorriente()
        if (voltaje.isSelected()) {
            calculoVoltaje();
        } else if (corriente.isSelected()) {
            calculoCorriente();
        } else if (resistencia.isSelected()) {
            calculoResistencia();
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona lo que vas a calcular");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cleanWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanWindowActionPerformed
        valRes.setText(" ");
        valVolt.setText(" ");
        valCor.setText(" ");
        valorOHM.setText(" ");
    }//GEN-LAST:event_cleanWindowActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton cleanWindow;
    private javax.swing.JRadioButton corriente;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelT;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radioB;
    private javax.swing.JLabel resTxt;
    private javax.swing.JRadioButton resistencia;
    private javax.swing.JTextField valCor;
    private javax.swing.JTextField valRes;
    private javax.swing.JTextField valVolt;
    private javax.swing.JLabel valorOHM;
    private javax.swing.JRadioButton voltaje;
    // End of variables declaration//GEN-END:variables
}
