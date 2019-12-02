
package View;

import Controller.CredenciamentoController;
import Controller.EventoController;
import Controller.InscricaoController;
import Controller.PessoaController;
import Model.Evento;
import Util.Conexao;
import Util.RingChartController;
import Util.Table;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Informacoes extends javax.swing.JDialog {
    
    public Informacoes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Conexao con = Conexao.get();
        if(!con.testar()) {
            new Configuracao(null, true).setVisible(true);
        }
        else {
            con.configurar();
        }
        
        this.jPanelChart.setLayout(new java.awt.BorderLayout());
                
        this.jLabelEventos.setText(String.valueOf(new EventoController().selectAmount()) + " eventos");
        this.jLabelPessoas.setText(String.valueOf(new PessoaController().selectAmount()) + " pessoas");
        this.jLabelInscricoes.setText(String.valueOf(new InscricaoController().selectAmount())  + " inscrições");
                
        this.jTableEventos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        this.jTableEventos.getTableHeader().setOpaque(false);
        this.jTableEventos.getTableHeader().setBackground(new Color(32, 136, 203));
        this.jTableEventos.setRowHeight(25);
                
        this.setLocationRelativeTo(null);
                
        this.fill();
        
        showPercent(Integer.parseInt((String)jTableEventos.getValueAt(jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "id"))));
        this.jLabelInscricoes.setText(InscricaoController.inscricoesRealizadas() + " inscrições realizadas");
        this.jLabelPresencas.setText(CredenciamentoController.presencasConfirmadas() + " presenças confirmadas");
        
        jTableEventos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                try {
                    update();
                }
                catch(Exception e) {}
            }
        });
    }   
    
    public void fill() {
        Table.fill(new EventoController().select(), jTableEventos, Evento.class);
    }
    
    public void showPercent(int evento) {
        try{
            double perc = EventoController.getPorcentagemCred(evento);
            this.jLabelEventosPerc.setText("Pessoas credenciadas (" + perc*100 + ")%");
            jPanelChart.add(new RingChartController(perc).createPanel(), BorderLayout.CENTER);
            jPanelChart.validate();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void showPercent() {
        try{
            double perc = EventoController.getPorcentagemCred();
            this.jLabelEventosPerc.setText("Pessoas credenciadas (" + perc*100 + ")%");
            jPanelChart.add(new RingChartController(perc).createPanel(), BorderLayout.CENTER);
            jPanelChart.validate();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jLabelEventos = new javax.swing.JLabel();
        jPanelChart = new javax.swing.JPanel();
        jLabelPessoas = new javax.swing.JLabel();
        jLabelInscricoes = new javax.swing.JLabel();
        jLabelPresencas = new javax.swing.JLabel();
        jLabelEventosPerc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabelEvento = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(45, 45, 45));

        jLabelEventos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelEventos.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEventos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEventos.setText("0 eventos");

        jPanelChart.setBackground(new java.awt.Color(45, 45, 45));

        javax.swing.GroupLayout jPanelChartLayout = new javax.swing.GroupLayout(jPanelChart);
        jPanelChart.setLayout(jPanelChartLayout);
        jPanelChartLayout.setHorizontalGroup(
            jPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelChartLayout.setVerticalGroup(
            jPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jLabelPessoas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelPessoas.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPessoas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPessoas.setText("0 pessoas");

        jLabelInscricoes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelInscricoes.setForeground(new java.awt.Color(204, 204, 204));
        jLabelInscricoes.setText("0 inscrições realizadas");

        jLabelPresencas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelPresencas.setForeground(new java.awt.Color(204, 204, 204));
        jLabelPresencas.setText("0 presenças confirmadas");

        jLabelEventosPerc.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelEventosPerc.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEventosPerc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEventosPerc.setText("Pessoas credenciadas (%)");

        jSeparator1.setForeground(new java.awt.Color(72, 136, 123));

        jLabel1.setBackground(new Color(255, 255, 255, 40));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(72, 136, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informações");

        jTableEventos.setBackground(new java.awt.Color(45, 45, 45));
        jTableEventos.setForeground(new java.awt.Color(255, 255, 255));
        jTableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEventos.setFocusable(false);
        jTableEventos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableEventos.setOpaque(false);
        jTableEventos.setRowHeight(25);
        jTableEventos.setSelectionBackground(new java.awt.Color(72, 136, 123));
        jTableEventos.setShowVerticalLines(false);
        jTableEventos.getTableHeader().setReorderingAllowed(false);
        jTableEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEventosMouseClicked(evt);
            }
        });
        jTableEventos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTableEventosCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTableEventos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableEventosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEventos);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Evento:");

        jLabelEvento.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelEvento.setForeground(new java.awt.Color(204, 204, 204));
        jLabelEvento.setText("todos");

        jComboBoxFiltro.setBackground(new java.awt.Color(45, 45, 45));
        jComboBoxFiltro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxFiltro.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "nome", "descrição", "local", "capacidade", "data_inicio", "data_termino", "horario_inicio", "horario_termino" }));
        jComboBoxFiltro.setOpaque(false);

        jTextFieldFiltro.setBackground(new java.awt.Color(45, 45, 45));
        jTextFieldFiltro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldFiltro.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldFiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextFieldFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldFiltroCaretUpdate(evt);
            }
        });

        jButtonTodos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTodos.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jButtonTodos.setForeground(new java.awt.Color(0, 153, 153));
        jButtonTodos.setText("Todos");
        jButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                                    .addComponent(jComboBoxFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelPresencas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelInscricoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEventosPerc, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEventos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelPessoas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabelEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButtonTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxFiltro)
                            .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEvento))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPresencas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEventosPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jPanelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(jPanelBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldFiltroCaretUpdate
        Table.filter(jTableEventos, this.jTextFieldFiltro.getText(), this.jComboBoxFiltro.getSelectedIndex());
        if(this.jTextFieldFiltro.getText().equals("")) {
            this.jLabelEvento.setText("todos");
            this.jLabelInscricoes.setText(String.valueOf(new InscricaoController().selectAmount())  + " inscrições");
        }
    }//GEN-LAST:event_jTextFieldFiltroCaretUpdate

    private void jTableEventosCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTableEventosCaretPositionChanged
        
    }//GEN-LAST:event_jTableEventosCaretPositionChanged

    private void jTableEventosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableEventosKeyTyped
        
    }//GEN-LAST:event_jTableEventosKeyTyped

    private void jTableEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosMouseClicked
        
    }//GEN-LAST:event_jTableEventosMouseClicked

    private void jButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodosActionPerformed
        showPercent();
        this.jLabelInscricoes.setText(InscricaoController.inscricoesRealizadas() + " inscrições realizadas");
        this.jLabelPresencas.setText(CredenciamentoController.presencasConfirmadas() + " presenças confirmadas");
        this.jLabelEvento.setText("todos");
    }//GEN-LAST:event_jButtonTodosActionPerformed

    public void update() {
        showPercent(Integer.parseInt((String)jTableEventos.getValueAt(jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "id"))));
        try{
            int id = Integer.parseInt((String) this.jTableEventos.getValueAt(this.jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "id")));
            String nome = (String) this.jTableEventos.getValueAt(this.jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "nome"));
            this.jLabelEvento.setText(nome);
            this.jLabelInscricoes.setText(InscricaoController.inscricoesRealizadas(id) + " inscrições realizadas");
            this.jLabelPresencas.setText(CredenciamentoController.presencasConfirmadas(id) + " presenças confirmadas");
        }
        catch(Exception e) {}
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
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Informacoes dialog = new Informacoes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonTodos;
    private javax.swing.JComboBox jComboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEvento;
    private javax.swing.JLabel jLabelEventos;
    private javax.swing.JLabel jLabelEventosPerc;
    private javax.swing.JLabel jLabelInscricoes;
    private javax.swing.JLabel jLabelPessoas;
    private javax.swing.JLabel jLabelPresencas;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelChart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEventos;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
