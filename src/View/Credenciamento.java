
package View;

import Controller.PessoaController;
import Model.Pessoa;
import Util.AuthService;
import Util.Relogio;
import Util.Table;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Credenciamento extends javax.swing.JDialog {
    
    private JsonObject evento;

    public Credenciamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public Credenciamento(java.awt.Frame parent, boolean modal, JsonObject evento) {
        super(parent, modal);
        initComponents();
        this.evento = evento;
        JPanel panel = new JPanel();
        panel.setBounds(new Rectangle(new Dimension(850, 280)));
        panel.setBackground(new Color(255, 255, 255));
        panel.add(new EventComponent(evento));
        this.jPanelBG.add(panel);
        this.repaint();
        this.revalidate();
        this.setLocationRelativeTo(null);
        this.jLabelIdUsuario.setText(AuthService.usuario.get("id").getAsString());
        this.jLabelNomeUsuario.setText(AuthService.usuario.get("nome").getAsString());
        this.jLabelVerPessoa.setIcon(new ImageIcon("icones//link.png"));
        Table.fill(new PessoaController().select(), jTablePessoas, Pessoa.class);
        new Relogio(this.jLabelData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jPanelUsuarioBG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelIdUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelFiltro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFiltroPessoa = new javax.swing.JComboBox();
        jTextFieldFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();
        jLabelVerPessoa = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelData1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));

        jPanelUsuarioBG.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUsuarioBG.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel1.setText("Usuário");

        jLabelNomeUsuario.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setText("Id");

        jLabelIdUsuario.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel5.setText("Nome");

        javax.swing.GroupLayout jPanelUsuarioBGLayout = new javax.swing.GroupLayout(jPanelUsuarioBG);
        jPanelUsuarioBG.setLayout(jPanelUsuarioBGLayout);
        jPanelUsuarioBGLayout.setHorizontalGroup(
            jPanelUsuarioBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioBGLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioBGLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelUsuarioBGLayout.createSequentialGroup()
                        .addGroup(jPanelUsuarioBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUsuarioBGLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanelUsuarioBGLayout.setVerticalGroup(
            jPanelUsuarioBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuarioBGLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuarioBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel2.setText("Filtros");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setText("Campo");

        jComboBoxFiltroPessoa.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jComboBoxFiltroPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nome", "cpf", "rg" }));

        jTextFieldFiltro.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTextFieldFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldFiltroCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltroLayout = new javax.swing.GroupLayout(jPanelFiltro);
        jPanelFiltro.setLayout(jPanelFiltroLayout);
        jPanelFiltroLayout.setHorizontalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFiltro)
                    .addGroup(jPanelFiltroLayout.createSequentialGroup()
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxFiltroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 331, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFiltroLayout.setVerticalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFiltroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFiltro)
                .addContainerGap())
        );

        jTablePessoas.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePessoas);

        jLabelVerPessoa.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelVerPessoa.setText("Ver pessoa");
        jLabelVerPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVerPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVerPessoaMouseClicked(evt);
            }
        });

        jLabelData.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelData.setText("Data");

        jLabelData1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelData1.setText("Data:");

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVerPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanelBGLayout.createSequentialGroup()
                            .addComponent(jPanelUsuarioBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addComponent(jLabelData1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelUsuarioBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jLabelData1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVerPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelVerPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVerPessoaMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTablePessoas.getValueAt(this.jTablePessoas.getSelectedRow(), Table.getColumnIndex(jTablePessoas, "id")));
            this.getDialog(new PessoaComponent(new JsonParser().parse(new PessoaController().select(id)).getAsJsonObject()), 680, 340);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Selecione alguma pessoa para ver!");
        }
    }//GEN-LAST:event_jLabelVerPessoaMouseClicked

    private void jTextFieldFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldFiltroCaretUpdate
        //Table.filter(jTablePessoas, this.jTextFieldFiltro.getText(), Table.getColumnIndex(jTablePessoas, this.jComboBoxFiltroPessoa.getSelectedItem().toString()));
    }//GEN-LAST:event_jTextFieldFiltroCaretUpdate

    public void getDialog(JPanel component, int w, int h) {
        JDialog dialog = new JDialog(this, true);
        dialog.setBounds(new Rectangle(new Dimension(w, h)));
        JPanel panel = new JPanel();
        panel.setBounds(new Rectangle(new Dimension(w, h)));
        panel.setBackground(new Color(255, 255, 255));
        panel.add(component);
        dialog.add(panel);
        dialog.repaint();
        dialog.revalidate();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
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
            java.util.logging.Logger.getLogger(Credenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Credenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Credenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Credenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Credenciamento dialog = new Credenciamento(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxFiltroPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelData1;
    private javax.swing.JLabel jLabelIdUsuario;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelVerPessoa;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelUsuarioBG;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePessoas;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
