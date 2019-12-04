
package View;

import Controller.UsuarioController;
import com.google.gson.JsonObject;

public class FormUsuario extends javax.swing.JDialog {

    private JsonObject json;
    private boolean editing = false;
    public static boolean cancel = true;
    
    public FormUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.json = new JsonObject();
        editing = false;
        cancel = true;
        this.setLocationRelativeTo(null);
    }
    
    public FormUsuario(java.awt.Frame parent, boolean modal, JsonObject json) {
        super(parent, modal);
        initComponents();
        editing = true;
        this.json = json;
        cancel = true;
        this.jTextFieldNome.setText(json.get("nome").getAsString());
        this.jTextFieldLogin.setText(json.get("login").getAsString());
        this.jComboBoxTipo.setSelectedItem(json.get("tipo").getAsString());
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBGUsuarioForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabelCancelar = new javax.swing.JLabel();
        jLabelConfirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de usuários");

        jPanelBGUsuarioForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jTextFieldNome.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jTextFieldLogin.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Tipo");

        jComboBoxTipo.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "comum" }));

        jPasswordFieldSenha.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Senha");

        jLabelCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCancelar.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabelCancelar.setForeground(new java.awt.Color(204, 51, 0));
        jLabelCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar.setText("Cancelar");
        jLabelCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)));
        jLabelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelarMouseClicked(evt);
            }
        });

        jLabelConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfirmar.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabelConfirmar.setForeground(new java.awt.Color(72, 136, 123));
        jLabelConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfirmar.setText("Confirmar");
        jLabelConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 136, 123)));
        jLabelConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConfirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelBGUsuarioFormLayout = new javax.swing.GroupLayout(jPanelBGUsuarioForm);
        jPanelBGUsuarioForm.setLayout(jPanelBGUsuarioFormLayout);
        jPanelBGUsuarioFormLayout.setHorizontalGroup(
            jPanelBGUsuarioFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGUsuarioFormLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelBGUsuarioFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBGUsuarioFormLayout.createSequentialGroup()
                        .addComponent(jLabelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBGUsuarioFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBGUsuarioFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelBGUsuarioFormLayout.setVerticalGroup(
            jPanelBGUsuarioFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGUsuarioFormLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanelBGUsuarioFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBGUsuarioForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBGUsuarioForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseClicked
        cancel = true;
        this.dispose();
    }//GEN-LAST:event_jLabelCancelarMouseClicked

    private void jLabelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfirmarMouseClicked
        json.addProperty("nome", this.jTextFieldNome.getText());
        json.addProperty("login", this.jTextFieldLogin.getText());
        json.addProperty("senha", new String(this.jPasswordFieldSenha.getPassword()));
        json.addProperty("tipo", this.jComboBoxTipo.getSelectedItem().toString());
        if(!editing)
            json.addProperty("id", 0);
        new UsuarioController().insert(json.toString());
        cancel = false;
        this.dispose();
    }//GEN-LAST:event_jLabelConfirmarMouseClicked

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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormUsuario dialog = new FormUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JLabel jLabelConfirmar;
    private javax.swing.JPanel jPanelBGUsuarioForm;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
