package TelaVIEW;

import java.util.Calendar;

public class celular_ligacao extends javax.swing.JFrame {

    Ligacao enviatexto;
    TelaInicial enviaHorario;

    /**
     * Creates new form celular_ligacao
     */
    public celular_ligacao() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ligar");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        botaoestrela = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaohashtag = new javax.swing.JButton();
        camponum = new javax.swing.JTextField();
        botaoapag = new javax.swing.JButton();
        botaolig = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(28, 28));

        botao1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botao1.setText("1");
        botao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botao2.setText("2");
        botao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botao3.setText("3");
        botao3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botao4.setText("4");
        botao4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botao5.setText("5");
        botao5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_6.setText("6");
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_7.setText("7");
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_8.setText("8");
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_9.setText("9");
        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        botaoestrela.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoestrela.setText("*");
        botaoestrela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoestrela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoestrelaActionPerformed(evt);
            }
        });

        botao0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botao0.setText("0");
        botao0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });

        botaohashtag.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaohashtag.setText("#");
        botaohashtag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaohashtag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaohashtagActionPerformed(evt);
            }
        });

        camponum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        camponum.setForeground(new java.awt.Color(0, 0, 0));

        botaoapag.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\iconapag.png")); // NOI18N
        botaoapag.setActionCommand("iconapag");
        botaoapag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoapag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoapagActionPerformed(evt);
            }
        });

        botaolig.setForeground(new java.awt.Color(51, 153, 255));
        botaolig.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\call_FILL0_wght400_GRAD0_opsz48.png")); // NOI18N
        botaolig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaolig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoligActionPerformed(evt);
            }
        });

        btn_voltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icon_voltar.png")); // NOI18N
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(camponum, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoapag))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoestrela, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaolig)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaohashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(camponum, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoapag, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_voltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoestrela, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaohashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(botaolig)
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        camponum.setText(camponum.getText() + "4");
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        camponum.setText(camponum.getText() + "1");
    }//GEN-LAST:event_botao1ActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        if (enviaHorario == null) {
            enviaHorario = new TelaInicial();
            Calendar c = Calendar.getInstance();
            enviaHorario.recebeHorario(c.get(Calendar.HOUR_OF_DAY) + ":" + String.valueOf(c.get(Calendar.MINUTE)));
            enviaHorario.setVisible(true);
            setVisible(false);
        }

    }//GEN-LAST:event_btn_voltarActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        camponum.setText(camponum.getText() + "2");
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        camponum.setText(camponum.getText() + "3");
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        camponum.setText(camponum.getText() + "5");
    }//GEN-LAST:event_botao5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        camponum.setText(camponum.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        camponum.setText(camponum.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        camponum.setText(camponum.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        camponum.setText(camponum.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        camponum.setText(camponum.getText() + "0");
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoestrelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoestrelaActionPerformed
        camponum.setText(camponum.getText() + "*");
    }//GEN-LAST:event_botaoestrelaActionPerformed

    private void botaohashtagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaohashtagActionPerformed
        camponum.setText(camponum.getText() + "#");
    }//GEN-LAST:event_botaohashtagActionPerformed

    private void botaoligActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoligActionPerformed
        if (enviatexto == null) {
            enviatexto = new Ligacao();
            enviatexto.recebendo(camponum.getText());
            enviatexto.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_botaoligActionPerformed

    private void botaoapagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoapagActionPerformed
        camponum.setText("");
    }//GEN-LAST:event_botaoapagActionPerformed

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
            java.util.logging.Logger.getLogger(celular_ligacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(celular_ligacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(celular_ligacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(celular_ligacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new celular_ligacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botaoapag;
    private javax.swing.JButton botaoestrela;
    private javax.swing.JButton botaohashtag;
    private javax.swing.JButton botaolig;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JTextField camponum;
    // End of variables declaration//GEN-END:variables
}
