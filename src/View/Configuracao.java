package View;

import Util.Conexao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Configuracao extends javax.swing.JDialog {
    
    public Configuracao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jPanelURL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeDoBanco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaUrl = new javax.swing.JTextArea();
        jLabelDriver = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelURL = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jComboBoxDriver = new javax.swing.JComboBox<String>();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonConfigurar = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonTestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração da conexão");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));

        jPanelURL.setBackground(new java.awt.Color(255, 255, 255));
        jPanelURL.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Ip");

        jTextFieldIp.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextFieldIp.setText("localhost");
        jTextFieldIp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldIpCaretUpdate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Porta");

        jTextFieldPorta.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextFieldPorta.setText("3306");
        jTextFieldPorta.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPortaCaretUpdate(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Nome do banco");

        jTextFieldNomeDoBanco.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextFieldNomeDoBanco.setText("mysql");
        jTextFieldNomeDoBanco.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldNomeDoBancoCaretUpdate(evt);
            }
        });

        jTextAreaUrl.setEditable(false);
        jTextAreaUrl.setColumns(20);
        jTextAreaUrl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextAreaUrl.setRows(5);
        jTextAreaUrl.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAreaUrlCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaUrl);

        javax.swing.GroupLayout jPanelURLLayout = new javax.swing.GroupLayout(jPanelURL);
        jPanelURL.setLayout(jPanelURLLayout);
        jPanelURLLayout.setHorizontalGroup(
            jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelURLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelURLLayout.createSequentialGroup()
                        .addGroup(jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldNomeDoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelURLLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(120, 120, 120)
                                    .addGroup(jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelURLLayout.setVerticalGroup(
            jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelURLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeDoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelDriver.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelDriver.setText("Driver");

        jLabelUsuario.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelUsuario.setText("Usuário");

        jLabelURL.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelURL.setText("URL");

        jLabelSenha.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha");

        jComboBoxDriver.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBoxDriver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "com.mysql.jdbc.Driver" }));

        jTextFieldUsuario.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextFieldUsuario.setText("root");
        jTextFieldUsuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldUsuarioCaretUpdate(evt);
            }
        });

        jButtonConfigurar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConfigurar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jButtonConfigurar.setText("Configurar");
        jButtonConfigurar.setEnabled(false);
        jButtonConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigurarActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jPasswordFieldSenha.setText("123456");
        jPasswordFieldSenha.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jPasswordFieldSenhaCaretUpdate(evt);
            }
        });

        jButtonTestar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTestar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jButtonTestar.setText("Testar");
        jButtonTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDriver)
                    .addComponent(jLabelURL)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jPanelURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                        .addComponent(jButtonTestar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDriver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelURL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSenha)
                .addGap(4, 4, 4)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTestar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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

    private void jButtonConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigurarActionPerformed

        Conexao con = new Conexao(
            this.jComboBoxDriver.getSelectedItem().toString(), 
            this.jTextFieldIp.getText(), 
            this.jTextFieldPorta.getText(), 
            this.jTextFieldUsuario.getText(),
            new String(this.jPasswordFieldSenha.getPassword()),
            this.jTextFieldNomeDoBanco.getText(),
            "none"
        );

        if(con.testar()) {
            con.configurar();
            con.salvar();
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Erro ao estabelecer conexao!", "Error", 0, new ImageIcon("icones//error.png"));
        }
    }//GEN-LAST:event_jButtonConfigurarActionPerformed

    public void updateUrl() {
        this.jTextAreaUrl.setText(
                "jdbc:mysql://"
                + this.jTextFieldIp.getText() + ":"
                + this.jTextFieldPorta.getText() + "/"
                + this.jTextFieldNomeDoBanco.getText()
        );
    }

    private void jTextFieldIpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldIpCaretUpdate
        this.updateUrl();
    }//GEN-LAST:event_jTextFieldIpCaretUpdate

    private void jTextFieldPortaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldPortaCaretUpdate
        this.updateUrl();
    }//GEN-LAST:event_jTextFieldPortaCaretUpdate

    private void jTextFieldNomeDoBancoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldNomeDoBancoCaretUpdate
        this.updateUrl();
    }//GEN-LAST:event_jTextFieldNomeDoBancoCaretUpdate

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(!Conexao.get().testar()) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestarActionPerformed
        Conexao con = new Conexao(
            this.jComboBoxDriver.getSelectedItem().toString(), 
            this.jTextFieldIp.getText(), 
            this.jTextFieldPorta.getText(), 
            this.jTextFieldUsuario.getText(),
            new String(this.jPasswordFieldSenha.getPassword()), 
            this.jTextFieldNomeDoBanco.getText(),
            "none"
        );
        if(con.testar()) {
            this.jButtonConfigurar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Conexão válida!", "Sucesso", 0, new ImageIcon("icones//success.png"));
        }
        else {
            JOptionPane.showMessageDialog(null, "Erro ao estabelecer conexao!", "Error", 0, new ImageIcon("icones//error.png"));
        }
    }//GEN-LAST:event_jButtonTestarActionPerformed

    private void jTextAreaUrlCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAreaUrlCaretUpdate
        this.jButtonConfigurar.setEnabled(false);
    }//GEN-LAST:event_jTextAreaUrlCaretUpdate

    private void jTextFieldUsuarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioCaretUpdate
        this.jButtonConfigurar.setEnabled(false);
    }//GEN-LAST:event_jTextFieldUsuarioCaretUpdate

    private void jPasswordFieldSenhaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaCaretUpdate
        this.jButtonConfigurar.setEnabled(false);
    }//GEN-LAST:event_jPasswordFieldSenhaCaretUpdate

    
    
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
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Configuracao dialog = new Configuracao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonConfigurar;
    private javax.swing.JButton jButtonTestar;
    private javax.swing.JComboBox<String> jComboBoxDriver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDriver;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelURL;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelURL;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaUrl;
    private javax.swing.JTextField jTextFieldIp;
    private javax.swing.JTextField jTextFieldNomeDoBanco;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
