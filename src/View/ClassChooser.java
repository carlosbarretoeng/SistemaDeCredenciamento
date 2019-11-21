
package View;

import Model.Evento;
import Model.Inscricao;
import Model.Pessoa;
import Model.Usuario;
import javax.swing.JRootPane;

public class ClassChooser extends javax.swing.JDialog {

    public static Class class_ = null;
    
    public ClassChooser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jLabelInscricoes = new javax.swing.JLabel();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabelEventos = new javax.swing.JLabel();
        jLabelPessoas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(72, 136, 123));

        jLabelInscricoes.setFont(new java.awt.Font("Calibri Light", 2, 22)); // NOI18N
        jLabelInscricoes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInscricoes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Documents\\NetBeansProjects\\QReventJAVA\\icones\\2x\\baseline_event_available_black_18dp.png")); // NOI18N
        jLabelInscricoes.setText("   Inscrições");
        jLabelInscricoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscricoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscricoesMouseClicked(evt);
            }
        });

        jLabelUsuarios.setFont(new java.awt.Font("Calibri Light", 2, 22)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Documents\\NetBeansProjects\\QReventJAVA\\icones\\2x\\baseline_person_pin_black_18dp.png")); // NOI18N
        jLabelUsuarios.setText("   Usuários");
        jLabelUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseClicked(evt);
            }
        });

        jLabelEventos.setFont(new java.awt.Font("Calibri Light", 2, 22)); // NOI18N
        jLabelEventos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEventos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Documents\\NetBeansProjects\\QReventJAVA\\icones\\2x\\baseline_event_black_18dp.png")); // NOI18N
        jLabelEventos.setText("   Eventos");
        jLabelEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEventosMouseClicked(evt);
            }
        });

        jLabelPessoas.setFont(new java.awt.Font("Calibri Light", 2, 22)); // NOI18N
        jLabelPessoas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPessoas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\Documents\\NetBeansProjects\\QReventJAVA\\icones\\2x\\baseline_people_black_18dp.png")); // NOI18N
        jLabelPessoas.setText("   Pessoas");
        jLabelPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPessoasMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Os dados importados são de qual classe?");

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInscricoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPessoas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEventos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInscricoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPessoas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuarios)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseClicked
        ClassChooser.class_ = Evento.class;
        this.dispose();
    }//GEN-LAST:event_jLabelEventosMouseClicked

    private void jLabelInscricoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscricoesMouseClicked
        ClassChooser.class_ = Inscricao.class;
        this.dispose();
    }//GEN-LAST:event_jLabelInscricoesMouseClicked

    private void jLabelPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPessoasMouseClicked
        ClassChooser.class_ = Pessoa.class;
        this.dispose();
    }//GEN-LAST:event_jLabelPessoasMouseClicked

    private void jLabelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseClicked
        ClassChooser.class_ = Usuario.class;
        this.dispose();
    }//GEN-LAST:event_jLabelUsuariosMouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(ClassChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClassChooser dialog = new ClassChooser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEventos;
    private javax.swing.JLabel jLabelInscricoes;
    private javax.swing.JLabel jLabelPessoas;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JPanel jPanelBG;
    // End of variables declaration//GEN-END:variables
}
