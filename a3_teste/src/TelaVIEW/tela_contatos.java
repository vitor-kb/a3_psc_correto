package TelaVIEW;

import java.util.Calendar;

public class tela_contatos extends javax.swing.JFrame {

    TelaInicial enviaHorario;

    public tela_contatos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Contatos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_contCreusa = new javax.swing.JButton();
        btn_contGer = new javax.swing.JButton();
        btn_contFilho = new javax.swing.JButton();
        btn_contLurdes = new javax.swing.JButton();
        btn_contDroga = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_contCreusa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contCreusa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icone_pessoa.png")); // NOI18N
        btn_contCreusa.setText("Dona Creusa");
        btn_contCreusa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_contCreusa.setPreferredSize(new java.awt.Dimension(214, 55));

        btn_contGer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contGer.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icone_pessoa.png")); // NOI18N
        btn_contGer.setText("Gertrudes  Fisio");
        btn_contGer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_contFilho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contFilho.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icone_pessoa.png")); // NOI18N
        btn_contFilho.setText("Clebinho Filho");
        btn_contFilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_contFilho.setPreferredSize(new java.awt.Dimension(214, 55));

        btn_contLurdes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contLurdes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icone_pessoa.png")); // NOI18N
        btn_contLurdes.setText("Lurdes Cabelo 1");
        btn_contLurdes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_contLurdes.setPreferredSize(new java.awt.Dimension(214, 55));

        btn_contDroga.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contDroga.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icone_pessoa.png")); // NOI18N
        btn_contDroga.setText("Farma Drogasil");
        btn_contDroga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_contDroga.setPreferredSize(new java.awt.Dimension(214, 55));

        btn_voltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vitor\\Desktop\\a3_psc\\a3_teste\\src\\ICONS\\icon_voltar.png")); // NOI18N
        btn_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Contatos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_contFilho, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(btn_contGer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_contCreusa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_contLurdes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_contDroga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_contCreusa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_contGer, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_contFilho, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_contLurdes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 36, Short.MAX_VALUE)
                .addComponent(btn_contDroga, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        if (enviaHorario == null) {
            enviaHorario = new TelaInicial();
            Calendar c = Calendar.getInstance();
            enviaHorario.recebeHorario(c.get(Calendar.HOUR_OF_DAY) + ":" + String.valueOf(c.get(Calendar.MINUTE)));
            enviaHorario.setVisible(true);
        }
        setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_contatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_contatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_contatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_contatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_contatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_contCreusa;
    private javax.swing.JButton btn_contDroga;
    private javax.swing.JButton btn_contFilho;
    private javax.swing.JButton btn_contGer;
    private javax.swing.JButton btn_contLurdes;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
