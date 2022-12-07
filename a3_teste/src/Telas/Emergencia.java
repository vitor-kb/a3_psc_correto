package Telas;

import Config.*;
import java.util.Calendar;

public class Emergencia extends javax.swing.JFrame {

    Ligacao ligapolicia;
    Ligacao ligasamu;
    TelaInicial enviaHorario;

    public Emergencia() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Emergencia");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoAmbu = new javax.swing.JButton();
        botaoPoli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        letrAmbu = new javax.swing.JLabel();
        letrPoli = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoAmbu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\iconambu.png")); // NOI18N
        botaoAmbu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAmbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAmbuActionPerformed(evt);
            }
        });

        botaoPoli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\iconpoli.png")); // NOI18N
        botaoPoli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPoliActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Para qual serviço deseja ligar ?");

        letrAmbu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        letrAmbu.setForeground(new java.awt.Color(255, 0, 0));
        letrAmbu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrAmbu.setText("Ambulância");

        letrPoli.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        letrPoli.setForeground(new java.awt.Color(0, 0, 255));
        letrPoli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrPoli.setText("Polícia");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(letrAmbu, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(letrPoli, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoAmbu)
                            .addGap(79, 79, 79)
                            .addComponent(botaoPoli))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoPoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAmbu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letrAmbu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letrPoli, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        if (enviaHorario == null) {
            enviaHorario = new TelaInicial();
            Calendar c = Calendar.getInstance();
            enviaHorario.recebeHorario(c.get(Calendar.HOUR_OF_DAY) + ":" + String.valueOf(c.get(Calendar.MINUTE)));
            enviaHorario.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void botaoAmbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAmbuActionPerformed
        Config cfg = new Config();
        if (ligasamu == null) {
            ligasamu = new Ligacao();
            ligasamu.samu(cfg.getSamu());
            ligasamu.setVisible(true);
            setVisible(false);
        }

    }//GEN-LAST:event_botaoAmbuActionPerformed

    private void botaoPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPoliActionPerformed
        Config cfg = new Config();
        if (ligapolicia == null) {
            ligapolicia = new Ligacao();
            ligapolicia.policia(cfg.getPolicia());
            ligapolicia.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_botaoPoliActionPerformed

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
            java.util.logging.Logger.getLogger(Emergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emergencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emergencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAmbu;
    private javax.swing.JButton botaoPoli;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel letrAmbu;
    private javax.swing.JLabel letrPoli;
    // End of variables declaration//GEN-END:variables
}
