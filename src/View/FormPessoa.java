
package View;

import Controller.PessoaController;
import com.google.gson.JsonObject;
import javax.swing.ImageIcon;

public class FormPessoa extends javax.swing.JDialog {

    public static boolean cancel = true;
    public JsonObject json;
    
    public FormPessoa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        json = new JsonObject();
        this.setLocationRelativeTo(null);
        this.jLabelConfirmar.setIcon(new ImageIcon("icones//success.png"));
        this.jLabelCancelar.setIcon(new ImageIcon("icones//error.png"));
        cancel = true;
    }
    
    public FormPessoa(java.awt.Frame parent, boolean modal, JsonObject json) {
        super(parent, modal);
        initComponents();
        
        this.json = json;
        
        this.jTextFieldMatricula.setText(json.get("matricula").getAsString());
        this.jTextFieldNome.setText(json.get("nome").getAsString());
        this.jTextFieldCidade.setText(json.get("cidade").getAsString());
        this.jTextFieldEmail.setText(json.get("email").getAsString());
        this.jTextFieldEndereco.setText(json.get("endereco").getAsString());
        this.jTextFieldTelefone.setText(json.get("telefone").getAsString());
        this.jFormattedTextFieldCpf.setText(json.get("cpf").getAsString());
        this.jFormattedTextFieldRg.setText(json.get("rg").getAsString());
        
        this.setLocationRelativeTo(null);
        this.jLabelConfirmar.setIcon(new ImageIcon("icones//success.png"));
        this.jLabelCancelar.setIcon(new ImageIcon("icones//error.png"));
        cancel = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBg = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jLabelcpf = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelCancelar = new javax.swing.JLabel();
        jLabelConfirmar = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelcpf1 = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBg.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNome.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelNome.setText("Nome");

        jTextFieldNome.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        jTextFieldEndereco.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        jLabelEndereco.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelEndereco.setText("Endereço");

        jTextFieldCidade.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        jLabelCidade.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelCidade.setText("Cidade");

        jTextFieldTelefone.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        jLabelTelefone.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelTelefone.setText("Telefone");

        jFormattedTextFieldCpf.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        jFormattedTextFieldRg.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        jLabelcpf.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelcpf.setText("Cpf");

        jLabelRg.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelRg.setText("Rg");

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

        jTextFieldEmail.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        jLabelEmail.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelEmail.setText("Email");

        jLabelcpf1.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N
        jLabelcpf1.setText("Matrícula");

        jTextFieldMatricula.setFont(new java.awt.Font("Calibri Light", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanelBgLayout = new javax.swing.GroupLayout(jPanelBg);
        jPanelBg.setLayout(jPanelBgLayout);
        jPanelBgLayout.setHorizontalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelEmail)
                        .addComponent(jLabelNome)
                        .addComponent(jTextFieldNome)
                        .addGroup(jPanelBgLayout.createSequentialGroup()
                            .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelcpf)
                                .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelRg)))
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelcpf1)
                    .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelEndereco)
                        .addComponent(jTextFieldEndereco)
                        .addGroup(jPanelBgLayout.createSequentialGroup()
                            .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCidade)
                                .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelTelefone)
                                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgLayout.createSequentialGroup()
                            .addComponent(jLabelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanelBgLayout.setVerticalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelcpf1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcpf)
                    .addComponent(jLabelRg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBgLayout.createSequentialGroup()
                        .addComponent(jLabelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseClicked
        this.dispose();
        FormPessoa.cancel = true;
    }//GEN-LAST:event_jLabelCancelarMouseClicked

    private void jLabelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfirmarMouseClicked
        json.addProperty("nome", this.jTextFieldNome.getText());
        json.addProperty("matricula", this.jTextFieldMatricula.getText());
        json.addProperty("cpf", this.jFormattedTextFieldCpf.getText());
        json.addProperty("rg", this.jFormattedTextFieldRg.getText());
        json.addProperty("endereco", this.jTextFieldEndereco.getText());
        json.addProperty("email", this.jTextFieldEmail.getText());
        json.addProperty("cidade", this.jTextFieldCidade.getText());
        json.addProperty("telefone", this.jTextFieldTelefone.getText());
        new PessoaController().insert(json.toString());
        this.dispose();
        cancel = false;
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
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPessoa dialog = new FormPessoa(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelConfirmar;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelcpf;
    private javax.swing.JLabel jLabelcpf1;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
