
package View;

import Controller.UsuarioController;
import DAO.JPAfactory;
import Model.Usuario;
import Util.Arquivo;
import Util.Table;
import java.util.ArrayList;
import java.util.HashMap;

public class Main extends javax.swing.JFrame {

    private final UsuarioController usuarioController = new UsuarioController();
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.configurar();
    }

    public void configurar() {
        ArrayList<String> conexao = Arquivo.ler("arquivos//conexao.txt");
        HashMap propriedades = new HashMap<String, String>();
        propriedades.put("javax.persistence.jdbc.driver", conexao.get(0));
        propriedades.put("javax.persistence.jdbc.url", conexao.get(1));
        propriedades.put("javax.persistence.jdbc.user", conexao.get(2));
        propriedades.put("javax.persistence.jdbc.password", conexao.get(3));
        JPAfactory.configurar(propriedades);
        
        Table.fill(this.usuarioController.select(), this.jTableUsuarios, Usuario.class);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuConfiguracoes = new javax.swing.JMenu();
        jMenuItemConexao = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemEventos = new javax.swing.JMenuItem();
        jMenuItemPessoas = new javax.swing.JMenuItem();
        jMenuItemInscricoes = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBg.setBackground(new java.awt.Color(255, 255, 255));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableUsuarios);

        javax.swing.GroupLayout jPanelBgLayout = new javax.swing.GroupLayout(jPanelBg);
        jPanelBg.setLayout(jPanelBgLayout);
        jPanelBgLayout.setHorizontalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBgLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanelBgLayout.setVerticalGroup(
            jPanelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBgLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jMenuBar.setBackground(new java.awt.Color(255, 255, 255));

        jMenuConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2x/baseline_settings_applications_black_18dp.png"))); // NOI18N
        jMenuConfiguracoes.setText("Configurar");
        jMenuConfiguracoes.setIconTextGap(8);

        jMenuItemConexao.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1x/baseline_sd_storage_black_18dp.png"))); // NOI18N
        jMenuItemConexao.setText("Conexão");
        jMenuItemConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConexaoActionPerformed(evt);
            }
        });
        jMenuConfiguracoes.add(jMenuItemConexao);

        jMenuBar.add(jMenuConfiguracoes);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2x/baseline_library_books_black_18dp.png"))); // NOI18N
        jMenu2.setText("Administrar");

        jMenuItemEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1x/baseline_event_black_18dp.png"))); // NOI18N
        jMenuItemEventos.setText("Eventos");
        jMenu2.add(jMenuItemEventos);

        jMenuItemPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1x/baseline_people_black_18dp.png"))); // NOI18N
        jMenuItemPessoas.setText("Pessoas");
        jMenu2.add(jMenuItemPessoas);

        jMenuItemInscricoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1x/baseline_event_available_black_18dp.png"))); // NOI18N
        jMenuItemInscricoes.setText("Inscrições");
        jMenu2.add(jMenuItemInscricoes);

        jMenuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1x/baseline_supervised_user_circle_black_18dp.png"))); // NOI18N
        jMenuItemUsuarios.setText("Usuários");
        jMenu2.add(jMenuItemUsuarios);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConexaoActionPerformed
        new Configuracao().setVisible(true);
    }//GEN-LAST:event_jMenuItemConexaoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuConfiguracoes;
    private javax.swing.JMenuItem jMenuItemConexao;
    private javax.swing.JMenuItem jMenuItemEventos;
    private javax.swing.JMenuItem jMenuItemInscricoes;
    private javax.swing.JMenuItem jMenuItemPessoas;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JPanel jPanelBg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
