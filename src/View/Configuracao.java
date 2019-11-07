package View;

import DAO.JPAfactory;
import Util.Arquivo;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Configuracao extends javax.swing.JFrame {

    public Configuracao() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jLabelDriver = new javax.swing.JLabel();
        jLabelURL = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jComboBoxDriver = new javax.swing.JComboBox<>();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonConfigurar = new javax.swing.JButton();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPanelURL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeDoBanco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaUrl = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDriver.setText("Driver");

        jLabelURL.setText("URL");

        jLabelUsuario.setText("Usuário");

        jLabelSenha.setText("Senha");

        jComboBoxDriver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "com.mysql.jdbc.Driver" }));

        jTextFieldUsuario.setText("root");

        jButtonConfigurar.setText("Configurar");
        jButtonConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigurarActionPerformed(evt);
            }
        });

        jPasswordFieldSenha.setText("123456");

        jPanelURL.setBackground(new java.awt.Color(255, 255, 255));
        jPanelURL.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Ip");

        jTextFieldIp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldIpCaretUpdate(evt);
            }
        });

        jLabel2.setText("Porta");

        jTextFieldPorta.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPortaCaretUpdate(evt);
            }
        });

        jLabel3.setText("Nome do banco");

        jTextFieldNomeDoBanco.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldNomeDoBancoCaretUpdate(evt);
            }
        });

        jTextAreaUrl.setEditable(false);
        jTextAreaUrl.setColumns(20);
        jTextAreaUrl.setRows(5);
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
                        .addGap(0, 2, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDriver)
                    .addComponent(jLabelURL)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jButtonConfigurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDriver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelDriver)
                .addGap(2, 2, 2)
                .addComponent(jComboBoxDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelURL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelURL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSenha)
                .addGap(4, 4, 4)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonConfigurar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigurarActionPerformed

        HashMap propriedades = new HashMap<String, String>();
        propriedades.put("javax.persistence.jdbc.driver", this.jComboBoxDriver.getSelectedItem().toString());
        propriedades.put("javax.persistence.jdbc.url", this.jTextAreaUrl.getText());
        propriedades.put("javax.persistence.jdbc.user", this.jTextFieldUsuario.getText());
        propriedades.put("javax.persistence.jdbc.password", new String(this.jPasswordFieldSenha.getPassword()));

        ArrayList conexao = new ArrayList();
        conexao.add(this.jComboBoxDriver.getSelectedItem().toString());
        conexao.add(this.jTextAreaUrl.getText());
        conexao.add(this.jTextFieldUsuario.getText());
        conexao.add(new String(this.jPasswordFieldSenha.getPassword()));
        
        if(!this.testarConexao(conexao)) {
            JOptionPane.showMessageDialog(rootPane, "Conexão inválida!");
            return;
        }

        Arquivo.escrever("arquivos//conexao.txt", conexao);

        JPAfactory.configurar(propriedades);

        JOptionPane.showMessageDialog(rootPane, "Configuração de conexão salva com sucesso!");

        this.dispose();
    }//GEN-LAST:event_jButtonConfigurarActionPerformed

    public boolean testarConexao(ArrayList<String> conexao) {
        try {
            Class.forName((String) conexao.get(0));
            DriverManager.getConnection(conexao.get(1), conexao.get(2), conexao.get(3));
        } 
        catch (ClassNotFoundException | SQLException e) {
            return false;
        }
        return true;
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

    public void updateUrl() {
        this.jTextAreaUrl.setText(
                "jdbc:mysql://"
                + this.jTextFieldIp.getText() + ":"
                + this.jTextFieldPorta.getText() + "/"
                + this.jTextFieldNomeDoBanco.getText()
        );
    }

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfigurar;
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
