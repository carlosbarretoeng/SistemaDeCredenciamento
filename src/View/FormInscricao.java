
package View;

import Controller.EventoController;
import Controller.InscricaoController;
import Controller.PessoaController;
import Controller.UsuarioController;
import Model.Evento;
import Model.Pessoa;
import Model.Usuario;
import Util.AuthService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.JSONParser;

public class FormInscricao extends javax.swing.JFrame {

    public FormInscricao() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jLabelEvento = new javax.swing.JLabel();
        jTextFieldEvento = new javax.swing.JTextField();
        jLabelEventoQuery = new javax.swing.JLabel();
        jTextFieldPessoa = new javax.swing.JTextField();
        jLabelPessoaQuery = new javax.swing.JLabel();
        jLabelPessoa = new javax.swing.JLabel();
        jTextFieldEventoNome = new javax.swing.JTextField();
        jTextFieldPessoaNome = new javax.swing.JTextField();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelUsu = new javax.swing.JLabel();
        jLabelUsuarioNome = new javax.swing.JLabel();
        jLabelUsuarioId = new javax.swing.JLabel();
        jLabelCancelar = new javax.swing.JLabel();
        jLabelInscrever = new javax.swing.JLabel();
        jLabelStatusEvento = new javax.swing.JLabel();
        jLabelStatusPessoa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de inscrição");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEvento.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelEvento.setText("Evento");

        jTextFieldEvento.setEditable(false);
        jTextFieldEvento.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jTextFieldEvento.setText("-");

        jLabelEventoQuery.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelEventoQuery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEventoQuery.setText("...");
        jLabelEventoQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEventoQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEventoQueryMouseClicked(evt);
            }
        });

        jTextFieldPessoa.setEditable(false);
        jTextFieldPessoa.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jTextFieldPessoa.setText("-");

        jLabelPessoaQuery.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelPessoaQuery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPessoaQuery.setText("...");
        jLabelPessoaQuery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPessoaQuery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPessoaQueryMouseClicked(evt);
            }
        });

        jLabelPessoa.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelPessoa.setText("Pessoa");

        jTextFieldEventoNome.setEditable(false);
        jTextFieldEventoNome.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jTextFieldEventoNome.setText("-");

        jTextFieldPessoaNome.setEditable(false);
        jTextFieldPessoaNome.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jTextFieldPessoaNome.setText("-");

        jPanelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelUsu.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelUsu.setText("Usuário");

        jLabelUsuarioNome.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabelUsuarioNome.setText("Current user");

        jLabelUsuarioId.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabelUsuarioId.setText("-");

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabelUsu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabelUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUsuarioNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuarioNome)
                    .addComponent(jLabelUsuarioId))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabelInscrever.setBackground(new java.awt.Color(255, 255, 255));
        jLabelInscrever.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabelInscrever.setForeground(new java.awt.Color(72, 136, 123));
        jLabelInscrever.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInscrever.setText("Inscrever");
        jLabelInscrever.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 136, 123)));
        jLabelInscrever.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscrever.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscreverMouseClicked(evt);
            }
        });

        jLabelStatusEvento.setIcon(new javax.swing.ImageIcon("D:\\NetbeansProjects\\SistemaDeCredenciamento\\icones\\error.png")); // NOI18N

        jLabelStatusPessoa.setIcon(new javax.swing.ImageIcon("D:\\NetbeansProjects\\SistemaDeCredenciamento\\icones\\error.png")); // NOI18N

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addComponent(jLabelInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBGLayout.createSequentialGroup()
                            .addComponent(jTextFieldPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldPessoaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBGLayout.createSequentialGroup()
                            .addComponent(jLabelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelEventoQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelStatusEvento))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBGLayout.createSequentialGroup()
                            .addComponent(jLabelPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelPessoaQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelStatusPessoa))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBGLayout.createSequentialGroup()
                            .addComponent(jTextFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldEventoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEventoQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelStatusEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEventoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPessoaQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelStatusPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPessoaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelEventoQueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventoQueryMouseClicked
        new DialogQuery(this, true, new String[]{"id", "nome", "descricao", "data_inicio", "data_termino", "capacidade"} , new EventoController().select(), Evento.class).setVisible(true);
        this.jTextFieldEvento.setText(DialogQuery.id);
        if(DialogQuery.id.equals("-")) {
            this.jLabelStatusEvento.setIcon(new ImageIcon("icones//error.png"));
            this.jTextFieldEventoNome.setText("-");
        }
        else {
            this.jTextFieldEventoNome.setText(new Gson().fromJson(new EventoController().select(Integer.parseInt(DialogQuery.id)), JsonObject.class).get("nome").getAsString());    
            this.jLabelStatusEvento.setIcon(new ImageIcon("icones//success.png"));
        }
    }//GEN-LAST:event_jLabelEventoQueryMouseClicked

    private void jLabelPessoaQueryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPessoaQueryMouseClicked
        new DialogQuery(
            this,
            true, 
            new String[]{"id", "nome", "cpf", "rg", "endereco", "cidade", "telefone", "email", "matricula"}, 
            new PessoaController().select(), Pessoa.class
        ).setVisible(true);
        this.jTextFieldPessoa.setText(DialogQuery.id);
        if(DialogQuery.id.equals("-")) {
            this.jLabelStatusPessoa.setIcon(new ImageIcon("icones//error.png"));
            this.jTextFieldPessoaNome.setText("-");
        }
        else {
            this.jTextFieldPessoaNome.setText(new Gson().fromJson(new PessoaController().select(Integer.parseInt(DialogQuery.id)), JsonObject.class).get("nome").getAsString());    
            this.jLabelStatusPessoa.setIcon(new ImageIcon("icones//success.png"));
        }
    }//GEN-LAST:event_jLabelPessoaQueryMouseClicked

    private void jLabelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCancelarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.jLabelUsuarioNome.setText("Nome: " + AuthService.usuario.getNome());
        this.jLabelUsuarioId.setText("ID: " + String.valueOf(AuthService.usuario.getId()));
    }//GEN-LAST:event_formWindowOpened

    private void jLabelInscreverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscreverMouseClicked
        if(this.jTextFieldEvento.getText().equals("-")) {
            JOptionPane.showMessageDialog(rootPane, "Escolha um evento!", "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("icones//error.png"));
            return;
        }
        else if(this.jTextFieldPessoa.getText().equals("-")) {
            JOptionPane.showMessageDialog(rootPane, "Escolha uma pessoa!", "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon("icones//error.png"));
            return;
        }
        
    }//GEN-LAST:event_jLabelInscreverMouseClicked

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
            java.util.logging.Logger.getLogger(FormInscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInscricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInscricao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JLabel jLabelEvento;
    private javax.swing.JLabel jLabelEventoQuery;
    private javax.swing.JLabel jLabelInscrever;
    private javax.swing.JLabel jLabelPessoa;
    private javax.swing.JLabel jLabelPessoaQuery;
    private javax.swing.JLabel jLabelStatusEvento;
    private javax.swing.JLabel jLabelStatusPessoa;
    private javax.swing.JLabel jLabelUsu;
    private javax.swing.JLabel jLabelUsuarioId;
    private javax.swing.JLabel jLabelUsuarioNome;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JTextField jTextFieldEvento;
    private javax.swing.JTextField jTextFieldEventoNome;
    private javax.swing.JTextField jTextFieldPessoa;
    private javax.swing.JTextField jTextFieldPessoaNome;
    // End of variables declaration//GEN-END:variables
}
