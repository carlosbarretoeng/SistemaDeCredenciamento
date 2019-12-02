package View;

import Controller.CredenciamentoController;
import Controller.EventoController;
import Controller.InscricaoController;
import Controller.PessoaController;
import Model.Pessoa;
import Util.AuthService;
import Util.Relogio;
import Util.Table;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
        this.jLabelNomeEvento.setText(evento.get("nome").getAsString());
        this.setLocationRelativeTo(null);
        this.jLabelNomeUsuario.setText(AuthService.usuario.get("nome").getAsString());
        this.jLabelVerPessoa.setIcon(new ImageIcon("icones//link.png"));
        Table.fill(new InscricaoController().getPessoas(this.evento.get("id").getAsInt()), jTablePessoas, Pessoa.class);
        this.gerenciarCard();
        new Relogio(this.jLabelData);

        jTablePessoas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                try {
                    jLabelPessoa1.setText("NOME: " + (String) jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), Table.getColumnIndex(jTablePessoas, "nome")));
                    jLabelPessoaCPF1.setText("CPF: " + (String) jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), Table.getColumnIndex(jTablePessoas, "cpf")));   
                }
                catch(Exception e) {}
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelBG = new javax.swing.JPanel();
        jPanelFiltro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxFiltroPessoa = new javax.swing.JComboBox();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonFiltrarPess = new javax.swing.JButton();
        jLabelVerPessoa = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelData1 = new javax.swing.JLabel();
        jPanelCardCred = new javax.swing.JPanel();
        jPanelPessoa = new javax.swing.JPanel();
        jLabelPessoa = new javax.swing.JLabel();
        jButtonConfirmar1 = new javax.swing.JButton();
        jLabelPessoaCPF = new javax.swing.JLabel();
        jPanelPessoasList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();
        jLabelPessoa1 = new javax.swing.JLabel();
        jButtonConfirmar2 = new javax.swing.JButton();
        jLabelPessoaCPF1 = new javax.swing.JLabel();
        jPanelPessoasNone = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelNomeEvento = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));

        jPanelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel2.setText("Filtros");

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel4.setText("Campo");

        jComboBoxFiltroPessoa.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jComboBoxFiltroPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cpf", "rg", "nome" }));
        jComboBoxFiltroPessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFiltroPessoaItemStateChanged(evt);
            }
        });
        jComboBoxFiltroPessoa.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jComboBoxFiltroPessoaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jTextFieldFiltro.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTextFieldFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldFiltroCaretUpdate(evt);
            }
        });

        jButtonFiltrarPess.setText("Filtrar");
        jButtonFiltrarPess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarPessActionPerformed(evt);
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
                            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                                .addComponent(jComboBoxFiltroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFiltrarPess)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrarPess))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        jPanelCardCred.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCardCred.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCardCred.setLayout(new java.awt.CardLayout());

        jPanelPessoa.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPessoa.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabelPessoa.setForeground(new java.awt.Color(0, 102, 255));
        jLabelPessoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonConfirmar1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar1.setForeground(new java.awt.Color(0, 153, 51));
        jButtonConfirmar1.setText("Confirmar presença");
        jButtonConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmar1ActionPerformed(evt);
            }
        });

        jLabelPessoaCPF.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabelPessoaCPF.setForeground(new java.awt.Color(0, 102, 255));
        jLabelPessoaCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelPessoaLayout = new javax.swing.GroupLayout(jPanelPessoa);
        jPanelPessoa.setLayout(jPanelPessoaLayout);
        jPanelPessoaLayout.setHorizontalGroup(
            jPanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoaLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jButtonConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPessoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPessoaCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPessoaLayout.setVerticalGroup(
            jPanelPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPessoaLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabelPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabelPessoaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jPanelCardCred.add(jPanelPessoa, "card3");

        jPanelPessoasList.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 200));

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
        jTablePessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePessoasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePessoas);

        jLabelPessoa1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jButtonConfirmar2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConfirmar2.setForeground(new java.awt.Color(0, 153, 51));
        jButtonConfirmar2.setText("Confirmar presença");
        jButtonConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmar2ActionPerformed(evt);
            }
        });

        jLabelPessoaCPF1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelPessoasListLayout = new javax.swing.GroupLayout(jPanelPessoasList);
        jPanelPessoasList.setLayout(jPanelPessoasListLayout);
        jPanelPessoasListLayout.setHorizontalGroup(
            jPanelPessoasListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoasListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPessoasListLayout.createSequentialGroup()
                        .addGroup(jPanelPessoasListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPessoasListLayout.createSequentialGroup()
                                .addComponent(jLabelPessoaCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButtonConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelPessoa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPessoasListLayout.setVerticalGroup(
            jPanelPessoasListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPessoasListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPessoaCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanelCardCred.add(jPanelPessoasList, "card2");

        jPanelPessoasNone.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sem resultados...");

        javax.swing.GroupLayout jPanelPessoasNoneLayout = new javax.swing.GroupLayout(jPanelPessoasNone);
        jPanelPessoasNone.setLayout(jPanelPessoasNoneLayout);
        jPanelPessoasNoneLayout.setHorizontalGroup(
            jPanelPessoasNoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasNoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPessoasNoneLayout.setVerticalGroup(
            jPanelPessoasNoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasNoneLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel6)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jPanelCardCred.add(jPanelPessoasNone, "card2");

        jLabelStatus.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(51, 153, 0));
        jLabelStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabelNomeEvento.setFont(new java.awt.Font("Calibri Light", 1, 28)); // NOI18N
        jLabelNomeEvento.setForeground(new java.awt.Color(72, 136, 123));
        jLabelNomeEvento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabelNomeUsuario.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel7.setText("Usuário atual");

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelBGLayout.createSequentialGroup()
                            .addComponent(jLabelVerPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanelCardCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelBGLayout.createSequentialGroup()
                            .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBGLayout.createSequentialGroup()
                                    .addComponent(jLabelData1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelNomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(202, 202, 202)
                            .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNomeEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jLabelData1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCardCred, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelVerPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.gerenciarCard();
    }//GEN-LAST:event_jTextFieldFiltroCaretUpdate

    public void gerenciarCard() {
        Table.filter(jTablePessoas, this.jTextFieldFiltro.getText(), Table.getColumnIndex(jTablePessoas, this.jComboBoxFiltroPessoa.getSelectedItem().toString()));
        if (jTablePessoas.getRowCount() == 0) {
            this.alterarBox(jPanelPessoasNone);
        } else if (jTablePessoas.getRowCount() == 1) {
            this.alterarBox(jPanelPessoa);
            this.jLabelPessoa.setText("NOME: " + (String) this.jTablePessoas.getValueAt(0, Table.getColumnIndex(jTablePessoas, "nome")));
            this.jLabelPessoaCPF.setText("CPF: " + (String) jTablePessoas.getValueAt(0, Table.getColumnIndex(jTablePessoas, "cpf")));
        } else {
            this.alterarBox(jPanelPessoasList);
        }
    }

    private void jButtonFiltrarPessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarPessActionPerformed

    }//GEN-LAST:event_jButtonFiltrarPessActionPerformed

    private void jComboBoxFiltroPessoaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jComboBoxFiltroPessoaCaretPositionChanged

    }//GEN-LAST:event_jComboBoxFiltroPessoaCaretPositionChanged

    private void jTablePessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePessoasMouseClicked

    }//GEN-LAST:event_jTablePessoasMouseClicked

    private void jComboBoxFiltroPessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFiltroPessoaItemStateChanged
        this.gerenciarCard();
    }//GEN-LAST:event_jComboBoxFiltroPessoaItemStateChanged

    private void jButtonConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmar1ActionPerformed
        try {
            int id = Integer.parseInt((String) jTablePessoas.getValueAt(0, Table.getColumnIndex(jTablePessoas, "id")));
            this.confirmar(id);
            this.jTextFieldFiltro.setText("");
            this.showConfirm();
        } catch (Exception e) {
            showError();
        }
        Table.fill(new InscricaoController().getPessoas(this.evento.get("id").getAsInt()), jTablePessoas, Pessoa.class);
        this.gerenciarCard();
    }//GEN-LAST:event_jButtonConfirmar1ActionPerformed

    public void showConfirm() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                try {
                    jLabelStatus.setText("  Presença confirmada com sucesso!");
                    jLabelStatus.setIcon(new ImageIcon("icones//success.png"));
                    jLabelStatus.setForeground(new Color(51,153,0));
                    Thread.sleep(3000);
                    jLabelStatus.setText("");
                    jLabelStatus.setIcon(null);
                } catch (InterruptedException ex) {
                }
            }
        };
        new Thread(run).start();
    }
    
    public void showError() {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                try {
                    jLabelStatus.setText("  Erro ao confirmar presença!");
                    jLabelStatus.setIcon(new ImageIcon("icones//error.png"));
                    jLabelStatus.setForeground(new Color(204,0,0));
                    Thread.sleep(3000);
                    jLabelStatus.setText("");
                    jLabelStatus.setIcon(null);
                } catch (InterruptedException ex) {
                }
            }
        };
        new Thread(run).start();
    }

    private void jButtonConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmar2ActionPerformed
        try {
            int id = Integer.parseInt((String) jTablePessoas.getValueAt(jTablePessoas.getSelectedRow(), Table.getColumnIndex(jTablePessoas, "id")));
            this.confirmar(id);
            this.jTextFieldFiltro.setText("");
            this.showConfirm();
        } catch (Exception e) {
            showError();
        }
        Table.fill(new InscricaoController().getPessoas(this.evento.get("id").getAsInt()), jTablePessoas, Pessoa.class);
        this.gerenciarCard();
    }//GEN-LAST:event_jButtonConfirmar2ActionPerformed

    public void confirmar(int pessoa) {
        JsonObject cred = new JsonObject(), inscricao = new JsonParser().parse(new InscricaoController().getInscricao(this.evento.get("id").getAsInt(), pessoa)).getAsJsonObject(), usuario = new JsonObject();
        usuario.add("id", new JsonPrimitive(AuthService.usuario.get("id").getAsInt()));
        cred.add("inscricao", inscricao);
        cred.add("usuario", usuario);
        cred.add("data", new JsonPrimitive(new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
        cred.add("horario", new JsonPrimitive(new SimpleDateFormat("HH:mm:ss").format(new Date())));
        new CredenciamentoController().insert(cred.toString());
    }

    public void alterarBox(JPanel panel) {
        this.jPanelCardCred.removeAll();
        this.jPanelCardCred.add(panel);
        this.jPanelCardCred.repaint();
        this.jPanelCardCred.revalidate();
    }

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
    private javax.swing.JButton jButtonConfirmar1;
    private javax.swing.JButton jButtonConfirmar2;
    private javax.swing.JButton jButtonFiltrarPess;
    private javax.swing.JComboBox jComboBoxFiltroPessoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelData1;
    private javax.swing.JLabel jLabelNomeEvento;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelPessoa;
    private javax.swing.JLabel jLabelPessoa1;
    private javax.swing.JLabel jLabelPessoaCPF;
    private javax.swing.JLabel jLabelPessoaCPF1;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelVerPessoa;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelCardCred;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelPessoa;
    private javax.swing.JPanel jPanelPessoasList;
    private javax.swing.JPanel jPanelPessoasNone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePessoas;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
