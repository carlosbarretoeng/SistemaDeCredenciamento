package View;

import Controller.Controller;
import Controller.EventoController;
import Controller.InscricaoController;
import Controller.PessoaController;
import Controller.UsuarioController;
import Layouts.WrapLayout;
import Model.Base;
import Model.Evento;
import Model.Inscricao;
import Model.Pessoa;
import Model.Usuario;
import Util.AuthService;
import Util.Conexao;
import Util.Dados;
import Util.DataType;
import Util.Relogio;
import Util.Table;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        initComponents();
        Conexao con = Conexao.get();
        if (!con.testar()) {
            new Configuracao(this, true).setVisible(true);
        } 
        else {
            con.configurar();
        }
        this.setLayouts();
        this.getContentPane().setBackground(Color.white);
        new Dragged(this.jPanelDragged, this);
        this.setLocationRelativeTo(null);
        this.setIcons();
        this.jPanelSubConfigBG.setVisible(false);
        Table.fill(new EventoController().select(), jTableEventos, Evento.class);
        //this.gerenciarBotoes(AuthService.usuario.get("tipo").getAsString().equals("admin"));
        new Relogio(jLabelRelogio);
    }
    
    public void gerenciarBotoes(boolean admin) {
        this.jLabelAddUsuarios.setVisible(admin);
        this.jLabelAddEventos.setVisible(admin);
        this.jLabelEventosAtualizar.setVisible(admin);
        this.jLabelEventosExcluir.setVisible(admin);
        this.jLabelConfigDatabase.setVisible(admin);
        this.jLabelMenuUsuarios.setVisible(admin);
        this.jLabelMenuDados.setVisible(admin);
    }

    public void setIcons() {
        this.jLabelMenuEventos.setIcon(new ImageIcon("icones//eventos.png"));
        this.jLabelMenuPessoas.setIcon(new ImageIcon("icones//pessoas.png"));
        this.jLabelMenuInscricoes.setIcon(new ImageIcon("icones//inscricoes.png"));
        this.jLabelMenuUsuarios.setIcon(new ImageIcon("icones//usuarios.png"));
        this.jLabelMenuConfig.setIcon(new ImageIcon("icones//configuracoes.png"));
        this.jLabelConfigDatabase.setIcon(new ImageIcon("icones//server.png"));
        this.jLabelLogout.setIcon(new ImageIcon("icones//log-out.png"));
        this.jLabelReloadEventos.setIcon(new ImageIcon("icones//refreshing.png"));
        this.jLabelReloadInscricoes.setIcon(new ImageIcon("icones//refreshing.png"));
        this.jLabelReloadPessoas.setIcon(new ImageIcon("icones//refreshing.png"));
        this.jLabelReloadUsuarios.setIcon(new ImageIcon("icones//refreshing.png"));
        this.jLabelAddEventos.setIcon(new ImageIcon("icones//add.png"));
        this.jLabelAddInscricoes.setIcon(new ImageIcon("icones//add.png"));
        this.jLabelAddPessoas.setIcon(new ImageIcon("icones//add.png"));
        this.jLabelAddUsuarios.setIcon(new ImageIcon("icones//add.png"));
        this.jLabelMenuDados.setIcon(new ImageIcon("icones//folder.png"));
        this.jLabelArrowImp.setIcon(new ImageIcon("icones//right-arrow.png"));
        this.jLabelArrowExp.setIcon(new ImageIcon("icones//right-arrow.png"));
        this.jLabelMenuInformacoes.setIcon(new ImageIcon("icones//information.png"));
        this.jLabelInscBuscarEvento.setIcon(new ImageIcon("icones//link.png"));
        this.jLabelInscBuscarPessoa.setIcon(new ImageIcon("icones//link.png"));
        this.jLabelInscVerEvento.setIcon(new ImageIcon("icones//link.png"));
        this.jLabelInscVerPessoa.setIcon(new ImageIcon("icones//link.png"));
        this.jLabelEventosAtualizar.setIcon(new ImageIcon("icones//atualizar.png"));
        this.jLabelEventosExcluir.setIcon(new ImageIcon("icones//error.png"));
        this.jLabelVerEvento.setIcon(new ImageIcon("icones//link.png"));
        this.jLabelPessoasAtualizar.setIcon(new ImageIcon("icones//atualizar.png"));
        this.jLabelPessoasExcluir.setIcon(new ImageIcon("icones//error.png"));
        this.jLabelVerPessoa.setIcon(new ImageIcon("icones//link.png"));
        this.jLabelInscricaoAtualizar.setIcon(new ImageIcon("icones//atualizar.png"));
        this.jLabelInscricaoExcluir.setIcon(new ImageIcon("icones//error.png"));
        this.jLabelEventosCredenciamento.setIcon(new ImageIcon("icones//inscricoes.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDataType = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jPanelContent = new javax.swing.JPanel();
        jPanelEventos = new javax.swing.JPanel();
        jLabelEventos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jPanelEventosFiltro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEventoFiltro = new javax.swing.JComboBox();
        jTextFieldEventoFiltro = new javax.swing.JTextField();
        jLabelVerEvento = new javax.swing.JLabel();
        jLabelEventosAtualizar = new javax.swing.JLabel();
        jLabelEventosExcluir = new javax.swing.JLabel();
        jLabelEventosCredenciamento = new javax.swing.JLabel();
        jLabelReloadEventos = new javax.swing.JLabel();
        jLabelAddEventos = new javax.swing.JLabel();
        jPanelPessoas = new javax.swing.JPanel();
        jLabelPessoas = new javax.swing.JLabel();
        jLabelReloadPessoas = new javax.swing.JLabel();
        jLabelAddPessoas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();
        jPanelEventosPessoas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxPessoaFiltro = new javax.swing.JComboBox();
        jTextFieldPessoaFiltro = new javax.swing.JTextField();
        jLabelVerPessoa = new javax.swing.JLabel();
        jLabelPessoasAtualizar = new javax.swing.JLabel();
        jLabelPessoasExcluir = new javax.swing.JLabel();
        jPanelInscricoes = new javax.swing.JPanel();
        jLabelInscricoes = new javax.swing.JLabel();
        jLabelReloadInscricoes = new javax.swing.JLabel();
        jLabelAddInscricoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInscricoes = new javax.swing.JTable();
        jPanelInscFiltros = new javax.swing.JPanel();
        jTextFieldInscFiltroEvento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldInscFiltroPessoa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldInscFiltroData = new javax.swing.JTextField();
        jLabelInscBuscarEvento = new javax.swing.JLabel();
        jLabelInscBuscarPessoa = new javax.swing.JLabel();
        jLabelInscLimparBuscaEvento = new javax.swing.JLabel();
        jLabelInscLimparBuscaPessoa = new javax.swing.JLabel();
        jLabelInscVerEvento = new javax.swing.JLabel();
        jLabelInscVerPessoa = new javax.swing.JLabel();
        jLabelInscricaoAtualizar = new javax.swing.JLabel();
        jLabelInscricaoExcluir = new javax.swing.JLabel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabelReloadUsuarios = new javax.swing.JLabel();
        jLabelAddUsuarios = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jPanelFiltro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxFiltroUsu = new javax.swing.JComboBox();
        jTextFieldFiltroUsu = new javax.swing.JTextField();
        jLabelUsuarioExcluir = new javax.swing.JLabel();
        jLabelUsuarioAtualizar = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        jPanelDadosBG = new javax.swing.JPanel();
        jLabelDadosTitle = new javax.swing.JLabel();
        jPanelimportBG = new javax.swing.JPanel();
        jLabelTitleImport = new javax.swing.JLabel();
        jScrollPaneListClasses = new javax.swing.JScrollPane();
        jListClasses = new javax.swing.JList();
        jLabelArrowImp = new javax.swing.JLabel();
        jLabelHist = new javax.swing.JLabel();
        jLabelImpClasses = new javax.swing.JLabel();
        jScrollPaneHist = new javax.swing.JScrollPane();
        jPanelImportados = new javax.swing.JPanel();
        jPanelExportBG = new javax.swing.JPanel();
        jLabelTitleExport = new javax.swing.JLabel();
        jScrollPaneListClasses1 = new javax.swing.JScrollPane();
        jListClassesExp = new javax.swing.JList();
        jLabelArrowExp = new javax.swing.JLabel();
        jLabelHistExp = new javax.swing.JLabel();
        jLabelExpClasses = new javax.swing.JLabel();
        jScrollPaneHist1 = new javax.swing.JScrollPane();
        jPanelExportados = new javax.swing.JPanel();
        jRadioButtonXml = new javax.swing.JRadioButton();
        jRadioButtonJson = new javax.swing.JRadioButton();
        jPanelSideMenu = new javax.swing.JPanel();
        jLabelMenuEventos = new javax.swing.JLabel();
        jLabelMenuPessoas = new javax.swing.JLabel();
        jLabelMenuInscricoes = new javax.swing.JLabel();
        jLabelMenuUsuarios = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelMenuConfig = new javax.swing.JLabel();
        jPanelSubConfigBG = new javax.swing.JPanel();
        jPanelSubMenuConfig = new javax.swing.JPanel();
        jLabelConfigDatabase = new javax.swing.JLabel();
        jLabelLogout = new javax.swing.JLabel();
        jLabelRelogio = new javax.swing.JLabel();
        jLabelMenuDados = new javax.swing.JLabel();
        jLabelMenuInformacoes = new javax.swing.JLabel();
        jPanelDragged = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanelContent.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContent.setLayout(new java.awt.CardLayout());

        jPanelEventos.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEventos.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabelEventos.setForeground(new java.awt.Color(72, 136, 123));
        jLabelEventos.setText("Eventos");

        jTableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableEventos);

        jPanelEventosFiltro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEventosFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Filtro");

        jComboBoxEventoFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "nome", "descricao", "local", "capacidade", "data_inicio", "data_termino", "horario_inicio", "horario_termino" }));

        jTextFieldEventoFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldEventoFiltroCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanelEventosFiltroLayout = new javax.swing.GroupLayout(jPanelEventosFiltro);
        jPanelEventosFiltro.setLayout(jPanelEventosFiltroLayout);
        jPanelEventosFiltroLayout.setHorizontalGroup(
            jPanelEventosFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEventosFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEventosFiltroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelEventosFiltroLayout.createSequentialGroup()
                        .addComponent(jComboBoxEventoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEventoFiltro)))
                .addContainerGap())
        );
        jPanelEventosFiltroLayout.setVerticalGroup(
            jPanelEventosFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosFiltroLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEventosFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEventoFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jComboBoxEventoFiltro))
                .addContainerGap())
        );

        jLabelVerEvento.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelVerEvento.setText("Ver evento");
        jLabelVerEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVerEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVerEventoMouseClicked(evt);
            }
        });

        jLabelEventosAtualizar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelEventosAtualizar.setForeground(new java.awt.Color(102, 204, 255));
        jLabelEventosAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEventosAtualizar.setText("  Atualizar  ");
        jLabelEventosAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEventosAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEventosAtualizarMouseClicked(evt);
            }
        });

        jLabelEventosExcluir.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelEventosExcluir.setForeground(new java.awt.Color(204, 0, 51));
        jLabelEventosExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEventosExcluir.setText("  Excluir  ");
        jLabelEventosExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEventosExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEventosExcluirMouseClicked(evt);
            }
        });

        jLabelEventosCredenciamento.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelEventosCredenciamento.setForeground(new java.awt.Color(0, 153, 51));
        jLabelEventosCredenciamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEventosCredenciamento.setText("Credenciamento");
        jLabelEventosCredenciamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelEventosCredenciamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEventosCredenciamentoMouseClicked(evt);
            }
        });

        jLabelReloadEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelReloadEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReloadEventosMouseClicked(evt);
            }
        });

        jLabelAddEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddEventosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelEventosLayout = new javax.swing.GroupLayout(jPanelEventos);
        jPanelEventos.setLayout(jPanelEventosLayout);
        jPanelEventosLayout.setHorizontalGroup(
            jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEventosLayout.createSequentialGroup()
                        .addComponent(jLabelEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 770, Short.MAX_VALUE)
                        .addComponent(jLabelAddEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReloadEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelEventosLayout.createSequentialGroup()
                            .addComponent(jLabelVerEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelEventosCredenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(418, 418, 418)
                            .addComponent(jLabelEventosAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelEventosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
                        .addComponent(jPanelEventosFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanelEventosLayout.setVerticalGroup(
            jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEventosLayout.createSequentialGroup()
                        .addComponent(jLabelEventos)
                        .addGap(7, 7, 7))
                    .addComponent(jLabelAddEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReloadEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jPanelEventosFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelVerEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEventosCredenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEventosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEventosAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelContent.add(jPanelEventos, "card2");

        jPanelPessoas.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPessoas.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabelPessoas.setForeground(new java.awt.Color(72, 136, 123));
        jLabelPessoas.setText("Pessoas");

        jLabelReloadPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelAddPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddPessoasMouseClicked(evt);
            }
        });

        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTablePessoas);

        jPanelEventosPessoas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEventosPessoas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Filtro");

        jComboBoxPessoaFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "matricula", "nome", "cpf", "rg", "endereco", "cidade", "email", "telefone" }));

        jTextFieldPessoaFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldPessoaFiltroCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanelEventosPessoasLayout = new javax.swing.GroupLayout(jPanelEventosPessoas);
        jPanelEventosPessoas.setLayout(jPanelEventosPessoasLayout);
        jPanelEventosPessoasLayout.setHorizontalGroup(
            jPanelEventosPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosPessoasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEventosPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEventosPessoasLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelEventosPessoasLayout.createSequentialGroup()
                        .addComponent(jComboBoxPessoaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPessoaFiltro)))
                .addContainerGap())
        );
        jPanelEventosPessoasLayout.setVerticalGroup(
            jPanelEventosPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosPessoasLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEventosPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPessoaFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jComboBoxPessoaFiltro))
                .addContainerGap())
        );

        jLabelVerPessoa.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelVerPessoa.setText("Ver pessoa");
        jLabelVerPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelVerPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVerPessoaMouseClicked(evt);
            }
        });

        jLabelPessoasAtualizar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelPessoasAtualizar.setForeground(new java.awt.Color(102, 204, 255));
        jLabelPessoasAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPessoasAtualizar.setText("  Atualizar  ");
        jLabelPessoasAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPessoasAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPessoasAtualizarMouseClicked(evt);
            }
        });

        jLabelPessoasExcluir.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelPessoasExcluir.setForeground(new java.awt.Color(204, 0, 51));
        jLabelPessoasExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPessoasExcluir.setText("  Excluir  ");
        jLabelPessoasExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPessoasExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPessoasExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPessoasLayout = new javax.swing.GroupLayout(jPanelPessoas);
        jPanelPessoas.setLayout(jPanelPessoasLayout);
        jPanelPessoasLayout.setHorizontalGroup(
            jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPessoasLayout.createSequentialGroup()
                        .addComponent(jLabelPessoas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 768, Short.MAX_VALUE)
                        .addComponent(jLabelAddPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReloadPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelEventosPessoas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPessoasLayout.createSequentialGroup()
                            .addComponent(jLabelVerPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(595, 595, 595)
                            .addComponent(jLabelPessoasAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelPessoasExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelPessoasLayout.setVerticalGroup(
            jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPessoas)
                    .addComponent(jLabelAddPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReloadPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEventosPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPessoasAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelPessoasExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelVerPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelContent.add(jPanelPessoas, "card2");

        jPanelInscricoes.setBackground(new java.awt.Color(255, 255, 255));

        jLabelInscricoes.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabelInscricoes.setForeground(new java.awt.Color(72, 136, 123));
        jLabelInscricoes.setText("Inscrições");

        jLabelReloadInscricoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelReloadInscricoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReloadInscricoesMouseClicked(evt);
            }
        });

        jLabelAddInscricoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddInscricoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddInscricoesMouseClicked(evt);
            }
        });

        jTableInscricoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableInscricoes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableInscricoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInscricoesMouseClicked(evt);
            }
        });
        jTableInscricoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableInscricoesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInscricoes);

        jPanelInscFiltros.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInscFiltros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldInscFiltroEvento.setEditable(false);
        jTextFieldInscFiltroEvento.setText("-");
        jTextFieldInscFiltroEvento.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldInscFiltroEventoCaretUpdate(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Evento");

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Pessoa");

        jTextFieldInscFiltroPessoa.setEditable(false);
        jTextFieldInscFiltroPessoa.setText("-");
        jTextFieldInscFiltroPessoa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldInscFiltroPessoaCaretUpdate(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Data");

        jTextFieldInscFiltroData.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldInscFiltroDataCaretUpdate(evt);
            }
        });

        jLabelInscBuscarEvento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelInscBuscarEvento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInscBuscarEvento.setText("Buscar");
        jLabelInscBuscarEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscBuscarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscBuscarEventoMouseClicked(evt);
            }
        });

        jLabelInscBuscarPessoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelInscBuscarPessoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelInscBuscarPessoa.setText("Buscar");
        jLabelInscBuscarPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscBuscarPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscBuscarPessoaMouseClicked(evt);
            }
        });

        jLabelInscLimparBuscaEvento.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelInscLimparBuscaEvento.setForeground(new java.awt.Color(204, 51, 0));
        jLabelInscLimparBuscaEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInscLimparBuscaEvento.setText("x");
        jLabelInscLimparBuscaEvento.setToolTipText("Limpar filtro de evento");
        jLabelInscLimparBuscaEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscLimparBuscaEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscLimparBuscaEventoMouseClicked(evt);
            }
        });

        jLabelInscLimparBuscaPessoa.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelInscLimparBuscaPessoa.setForeground(new java.awt.Color(204, 51, 0));
        jLabelInscLimparBuscaPessoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInscLimparBuscaPessoa.setText("x");
        jLabelInscLimparBuscaPessoa.setToolTipText("Limpar filtro de pessoa");
        jLabelInscLimparBuscaPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscLimparBuscaPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscLimparBuscaPessoaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelInscFiltrosLayout = new javax.swing.GroupLayout(jPanelInscFiltros);
        jPanelInscFiltros.setLayout(jPanelInscFiltrosLayout);
        jPanelInscFiltrosLayout.setHorizontalGroup(
            jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInscFiltrosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldInscFiltroData, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelInscFiltrosLayout.createSequentialGroup()
                        .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelInscFiltrosLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldInscFiltroEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInscFiltrosLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldInscFiltroPessoa)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelInscBuscarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabelInscBuscarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInscLimparBuscaEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInscLimparBuscaPessoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)))
                .addContainerGap())
        );
        jPanelInscFiltrosLayout.setVerticalGroup(
            jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInscBuscarEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldInscFiltroEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabelInscLimparBuscaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInscBuscarPessoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldInscFiltroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabelInscLimparBuscaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInscFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInscFiltroData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jLabelInscVerEvento.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelInscVerEvento.setText("  Ver Evento");
        jLabelInscVerEvento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelInscVerEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscVerEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscVerEventoMouseClicked(evt);
            }
        });

        jLabelInscVerPessoa.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelInscVerPessoa.setText("  Ver Pessoa");
        jLabelInscVerPessoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelInscVerPessoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscVerPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscVerPessoaMouseClicked(evt);
            }
        });

        jLabelInscricaoAtualizar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelInscricaoAtualizar.setForeground(new java.awt.Color(102, 204, 255));
        jLabelInscricaoAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInscricaoAtualizar.setText("  Atualizar  ");
        jLabelInscricaoAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscricaoAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscricaoAtualizarMouseClicked(evt);
            }
        });

        jLabelInscricaoExcluir.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelInscricaoExcluir.setForeground(new java.awt.Color(204, 0, 51));
        jLabelInscricaoExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInscricaoExcluir.setText("  Excluir  ");
        jLabelInscricaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInscricaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInscricaoExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelInscricoesLayout = new javax.swing.GroupLayout(jPanelInscricoes);
        jPanelInscricoes.setLayout(jPanelInscricoesLayout);
        jPanelInscricoesLayout.setHorizontalGroup(
            jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInscricoesLayout.createSequentialGroup()
                .addGroup(jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInscricoesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInscricaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInscricaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInscricoesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInscricoesLayout.createSequentialGroup()
                                .addComponent(jLabelInscricoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAddInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelReloadInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInscricoesLayout.createSequentialGroup()
                                .addComponent(jPanelInscFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelInscVerPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelInscVerEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPanelInscricoesLayout.setVerticalGroup(
            jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscricoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelReloadInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInscricoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelInscFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelInscVerPessoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInscVerEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInscricaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInscricaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelContent.add(jPanelInscricoes, "card2");

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jLabelUsuarios.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(72, 136, 123));
        jLabelUsuarios.setText("Usuários");

        jLabelReloadUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelAddUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAddUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddUsuariosMouseClicked(evt);
            }
        });

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableUsuarios);

        jPanelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel6.setText("Filtros");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel7.setText("Campo");

        jComboBoxFiltroUsu.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jComboBoxFiltroUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nome", "cpf", "rg" }));

        jTextFieldFiltroUsu.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTextFieldFiltroUsu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldFiltroUsuCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltroLayout = new javax.swing.GroupLayout(jPanelFiltro);
        jPanelFiltro.setLayout(jPanelFiltroLayout);
        jPanelFiltroLayout.setHorizontalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFiltroUsu)
                    .addGroup(jPanelFiltroLayout.createSequentialGroup()
                        .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxFiltroUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelFiltroLayout.setVerticalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFiltroUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFiltroUsu)
                .addContainerGap())
        );

        jLabelUsuarioExcluir.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelUsuarioExcluir.setForeground(new java.awt.Color(204, 0, 51));
        jLabelUsuarioExcluir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUsuarioExcluir.setText("  Excluir  ");
        jLabelUsuarioExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelUsuarioExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuarioExcluirMouseClicked(evt);
            }
        });

        jLabelUsuarioAtualizar.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelUsuarioAtualizar.setForeground(new java.awt.Color(102, 204, 255));
        jLabelUsuarioAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUsuarioAtualizar.setText("  Atualizar  ");
        jLabelUsuarioAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelUsuarioAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuarioAtualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelUsuarioAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUsuarioExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabelUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAddUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelReloadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReloadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuarioAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuarioExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelContent.add(jPanelUsuarios, "card2");

        jPanelDadosBG.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDadosTitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelDadosTitle.setForeground(new java.awt.Color(72, 136, 123));
        jLabelDadosTitle.setText("Dados");

        jPanelimportBG.setBackground(new java.awt.Color(255, 255, 255));
        jPanelimportBG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelimportBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelimportBGMouseClicked(evt);
            }
        });

        jLabelTitleImport.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTitleImport.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleImport.setText("Importação");

        jListClasses.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jListClasses.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Eventos", "Pessoas", "Inscrições", "Usuários" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListClasses.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPaneListClasses.setViewportView(jListClasses);

        jLabelArrowImp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelArrowImp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelArrowImp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelArrowImpMouseClicked(evt);
            }
        });

        jLabelHist.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelHist.setText("Histórico");

        jLabelImpClasses.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelImpClasses.setText("Classes");

        jPanelImportados.setBackground(new java.awt.Color(255, 255, 255));
        jPanelImportados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneHist.setViewportView(jPanelImportados);

        javax.swing.GroupLayout jPanelimportBGLayout = new javax.swing.GroupLayout(jPanelimportBG);
        jPanelimportBG.setLayout(jPanelimportBGLayout);
        jPanelimportBGLayout.setHorizontalGroup(
            jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelimportBGLayout.createSequentialGroup()
                .addGroup(jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelimportBGLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jScrollPaneListClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelArrowImp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPaneHist, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelimportBGLayout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelimportBGLayout.createSequentialGroup()
                                .addComponent(jLabelImpClasses)
                                .addGap(305, 305, 305)
                                .addComponent(jLabelHist))
                            .addGroup(jPanelimportBGLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabelTitleImport)))))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanelimportBGLayout.setVerticalGroup(
            jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelimportBGLayout.createSequentialGroup()
                .addGroup(jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelimportBGLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHist)
                            .addComponent(jLabelImpClasses)))
                    .addGroup(jPanelimportBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitleImport)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelimportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPaneListClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPaneHist, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelimportBGLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabelArrowImp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        jPanelExportBG.setBackground(new java.awt.Color(255, 255, 255));
        jPanelExportBG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelExportBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelExportBGMouseClicked(evt);
            }
        });

        jLabelTitleExport.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTitleExport.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitleExport.setText("Exportação");

        jListClassesExp.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jListClassesExp.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Eventos", "Pessoas", "Inscrições", "Usuários" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListClassesExp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPaneListClasses1.setViewportView(jListClassesExp);

        jLabelArrowExp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelArrowExp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelArrowExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelArrowExpMouseClicked(evt);
            }
        });

        jLabelHistExp.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelHistExp.setText("Histórico");

        jLabelExpClasses.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelExpClasses.setText("Classes");

        jPanelExportados.setBackground(new java.awt.Color(255, 255, 255));
        jPanelExportados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPaneHist1.setViewportView(jPanelExportados);

        javax.swing.GroupLayout jPanelExportBGLayout = new javax.swing.GroupLayout(jPanelExportBG);
        jPanelExportBG.setLayout(jPanelExportBGLayout);
        jPanelExportBGLayout.setHorizontalGroup(
            jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportBGLayout.createSequentialGroup()
                .addGroup(jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExportBGLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelExportBGLayout.createSequentialGroup()
                                .addComponent(jLabelExpClasses)
                                .addGap(305, 305, 305)
                                .addComponent(jLabelHistExp))
                            .addGroup(jPanelExportBGLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabelTitleExport))))
                    .addGroup(jPanelExportBGLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jScrollPaneListClasses1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabelArrowExp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPaneHist1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelExportBGLayout.setVerticalGroup(
            jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExportBGLayout.createSequentialGroup()
                .addGroup(jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExportBGLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHistExp)
                            .addComponent(jLabelExpClasses)))
                    .addGroup(jPanelExportBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitleExport)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExportBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPaneListClasses1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPaneHist1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExportBGLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabelArrowExp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        buttonGroupDataType.add(jRadioButtonXml);
        jRadioButtonXml.setText("XML");

        buttonGroupDataType.add(jRadioButtonJson);
        jRadioButtonJson.setSelected(true);
        jRadioButtonJson.setText("JSON");

        javax.swing.GroupLayout jPanelDadosBGLayout = new javax.swing.GroupLayout(jPanelDadosBG);
        jPanelDadosBG.setLayout(jPanelDadosBGLayout);
        jPanelDadosBGLayout.setHorizontalGroup(
            jPanelDadosBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDadosTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonJson)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonXml)
                .addGap(16, 16, 16))
            .addGroup(jPanelDadosBGLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelDadosBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExportBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelimportBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDadosBGLayout.setVerticalGroup(
            jPanelDadosBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosBGLayout.createSequentialGroup()
                .addGroup(jPanelDadosBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosBGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelDadosTitle))
                    .addGroup(jPanelDadosBGLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelDadosBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonXml)
                            .addComponent(jRadioButtonJson))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jPanelimportBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExportBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDadosBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDadosBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelContent.add(jPanelDados, "card6");

        jPanelSideMenu.setBackground(new java.awt.Color(72, 136, 123));

        jLabelMenuEventos.setBackground(null);
        jLabelMenuEventos.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabelMenuEventos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuEventos.setIcon(new ImageIcon("icones//eventos.png"));
        jLabelMenuEventos.setText("  Eventos");
        jLabelMenuEventos.setToolTipText("");
        jLabelMenuEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuEventosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuEventosMouseExited(evt);
            }
        });

        jLabelMenuPessoas.setBackground(null);
        jLabelMenuPessoas.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabelMenuPessoas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuPessoas.setText("  Pessoas");
        jLabelMenuPessoas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuPessoasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuPessoasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuPessoasMouseExited(evt);
            }
        });

        jLabelMenuInscricoes.setBackground(null);
        jLabelMenuInscricoes.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabelMenuInscricoes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuInscricoes.setText("  Inscrições");
        jLabelMenuInscricoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuInscricoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuInscricoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuInscricoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuInscricoesMouseExited(evt);
            }
        });

        jLabelMenuUsuarios.setBackground(null);
        jLabelMenuUsuarios.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabelMenuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuUsuarios.setText("  Usuários");
        jLabelMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuUsuariosMouseExited(evt);
            }
        });

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo-verde.png"))); // NOI18N

        jLabelMenuConfig.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelMenuConfig.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuConfig.setText("  Configurações");
        jLabelMenuConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuConfigMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuConfigMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuConfigMouseEntered(evt);
            }
        });

        jPanelSubConfigBG.setBackground(new Color(255, 255, 255, 50));
        jPanelSubConfigBG.setOpaque(false);
        jPanelSubConfigBG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSubConfigBGMouseExited(evt);
            }
        });

        jPanelSubMenuConfig.setBackground(new Color(255, 255, 255, 0));
        jPanelSubMenuConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSubMenuConfigMouseExited(evt);
            }
        });
        jPanelSubMenuConfig.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        jLabelConfigDatabase.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelConfigDatabase.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfigDatabase.setText("   Conexão");
        jLabelConfigDatabase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConfigDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConfigDatabaseMouseClicked(evt);
            }
        });
        jPanelSubMenuConfig.add(jLabelConfigDatabase);

        jLabelLogout.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogout.setText("   Sair");
        jLabelLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });
        jPanelSubMenuConfig.add(jLabelLogout);

        javax.swing.GroupLayout jPanelSubConfigBGLayout = new javax.swing.GroupLayout(jPanelSubConfigBG);
        jPanelSubConfigBG.setLayout(jPanelSubConfigBGLayout);
        jPanelSubConfigBGLayout.setHorizontalGroup(
            jPanelSubConfigBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubConfigBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSubMenuConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSubConfigBGLayout.setVerticalGroup(
            jPanelSubConfigBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubConfigBGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSubMenuConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelRelogio.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelRelogio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRelogio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRelogio.setText("Data e hora");

        jLabelMenuDados.setBackground(null);
        jLabelMenuDados.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabelMenuDados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuDados.setText("  Dados");
        jLabelMenuDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuDadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuDadosMouseExited(evt);
            }
        });

        jLabelMenuInformacoes.setBackground(null);
        jLabelMenuInformacoes.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabelMenuInformacoes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuInformacoes.setText("  Informações");
        jLabelMenuInformacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMenuInformacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuInformacoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuInformacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuInformacoesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelSideMenuLayout = new javax.swing.GroupLayout(jPanelSideMenu);
        jPanelSideMenu.setLayout(jPanelSideMenuLayout);
        jPanelSideMenuLayout.setHorizontalGroup(
            jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                .addGroup(jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelMenuConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRelogio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelMenuEventos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelMenuPessoas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelMenuInscricoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(jLabelMenuUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelMenuDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelMenuInformacoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSubConfigBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSideMenuLayout.setVerticalGroup(
            jPanelSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelRelogio)
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelMenuEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMenuPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMenuInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMenuUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMenuDados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMenuInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSubConfigBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMenuConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelDragged.setBackground(new java.awt.Color(255, 255, 255));

        jLabelClose.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 0, 0));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(72, 136, 123));
        jLabelTitle.setText("QRevent    : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : :");
        jLabelTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelDraggedLayout = new javax.swing.GroupLayout(jPanelDragged);
        jPanelDragged.setLayout(jPanelDraggedLayout);
        jPanelDraggedLayout.setHorizontalGroup(
            jPanelDraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDraggedLayout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanelDraggedLayout.setVerticalGroup(
            jPanelDraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDragged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelDragged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMenuConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuConfigMouseEntered

    }//GEN-LAST:event_jLabelMenuConfigMouseEntered

    private void jLabelMenuConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuConfigMouseClicked
        this.jPanelSubConfigBG.setVisible(!jPanelSubConfigBG.isVisible());
    }//GEN-LAST:event_jLabelMenuConfigMouseClicked

    private void jLabelConfigDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfigDatabaseMouseClicked
        this.jPanelSubConfigBG.setVisible(false);
        new Configuracao(this, true).setVisible(true);
    }//GEN-LAST:event_jLabelConfigDatabaseMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        this.jPanelSubConfigBG.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void jLabelMenuEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuEventosMouseClicked
        this.alterarBox(this.jPanelEventos);
        Table.fill(new EventoController().select(), this.jTableEventos, Evento.class);
    }//GEN-LAST:event_jLabelMenuEventosMouseClicked

    private void jLabelMenuPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuPessoasMouseClicked
        this.alterarBox(this.jPanelPessoas);
        Table.fill(new PessoaController().select(), this.jTablePessoas, Pessoa.class);
    }//GEN-LAST:event_jLabelMenuPessoasMouseClicked

    private void jLabelMenuInscricoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInscricoesMouseClicked
        this.alterarBox(this.jPanelInscricoes);
        Table.fill(new InscricaoController().select(), this.jTableInscricoes, Inscricao.class);
    }//GEN-LAST:event_jLabelMenuInscricoesMouseClicked

    private void jLabelMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuUsuariosMouseClicked
        this.alterarBox(this.jPanelUsuarios);
        Table.fill(new UsuarioController().select(), this.jTableUsuarios, Usuario.class); 
    }//GEN-LAST:event_jLabelMenuUsuariosMouseClicked

    private void jLabelMenuEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuEventosMouseEntered
        this.jLabelMenuEventos.setBackground(new Color(255, 255, 255, 30));
    }//GEN-LAST:event_jLabelMenuEventosMouseEntered

    private void jLabelMenuEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuEventosMouseExited
        this.jLabelMenuEventos.setBackground(null);
    }//GEN-LAST:event_jLabelMenuEventosMouseExited

    public static boolean isMouseWithinComponent(Component c) {
        Point mousePos = MouseInfo.getPointerInfo().getLocation();
        Rectangle bounds = c.getBounds();
        bounds.setLocation(c.getLocationOnScreen());
        return bounds.contains(mousePos);
    }

    private void jLabelMenuPessoasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuPessoasMouseEntered
        this.jLabelMenuPessoas.setBackground(new Color(255, 255, 255, 30));
    }//GEN-LAST:event_jLabelMenuPessoasMouseEntered

    private void jLabelMenuInscricoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInscricoesMouseEntered
        this.jLabelMenuInscricoes.setBackground(new Color(255, 255, 255, 30));
    }//GEN-LAST:event_jLabelMenuInscricoesMouseEntered

    private void jLabelMenuUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuUsuariosMouseEntered
        this.jLabelMenuUsuarios.setBackground(new Color(255, 255, 255, 30));
    }//GEN-LAST:event_jLabelMenuUsuariosMouseEntered

    private void jLabelMenuPessoasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuPessoasMouseExited
        this.jLabelMenuPessoas.setBackground(null);
    }//GEN-LAST:event_jLabelMenuPessoasMouseExited

    private void jLabelMenuInscricoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInscricoesMouseExited
        this.jLabelMenuInscricoes.setBackground(null);
    }//GEN-LAST:event_jLabelMenuInscricoesMouseExited

    private void jLabelMenuUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuUsuariosMouseExited
        this.jLabelMenuUsuarios.setBackground(null);
    }//GEN-LAST:event_jLabelMenuUsuariosMouseExited

    private void jLabelMenuConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuConfigMouseExited
    }//GEN-LAST:event_jLabelMenuConfigMouseExited

    private void jPanelSubConfigBGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSubConfigBGMouseExited

    }//GEN-LAST:event_jPanelSubConfigBGMouseExited

    private void jPanelSubMenuConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSubMenuConfigMouseExited

    }//GEN-LAST:event_jPanelSubMenuConfigMouseExited

    private void jLabelMenuDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuDadosMouseClicked
        this.alterarBox(this.jPanelDados);
    }//GEN-LAST:event_jLabelMenuDadosMouseClicked

    private void jLabelMenuDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuDadosMouseExited
        this.jLabelMenuDados.setBackground(null);
    }//GEN-LAST:event_jLabelMenuDadosMouseExited

    private void jLabelMenuDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuDadosMouseEntered
        this.jLabelMenuDados.setBackground(new Color(255, 255, 255, 30));
    }//GEN-LAST:event_jLabelMenuDadosMouseEntered

    private void jPanelimportBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelimportBGMouseClicked

    }//GEN-LAST:event_jPanelimportBGMouseClicked

    private void jLabelArrowImpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelArrowImpMouseClicked
        if (this.jListClasses.isSelectionEmpty()) {
            return;
        }

        String classeNome = this.jListClasses.getSelectedValue().toString();

        DataType dataType = (this.jRadioButtonJson.isSelected()) ? DataType.JSON : DataType.XML;

        if (DataType.XML.equals(dataType)) {
            //JOptionPane.showMessageDialog(this, "Importações com XML em desenvolvimento!");
            //return;
        }

        new FileScreen(this, true, JFileChooser.FILES_ONLY, dataType).setVisible(true);

        if (FileScreen.cancel) {
            return;
        }

        switch (classeNome) {
            case "Eventos":
                try {
                    Dados.importar(Evento.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Eventos", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelImportados.add(new JLabel("Eventos", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao importar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Pessoas":
                try {
                    Dados.importar(Pessoa.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Pessoas", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelImportados.add(new JLabel("Pessoas", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao importar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Inscrições":
                try {
                    Dados.importar(Inscricao.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Inscrição", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelImportados.add(new JLabel("Inscrição", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao importar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Usuários":
                try {
                    Dados.importar(Usuario.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Usuário", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelImportados.add(new JLabel("Usuário", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao importar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            default:
                return;
        }

        this.jPanelImportados.repaint();
        this.jPanelImportados.revalidate();
    }//GEN-LAST:event_jLabelArrowImpMouseClicked

    private void jLabelArrowExpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelArrowExpMouseClicked
        if (this.jListClassesExp.isSelectionEmpty()) {
            return;
        }

        DataType dataType = (this.jRadioButtonJson.isSelected()) ? DataType.JSON : DataType.XML;

        if (DataType.XML.equals(dataType)) {
            //JOptionPane.showMessageDialog(this, "Exportações com XML em desenvolvimento!");
            //return;
        }

        String classeNome = this.jListClassesExp.getSelectedValue().toString();

        new FileScreen(this, true, JFileChooser.DIRECTORIES_ONLY, dataType).setVisible(true);

        if (FileScreen.cancel) {
            return;
        }

        switch (classeNome) {
            case "Eventos":
                try {
                    Dados.exportar(Evento.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Eventos", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelExportados.add(new JLabel("Eventos", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao exportar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Pessoas":
                try {
                    Dados.exportar(Pessoa.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Pessoas", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelExportados.add(new JLabel("Pessoas", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao exportar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Inscrições":
                try {
                    Dados.exportar(Inscricao.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Inscrição", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelExportados.add(new JLabel("Inscrição", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao exportar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Usuários":
                try {
                    Dados.exportar(Usuario.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Usuário", new ImageIcon("icones//success.png"), JLabel.LEADING));
                } catch (Exception e) {
                    jPanelExportados.add(new JLabel("Usuário", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao exportar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            default:
                return;
        }

        this.jPanelImportados.repaint();
        this.jPanelImportados.revalidate();
    }//GEN-LAST:event_jLabelArrowExpMouseClicked

    private void jPanelExportBGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExportBGMouseClicked
        
    }//GEN-LAST:event_jPanelExportBGMouseClicked

    private void jLabelAddEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddEventosMouseClicked
        new FormEventos(this, true).setVisible(true);
        if(!FormEventos.cancel) {
            new EventoController().select();
            JOptionPane.showMessageDialog(jPanelContent, "Registro inserido com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
            Table.fill(new EventoController().select(), jTableEventos, Evento.class);
        }
    }//GEN-LAST:event_jLabelAddEventosMouseClicked

    private void jLabelReloadEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReloadEventosMouseClicked
        Table.fill(new EventoController().select(), jTableEventos, Evento.class);
    }//GEN-LAST:event_jLabelReloadEventosMouseClicked

    private void jLabelAddPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddPessoasMouseClicked
        new FormPessoa(this, true).setVisible(true);
        if (!FormPessoa.cancel) {
            new PessoaController().select();
            JOptionPane.showMessageDialog(jPanelContent, "Registro inserido com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
            Table.fill(new PessoaController().select(), jTablePessoas, Pessoa.class);
        }
    }//GEN-LAST:event_jLabelAddPessoasMouseClicked

    private void jLabelMenuInformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInformacoesMouseClicked
        new Informacoes(this, true).setVisible(true);
    }//GEN-LAST:event_jLabelMenuInformacoesMouseClicked

    private void jLabelMenuInformacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInformacoesMouseEntered
        this.jLabelMenuDados.setBackground(new Color(255, 255, 255, 30));
    }//GEN-LAST:event_jLabelMenuInformacoesMouseEntered

    private void jLabelMenuInformacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInformacoesMouseExited
        this.jLabelMenuDados.setBackground(null);
    }//GEN-LAST:event_jLabelMenuInformacoesMouseExited

    private void jTableInscricoesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableInscricoesKeyTyped

    }//GEN-LAST:event_jTableInscricoesKeyTyped

    private void jTableInscricoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInscricoesMouseClicked
        
    }//GEN-LAST:event_jTableInscricoesMouseClicked

    private void jLabelAddInscricoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddInscricoesMouseClicked
        new FormInscricao(this, true).setVisible(true);
        Table.fill(new InscricaoController().select(), jTableInscricoes, Inscricao.class);
    }//GEN-LAST:event_jLabelAddInscricoesMouseClicked

    private void jLabelInscVerPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscVerPessoaMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableInscricoes.getValueAt(this.jTableInscricoes.getSelectedRow(), Table.getColumnIndex(jTableInscricoes, "pessoa")));
            this.getDialog(new PessoaComponent(new JsonParser().parse(new PessoaController().select(1)).getAsJsonObject()), 680, 340);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione alguma inscrição para ver a pessoa!");
        }
    }//GEN-LAST:event_jLabelInscVerPessoaMouseClicked

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

    private void jLabelInscVerEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscVerEventoMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableInscricoes.getValueAt(this.jTableInscricoes.getSelectedRow(), Table.getColumnIndex(jTableInscricoes, "evento")));
            this.getDialog(new EventComponent(new JsonParser().parse(new EventoController().select(id)).getAsJsonObject()), 850, 320);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione alguma inscrição para ver o evento! ");
        }
    }//GEN-LAST:event_jLabelInscVerEventoMouseClicked

    private void jLabelInscBuscarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscBuscarEventoMouseClicked
        new DialogQuery(this, true, new String[]{"id", "nome", "descricao", "local", "capacidade", "data_inicio", "data_termino", "horario_inicio", "horario_termino"}, new EventoController().select(), Evento.class).setVisible(true);
        this.jTextFieldInscFiltroEvento.setText(DialogQuery.id);
        this.filtrar();
    }//GEN-LAST:event_jLabelInscBuscarEventoMouseClicked

    public void filtrar() {
        ArrayList<String[]> params = new ArrayList<>();
        if(!this.jTextFieldInscFiltroEvento.getText().equals("-")) {
            params.add(new String[]{"evento_id", this.jTextFieldInscFiltroEvento.getText()});
        }
        if(!this.jTextFieldInscFiltroPessoa.getText().equals("-")) {
            params.add(new String[]{"pessoa_id", this.jTextFieldInscFiltroPessoa.getText()});
        }
        Table.fill(new InscricaoController().select(params.toArray(new String[params.size()][2])), this.jTableInscricoes, Inscricao.class);
        Table.filter(jTableInscricoes, this.jTextFieldInscFiltroData.getText(), Table.getColumnIndex(jTableInscricoes, "data"));
    }
    
    private void jLabelEventosExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosExcluirMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableEventos.getValueAt(this.jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "id")));

            if (JOptionPane.showConfirmDialog(jPanelContent, "Realmente deseja excluir o registro?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    new EventoController().delete(id);
                    new EventoController().select();
                    JOptionPane.showMessageDialog(jPanelContent, "Registro excluído com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                    Table.fill(new EventoController().select(), jTableEventos, Evento.class);
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(jPanelContent, "Erro ao excluir evento! " + e.getCause(), "Error", 0, new ImageIcon("icones//error.png"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione algum evento para excluir!");
        }
    }//GEN-LAST:event_jLabelEventosExcluirMouseClicked

    private void jLabelEventosAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosAtualizarMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableEventos.getValueAt(this.jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "id")));
            new FormEventos(this, true, new JsonParser().parse(new EventoController().select(id)).getAsJsonObject()).setVisible(true);
            if(!FormEventos.cancel) { 
                new EventoController().select();
                JOptionPane.showMessageDialog(jPanelContent, "Registro atualizado com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                Table.fill(new EventoController().select(), jTableEventos, Evento.class);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione algum evento para atualizar!");
        }
    }//GEN-LAST:event_jLabelEventosAtualizarMouseClicked

    private void jTextFieldEventoFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldEventoFiltroCaretUpdate
        Table.filter(jTableEventos, this.jTextFieldEventoFiltro.getText(), Table.getColumnIndex(jTableEventos, this.jComboBoxEventoFiltro.getSelectedItem().toString()));
    }//GEN-LAST:event_jTextFieldEventoFiltroCaretUpdate

    private void jLabelVerEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVerEventoMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableEventos.getValueAt(this.jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "id")));
            this.getDialog(new EventComponent(new JsonParser().parse(new EventoController().select(id)).getAsJsonObject()), 850, 280);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione algum evento para ver!");
        }

    }//GEN-LAST:event_jLabelVerEventoMouseClicked

    private void jTextFieldPessoaFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldPessoaFiltroCaretUpdate
        Table.filter(jTablePessoas, this.jTextFieldPessoaFiltro.getText(), Table.getColumnIndex(jTablePessoas, this.jComboBoxPessoaFiltro.getSelectedItem().toString()));
    }//GEN-LAST:event_jTextFieldPessoaFiltroCaretUpdate

    private void jLabelVerPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVerPessoaMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTablePessoas.getValueAt(this.jTablePessoas.getSelectedRow(), Table.getColumnIndex(jTablePessoas, "id")));
            this.getDialog(new PessoaComponent(new JsonParser().parse(new PessoaController().select(id)).getAsJsonObject()), 680, 340);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione alguma pessoa para ver!");
        }
    }//GEN-LAST:event_jLabelVerPessoaMouseClicked

    private void jLabelPessoasAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPessoasAtualizarMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTablePessoas.getValueAt(this.jTablePessoas.getSelectedRow(), Table.getColumnIndex(jTablePessoas, "id")));
            new FormPessoa(this, true, new JsonParser().parse(new PessoaController().select(id)).getAsJsonObject()).setVisible(true);
            if (!FormPessoa.cancel) {
                JOptionPane.showMessageDialog(jPanelContent, "Registro atualizado com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                Table.fill(new PessoaController().select(), jTablePessoas, Pessoa.class);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione alguma pessoa para atualizar!");
        }
    }//GEN-LAST:event_jLabelPessoasAtualizarMouseClicked

    private void jLabelPessoasExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPessoasExcluirMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTablePessoas.getValueAt(this.jTablePessoas.getSelectedRow(), Table.getColumnIndex(jTablePessoas, "id")));

            if (JOptionPane.showConfirmDialog(jPanelContent, "Realmente deseja excluir o registro?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
                try{
                    new PessoaController().delete(id);
                    JOptionPane.showMessageDialog(jPanelContent, "Registro excluído com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                    Table.fill(new PessoaController().select(), jTablePessoas, Pessoa.class);
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(jPanelContent, "Erro ao excluir pessoa! " + e.getCause(), "Error", 0, new ImageIcon("icones//error.png"));
                }
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione alguma pessoa para excluir!");
        }
    }//GEN-LAST:event_jLabelPessoasExcluirMouseClicked

    private void jLabelReloadInscricoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReloadInscricoesMouseClicked
        Table.fill(new InscricaoController().select(), this.jTableInscricoes, Inscricao.class);
    }//GEN-LAST:event_jLabelReloadInscricoesMouseClicked

    private void jLabelInscricaoAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscricaoAtualizarMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableInscricoes.getValueAt(this.jTableInscricoes.getSelectedRow(), Table.getColumnIndex(jTableInscricoes, "id")));
            new FormInscricao(this, true, new JsonParser().parse(new InscricaoController().select(id)).getAsJsonObject()).setVisible(true);
            if (!FormInscricao.cancel) {
                JOptionPane.showMessageDialog(jPanelContent, "Registro atualizado com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                Table.fill(new InscricaoController().select(), jTableInscricoes, Inscricao.class);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione alguma inscrição para atualizar! " + e.getCause());
        }
    }//GEN-LAST:event_jLabelInscricaoAtualizarMouseClicked

    private void jLabelInscricaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscricaoExcluirMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableInscricoes.getValueAt(this.jTableInscricoes.getSelectedRow(), Table.getColumnIndex(jTableInscricoes, "id")));

            if (JOptionPane.showConfirmDialog(jPanelContent, "Realmente deseja excluir o registro?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    new InscricaoController().delete(id);
                    JOptionPane.showMessageDialog(jPanelContent, "Registro excluído com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                    Table.fill(new InscricaoController().select(), jTableInscricoes, Inscricao.class);
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(jPanelContent, "Erro ao excluir registro! " + e.getCause(), "Error", 0, new ImageIcon("icones//error.png"));
                }
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione alguma inscrição para excluir!");
        }
    }//GEN-LAST:event_jLabelInscricaoExcluirMouseClicked

    private void jTextFieldInscFiltroEventoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldInscFiltroEventoCaretUpdate
        
    }//GEN-LAST:event_jTextFieldInscFiltroEventoCaretUpdate

    private void jTextFieldInscFiltroDataCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldInscFiltroDataCaretUpdate
        Table.filter(jTableInscricoes, this.jTextFieldInscFiltroData.getText(), Table.getColumnIndex(jTableInscricoes, "data"));
    }//GEN-LAST:event_jTextFieldInscFiltroDataCaretUpdate

    private void jLabelInscBuscarPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscBuscarPessoaMouseClicked
        new DialogQuery(this, true, new String[]{"id", "matricula", "email", "nome", "cpf", "rg", "endereco", "cidade", "telefone"}, new PessoaController().select(), Pessoa.class).setVisible(true);
        this.jTextFieldInscFiltroPessoa.setText(DialogQuery.id);
        this.filtrar();
    }//GEN-LAST:event_jLabelInscBuscarPessoaMouseClicked

    private void jTextFieldInscFiltroPessoaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldInscFiltroPessoaCaretUpdate
        
    }//GEN-LAST:event_jTextFieldInscFiltroPessoaCaretUpdate

    private void jLabelInscLimparBuscaEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscLimparBuscaEventoMouseClicked
        this.jTextFieldInscFiltroEvento.setText("-");
        this.filtrar();
    }//GEN-LAST:event_jLabelInscLimparBuscaEventoMouseClicked

    private void jLabelInscLimparBuscaPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInscLimparBuscaPessoaMouseClicked
        this.jTextFieldInscFiltroPessoa.setText("-");
        this.filtrar();
    }//GEN-LAST:event_jLabelInscLimparBuscaPessoaMouseClicked

    private void jLabelEventosCredenciamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosCredenciamentoMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableEventos.getValueAt(this.jTableEventos.getSelectedRow(), Table.getColumnIndex(jTableEventos, "id")));
            new Credenciamento(this, true, new JsonParser().parse(new EventoController().select(id)).getAsJsonObject()).setVisible(true);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Escolha um evento para realizar o credenciamento! " + e.getCause(), "Error", 0, new ImageIcon("icones//error.png"));
        }
    }//GEN-LAST:event_jLabelEventosCredenciamentoMouseClicked

    private void jTextFieldFiltroUsuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldFiltroUsuCaretUpdate
        Table.filter(jTablePessoas, this.jTextFieldFiltroUsu.getText(), Table.getColumnIndex(jTablePessoas, this.jComboBoxFiltroUsu.getSelectedItem().toString()));
    }//GEN-LAST:event_jTextFieldFiltroUsuCaretUpdate

    private void jLabelUsuarioExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUsuarioExcluirMouseClicked

    private void jLabelUsuarioAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioAtualizarMouseClicked
        try {
            int id = Integer.parseInt((String) this.jTableUsuarios.getValueAt(this.jTableUsuarios.getSelectedRow(), Table.getColumnIndex(jTableUsuarios, "id")));
            new FormUsuario(this, true, new JsonParser().parse(new UsuarioController().select(id)).getAsJsonObject()).setVisible(true);
            if (!FormUsuario.cancel) {
                JOptionPane.showMessageDialog(jPanelContent, "Registro atualizado com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                Table.fill(new UsuarioController().select(), jTableUsuarios, Usuario.class);
                AuthService.usuario = new JsonParser().parse(new UsuarioController().select(AuthService.usuario.get("id").getAsInt())).getAsJsonObject();
                this.gerenciarBotoes(AuthService.usuario.get("tipo").equals("admin"));
                 if(AuthService.usuario.get("tipo").getAsString().equals("comum")) {
                    this.alterarBox(this.jPanelEventos);
                }
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione algum usuário para atualizar! " + e.getCause());
        }
    }//GEN-LAST:event_jLabelUsuarioAtualizarMouseClicked

    private void jLabelAddUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddUsuariosMouseClicked
        try {
            new FormUsuario(this, true).setVisible(true);
            if (!FormUsuario.cancel) {
                JOptionPane.showMessageDialog(jPanelContent, "Registro atualizado com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
                Table.fill(new UsuarioController().select(), jTableUsuarios, Usuario.class);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(jPanelContent, "Selecione algum usuário para atualizar! " + e.getCause());
        }
    }//GEN-LAST:event_jLabelAddUsuariosMouseClicked

    public void fillData(String className, Class componentClass, JPanel scrollPanel) {
        scrollPanel.removeAll();
        new Controller() {
            @Override
            public void init() {
                try {
                    this.class_ = (Base) Class.forName(className).newInstance();
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.select().forEach(object -> {
            try {
                scrollPanel.add((JPanel) componentClass.getConstructor(JsonObject.class).newInstance(new JsonParser().parse(object.toString()).getAsJsonObject()));
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        scrollPanel.repaint();
        scrollPanel.revalidate();
    }

    public void setLayouts() {
        this.jPanelImportados.setLayout(new WrapLayout());
        this.jPanelExportados.setLayout(new WrapLayout());
    }

    public void alterarBox(JPanel panel) {
        this.jPanelContent.removeAll();
        this.jPanelContent.add(panel);
        this.jPanelContent.repaint();
        this.jPanelContent.revalidate();
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
    private javax.swing.ButtonGroup buttonGroupDataType;
    private javax.swing.JComboBox jComboBoxEventoFiltro;
    private javax.swing.JComboBox jComboBoxFiltroUsu;
    private javax.swing.JComboBox jComboBoxPessoaFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAddEventos;
    private javax.swing.JLabel jLabelAddInscricoes;
    private javax.swing.JLabel jLabelAddPessoas;
    private javax.swing.JLabel jLabelAddUsuarios;
    private javax.swing.JLabel jLabelArrowExp;
    private javax.swing.JLabel jLabelArrowImp;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelConfigDatabase;
    private javax.swing.JLabel jLabelDadosTitle;
    private javax.swing.JLabel jLabelEventos;
    private javax.swing.JLabel jLabelEventosAtualizar;
    private javax.swing.JLabel jLabelEventosCredenciamento;
    private javax.swing.JLabel jLabelEventosExcluir;
    private javax.swing.JLabel jLabelExpClasses;
    private javax.swing.JLabel jLabelHist;
    private javax.swing.JLabel jLabelHistExp;
    private javax.swing.JLabel jLabelImpClasses;
    private javax.swing.JLabel jLabelInscBuscarEvento;
    private javax.swing.JLabel jLabelInscBuscarPessoa;
    private javax.swing.JLabel jLabelInscLimparBuscaEvento;
    private javax.swing.JLabel jLabelInscLimparBuscaPessoa;
    private javax.swing.JLabel jLabelInscVerEvento;
    private javax.swing.JLabel jLabelInscVerPessoa;
    private javax.swing.JLabel jLabelInscricaoAtualizar;
    private javax.swing.JLabel jLabelInscricaoExcluir;
    private javax.swing.JLabel jLabelInscricoes;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelMenuConfig;
    private javax.swing.JLabel jLabelMenuDados;
    private javax.swing.JLabel jLabelMenuEventos;
    private javax.swing.JLabel jLabelMenuInformacoes;
    private javax.swing.JLabel jLabelMenuInscricoes;
    private javax.swing.JLabel jLabelMenuPessoas;
    private javax.swing.JLabel jLabelMenuUsuarios;
    private javax.swing.JLabel jLabelPessoas;
    private javax.swing.JLabel jLabelPessoasAtualizar;
    private javax.swing.JLabel jLabelPessoasExcluir;
    private javax.swing.JLabel jLabelReloadEventos;
    private javax.swing.JLabel jLabelReloadInscricoes;
    private javax.swing.JLabel jLabelReloadPessoas;
    private javax.swing.JLabel jLabelReloadUsuarios;
    private javax.swing.JLabel jLabelRelogio;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleExport;
    private javax.swing.JLabel jLabelTitleImport;
    private javax.swing.JLabel jLabelUsuarioAtualizar;
    private javax.swing.JLabel jLabelUsuarioExcluir;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JLabel jLabelVerEvento;
    private javax.swing.JLabel jLabelVerPessoa;
    private javax.swing.JList jListClasses;
    private javax.swing.JList jListClassesExp;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelDadosBG;
    private javax.swing.JPanel jPanelDragged;
    private javax.swing.JPanel jPanelEventos;
    private javax.swing.JPanel jPanelEventosFiltro;
    private javax.swing.JPanel jPanelEventosPessoas;
    private javax.swing.JPanel jPanelExportBG;
    private javax.swing.JPanel jPanelExportados;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelImportados;
    private javax.swing.JPanel jPanelInscFiltros;
    private javax.swing.JPanel jPanelInscricoes;
    private javax.swing.JPanel jPanelPessoas;
    private javax.swing.JPanel jPanelSideMenu;
    private javax.swing.JPanel jPanelSubConfigBG;
    private javax.swing.JPanel jPanelSubMenuConfig;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JPanel jPanelimportBG;
    private javax.swing.JRadioButton jRadioButtonJson;
    private javax.swing.JRadioButton jRadioButtonXml;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPaneHist;
    private javax.swing.JScrollPane jScrollPaneHist1;
    private javax.swing.JScrollPane jScrollPaneListClasses;
    private javax.swing.JScrollPane jScrollPaneListClasses1;
    private javax.swing.JTable jTableEventos;
    private javax.swing.JTable jTableInscricoes;
    private javax.swing.JTable jTablePessoas;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldEventoFiltro;
    private javax.swing.JTextField jTextFieldFiltroUsu;
    private javax.swing.JTextField jTextFieldInscFiltroData;
    private javax.swing.JTextField jTextFieldInscFiltroEvento;
    private javax.swing.JTextField jTextFieldInscFiltroPessoa;
    private javax.swing.JTextField jTextFieldPessoaFiltro;
    // End of variables declaration//GEN-END:variables
}
