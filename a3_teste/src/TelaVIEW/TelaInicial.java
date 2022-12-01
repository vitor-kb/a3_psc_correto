package TelaVIEW;

import Config.Config;

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Inicio");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_tec_num = new javax.swing.JButton();
        btn_contatos = new javax.swing.JButton();
        btn_emerg = new javax.swing.JButton();
        btn_msg = new javax.swing.JButton();
        lbl_horario = new javax.swing.JLabel();
        bnt_desligar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_tec_num.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\call_FILL0_wght400_GRAD0_opsz48.png")); // NOI18N
        btn_tec_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tec_numActionPerformed(evt);
            }
        });

        btn_contatos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\contacts_FILL0_wght400_GRAD0_opsz48.png")); // NOI18N
        btn_contatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contatosActionPerformed(evt);
            }
        });

        btn_emerg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\btn_sos.png")); // NOI18N
        btn_emerg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emergActionPerformed(evt);
            }
        });

        btn_msg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\mail_FILL0_wght400_GRAD0_opsz48.png")); // NOI18N
        btn_msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_msgActionPerformed(evt);
            }
        });

        lbl_horario.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_horario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_horario.setText("Horario");

        bnt_desligar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\btn_deslg.png")); // NOI18N
        bnt_desligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_desligarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\5g_FILL0_wght400_GRAD0_opsz48.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\btn_bateria.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_emerg)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnt_desligar)
                            .addComponent(btn_tec_num)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_contatos)
                                .addGap(38, 38, 38)
                                .addComponent(btn_msg)))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(lbl_horario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_horario)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_emerg)
                    .addComponent(btn_contatos)
                    .addComponent(btn_msg))
                .addGap(66, 66, 66)
                .addComponent(btn_tec_num)
                .addGap(44, 44, 44)
                .addComponent(bnt_desligar)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_contatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contatosActionPerformed
        Config cfg = new Config();
        tela_contatos ctt = new tela_contatos();
        ctt.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_contatosActionPerformed

    private void btn_emergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emergActionPerformed
        Config cfg = new Config();
        Emergencia emg = new Emergencia();
        emg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_emergActionPerformed

    private void btn_tec_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tec_numActionPerformed
        celular_ligacao tec_num = new celular_ligacao();
        tec_num.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_tec_numActionPerformed

    private void btn_msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_msgActionPerformed
        Mensagem msg = new Mensagem();
        msg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_msgActionPerformed

    private void bnt_desligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_desligarActionPerformed
        dispose();
    }//GEN-LAST:event_bnt_desligarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_desligar;
    private javax.swing.JButton btn_contatos;
    private javax.swing.JButton btn_emerg;
    private javax.swing.JButton btn_msg;
    private javax.swing.JButton btn_tec_num;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_horario;
    // End of variables declaration//GEN-END:variables
    public void recebeHorario(String recebe) {
        lbl_horario.setText(recebe);
    }
}
