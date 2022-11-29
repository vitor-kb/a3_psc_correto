/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaVIEW;

/**
 *
 * @author Vitor
 */
public class Mensagem extends javax.swing.JFrame {

    /**
     * Creates new form Mensagem
     */
    public Mensagem() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Mensagem");
        lbl_msg_enviada.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_voltar = new javax.swing.JButton();
        txt_msg = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        cb_contatos = new javax.swing.JComboBox<>();
        btn_enviar = new javax.swing.JButton();
        lbl_select_ctt = new javax.swing.JLabel();
        lbl_msg_enviada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_voltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icon_voltar.png")); // NOI18N
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        txt_msg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Digite a mensagem a ser enviada");

        cb_contatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dona Creusa", "Gertrudes Fisio", "Clebinho Filho", "Lurdes Cabelo 1", "Farma Drograsil" }));
        cb_contatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_contatosActionPerformed(evt);
            }
        });

        btn_enviar.setText("ENVIAR");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        lbl_select_ctt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_select_ctt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_select_ctt.setText("Selecione o contato:");

        lbl_msg_enviada.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\check_FILL0_wght400_GRAD0_opsz48.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 410, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_select_ctt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(cb_contatos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_enviar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_msg_enviada)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_voltar)
                .addGap(18, 18, 18)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addComponent(txt_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_select_ctt)
                .addGap(18, 18, 18)
                .addComponent(cb_contatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_enviar)
                .addGap(40, 40, 40)
                .addComponent(lbl_msg_enviada)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void cb_contatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_contatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_contatosActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        lbl_msg_enviada.setVisible(true);
    }//GEN-LAST:event_btn_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JComboBox<String> cb_contatos;
    private javax.swing.JLabel lbl_msg_enviada;
    private javax.swing.JLabel lbl_select_ctt;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_msg;
    // End of variables declaration//GEN-END:variables
}