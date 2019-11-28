
package View;

import Controller.Controller;
import Controller.EventoController;
import DAO.JPAfactory;
import Layouts.WrapLayout;
import Model.Base;
import Model.Evento;
import Model.Inscricao;
import Model.Pessoa;
import Model.Usuario;
import Util.Arquivo;
import Util.Dados;
import Util.DataType;
import Util.Relogio;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        
        this.setConnection();
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        initComponents();
        this.setLayouts();
        this.getContentPane().setBackground(Color.white);
        new Dragged(this.jPanelDragged, this);
        this.setLocationRelativeTo(null);
        this.setIcons();
        this.jPanelSubConfigBG.setVisible(false);
        try{
            fillData("Model.Evento", EventComponent.class, this.jPanelScrollEventos);
        }
        catch(Exception e) {
            System.out.println(e);
            new Configuracao().setVisible(true);
            if(!Configuracao.testarConexao(getConnection())) {
                System.exit(0);
            }
        }
        new Relogio(jLabelRelogio);
    }
    
    public void setConnection() {
        ArrayList con = this.getConnection();
        if(Configuracao.testarConexao(con)) {
            HashMap propriedades = new HashMap<String, String>();
            propriedades.put("javax.persistence.jdbc.driver", con.get(0));
            propriedades.put("javax.persistence.jdbc.url", con.get(1));
            propriedades.put("javax.persistence.jdbc.user", con.get(2));
            propriedades.put("javax.persistence.jdbc.password", con.get(3));
            JPAfactory.configurar(propriedades);
        }
        else {
            new Configuracao().setVisible(true);
            if(!Configuracao.testarConexao(con)) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao conectar", "Conexão inválida", 0, new ImageIcon("icones//error.png"));
                System.exit(0);
            }
        }
    }
    
    public ArrayList getConnection() {
        try {
            return Arquivo.ler("arquivos//conexao.txt");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDataType = new javax.swing.ButtonGroup();
        jPanelContent = new javax.swing.JPanel();
        jPanelEventos = new javax.swing.JPanel();
        jLabelEventos = new javax.swing.JLabel();
        jScrollPaneEventos = new javax.swing.JScrollPane();
        jPanelScrollEventos = new javax.swing.JPanel();
        jLabelReloadEventos = new javax.swing.JLabel();
        jLabelAddEventos = new javax.swing.JLabel();
        jPanelPessoas = new javax.swing.JPanel();
        jLabelPessoas = new javax.swing.JLabel();
        jLabelReloadPessoas = new javax.swing.JLabel();
        jLabelAddPessoas = new javax.swing.JLabel();
        jScrollPanePessoas = new javax.swing.JScrollPane();
        jPanelScrollPessoas = new javax.swing.JPanel();
        jPanelInscricoes = new javax.swing.JPanel();
        jLabelInscricoes = new javax.swing.JLabel();
        jLabelReloadInscricoes = new javax.swing.JLabel();
        jLabelAddInscricoes = new javax.swing.JLabel();
        jScrollPaneInscricoes = new javax.swing.JScrollPane();
        jPanelScrollInscricoes = new javax.swing.JPanel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabelReloadUsuarios = new javax.swing.JLabel();
        jLabelAddUsuarios = new javax.swing.JLabel();
        jScrollPaneUsuarios = new javax.swing.JScrollPane();
        jPanelScrollUsuarios = new javax.swing.JPanel();
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
        jLabelLogout = new javax.swing.JLabel();
        jLabelConfigDatabase = new javax.swing.JLabel();
        jLabelRelogio = new javax.swing.JLabel();
        jLabelMenuDados = new javax.swing.JLabel();
        jPanelDragged = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanelContent.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContent.setLayout(new java.awt.CardLayout());

        jPanelEventos.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEventos.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabelEventos.setForeground(new java.awt.Color(72, 136, 123));
        jLabelEventos.setText("Eventos");

        jScrollPaneEventos.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneEventos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneEventos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanelScrollEventos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelScrollEventosLayout = new javax.swing.GroupLayout(jPanelScrollEventos);
        jPanelScrollEventos.setLayout(jPanelScrollEventosLayout);
        jPanelScrollEventosLayout.setHorizontalGroup(
            jPanelScrollEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        jPanelScrollEventosLayout.setVerticalGroup(
            jPanelScrollEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        jScrollPaneEventos.setViewportView(jPanelScrollEventos);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEventosLayout.createSequentialGroup()
                        .addComponent(jLabelEventos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAddEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReloadEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEventosLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanelEventosLayout.setVerticalGroup(
            jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEventosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEventos)
                    .addComponent(jLabelReloadEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEventos, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
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

        jScrollPanePessoas.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPanePessoas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPanePessoas.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanelScrollPessoas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelScrollPessoasLayout = new javax.swing.GroupLayout(jPanelScrollPessoas);
        jPanelScrollPessoas.setLayout(jPanelScrollPessoasLayout);
        jPanelScrollPessoasLayout.setHorizontalGroup(
            jPanelScrollPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        jPanelScrollPessoasLayout.setVerticalGroup(
            jPanelScrollPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        jScrollPanePessoas.setViewportView(jPanelScrollPessoas);

        javax.swing.GroupLayout jPanelPessoasLayout = new javax.swing.GroupLayout(jPanelPessoas);
        jPanelPessoas.setLayout(jPanelPessoasLayout);
        jPanelPessoasLayout.setHorizontalGroup(
            jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPessoasLayout.createSequentialGroup()
                        .addComponent(jScrollPanePessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPessoasLayout.createSequentialGroup()
                        .addComponent(jLabelPessoas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAddPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReloadPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanelPessoasLayout.setVerticalGroup(
            jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPessoasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPessoasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReloadPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPessoas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanePessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelContent.add(jPanelPessoas, "card2");

        jPanelInscricoes.setBackground(new java.awt.Color(255, 255, 255));

        jLabelInscricoes.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabelInscricoes.setForeground(new java.awt.Color(72, 136, 123));
        jLabelInscricoes.setText("Inscrições");

        jLabelReloadInscricoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelAddInscricoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jScrollPaneInscricoes.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneInscricoes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneInscricoes.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanelScrollInscricoes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelScrollInscricoesLayout = new javax.swing.GroupLayout(jPanelScrollInscricoes);
        jPanelScrollInscricoes.setLayout(jPanelScrollInscricoesLayout);
        jPanelScrollInscricoesLayout.setHorizontalGroup(
            jPanelScrollInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        jPanelScrollInscricoesLayout.setVerticalGroup(
            jPanelScrollInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        jScrollPaneInscricoes.setViewportView(jPanelScrollInscricoes);

        javax.swing.GroupLayout jPanelInscricoesLayout = new javax.swing.GroupLayout(jPanelInscricoes);
        jPanelInscricoes.setLayout(jPanelInscricoesLayout);
        jPanelInscricoesLayout.setHorizontalGroup(
            jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscricoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInscricoesLayout.createSequentialGroup()
                        .addComponent(jLabelInscricoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAddInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReloadInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInscricoesLayout.createSequentialGroup()
                        .addComponent(jScrollPaneInscricoes, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelInscricoesLayout.setVerticalGroup(
            jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscricoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInscricoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelReloadInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAddInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInscricoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneInscricoes, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanelContent.add(jPanelInscricoes, "card2");

        jPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jLabelUsuarios.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(72, 136, 123));
        jLabelUsuarios.setText("Usuários");

        jLabelReloadUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelAddUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jScrollPaneUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneUsuarios.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneUsuarios.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanelScrollUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelScrollUsuariosLayout = new javax.swing.GroupLayout(jPanelScrollUsuarios);
        jPanelScrollUsuarios.setLayout(jPanelScrollUsuariosLayout);
        jPanelScrollUsuariosLayout.setHorizontalGroup(
            jPanelScrollUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        jPanelScrollUsuariosLayout.setVerticalGroup(
            jPanelScrollUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        jScrollPaneUsuarios.setViewportView(jPanelScrollUsuarios);

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addComponent(jScrollPaneUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabelUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAddUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelReloadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelReloadUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
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
                .addContainerGap(217, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
                                    .addComponent(jLabelMenuDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabelTitle.setText("QRevent    : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : : :");

        javax.swing.GroupLayout jPanelDraggedLayout = new javax.swing.GroupLayout(jPanelDragged);
        jPanelDragged.setLayout(jPanelDraggedLayout);
        jPanelDraggedLayout.setHorizontalGroup(
            jPanelDraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDraggedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanelDraggedLayout.setVerticalGroup(
            jPanelDraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDraggedLayout.createSequentialGroup()
                .addGroup(jPanelDraggedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDragged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelDragged, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        new Configuracao().setVisible(true);
    }//GEN-LAST:event_jLabelConfigDatabaseMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        this.jPanelSubConfigBG.setVisible(false);
    }//GEN-LAST:event_jLabelLogoutMouseClicked

    private void jLabelMenuEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuEventosMouseClicked
        this.alterarBox(this.jPanelEventos);
        fillData("Model.Evento", EventComponent.class, this.jPanelScrollEventos);
    }//GEN-LAST:event_jLabelMenuEventosMouseClicked

    private void jLabelMenuPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuPessoasMouseClicked
        this.alterarBox(this.jPanelPessoas);
        fillData("Model.Pessoa", PessoaComponent.class, this.jPanelScrollPessoas);
    }//GEN-LAST:event_jLabelMenuPessoasMouseClicked

    private void jLabelMenuInscricoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInscricoesMouseClicked
        this.alterarBox(this.jPanelInscricoes);
    }//GEN-LAST:event_jLabelMenuInscricoesMouseClicked

    private void jLabelMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuUsuariosMouseClicked
        this.alterarBox(this.jPanelUsuarios);
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
        if(this.jListClasses.isSelectionEmpty()) return;
        
        String classeNome = this.jListClasses.getSelectedValue().toString();
        
        DataType dataType = (this.jRadioButtonJson.isSelected())? DataType.JSON: DataType.XML;
        
        if(DataType.XML.equals(dataType)) {
            JOptionPane.showMessageDialog(this, "Importações com XML em desenvolvimento!");
            return;
        }
        
        new FileScreen(this, true, JFileChooser.FILES_ONLY, dataType).setVisible(true);
        
        if(FileScreen.cancel) {
            return;
        }
        
        switch(classeNome) {
            case "Eventos":
                try {
                    Dados.importar(Evento.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Eventos", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
                    jPanelImportados.add(new JLabel("Eventos", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao importar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Pessoas":
                try {
                    Dados.importar(Pessoa.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Pessoas", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
                    jPanelImportados.add(new JLabel("Pessoas", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao importar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Inscrições":
                try {
                    Dados.importar(Inscricao.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Inscrição", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
                    jPanelImportados.add(new JLabel("Inscrição", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao importar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Usuários":
                try {
                    Dados.importar(Usuario.class, FileScreen.path, dataType);
                    jPanelImportados.add(new JLabel("Usuário", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
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
        if(this.jListClassesExp.isSelectionEmpty()) return;
        
        DataType dataType = (this.jRadioButtonJson.isSelected())? DataType.JSON: DataType.XML;
        
        if(DataType.XML.equals(dataType)) {
            JOptionPane.showMessageDialog(this, "Exportações com XML em desenvolvimento!");
            return;
        }
        
        String classeNome = this.jListClassesExp.getSelectedValue().toString();
        
        new FileScreen(this, true, JFileChooser.DIRECTORIES_ONLY, dataType).setVisible(true);
        
        if(FileScreen.cancel) {
            return;
        }
        
        switch(classeNome) {
            case "Eventos":
                try {
                    Dados.exportar(Evento.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Eventos", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
                    jPanelExportados.add(new JLabel("Eventos", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao exportar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Pessoas":
                try {
                    Dados.exportar(Pessoa.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Pessoas", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
                    jPanelExportados.add(new JLabel("Pessoas", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao exportar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Inscrições":
                try {
                    Dados.exportar(Inscricao.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Inscrição", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
                    jPanelExportados.add(new JLabel("Inscrição", new ImageIcon("icones//error.png"), JLabel.LEADING));
                    JOptionPane.showMessageDialog(rootPane, e, "Erro ao exportar", WIDTH, new ImageIcon("icones//error.png"));
                }
                break;
            case "Usuários":
                try {
                    Dados.exportar(Usuario.class, FileScreen.path, dataType);
                    jPanelExportados.add(new JLabel("Usuário", new ImageIcon("icones//success.png"), JLabel.LEADING));
                }
                catch(Exception e) {
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelExportBGMouseClicked

    private void jLabelAddEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddEventosMouseClicked
        new FormEventos(this, true).setVisible(true);
        fillData("Model.Evento", EventComponent.class, this.jPanelScrollEventos);
    }//GEN-LAST:event_jLabelAddEventosMouseClicked

    private void jLabelReloadEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReloadEventosMouseClicked
        fillData("Model.Evento", EventComponent.class, this.jPanelScrollEventos);
    }//GEN-LAST:event_jLabelReloadEventosMouseClicked

    private void jLabelAddPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddPessoasMouseClicked
        new FormPessoa(this, true).setVisible(true);
        fillData("Model.Pessoa", PessoaComponent.class, this.jPanelScrollPessoas);
    }//GEN-LAST:event_jLabelAddPessoasMouseClicked

    public void fillData(String className, Class componentClass, JPanel scrollPanel) {
        scrollPanel.removeAll();
        new Controller() {
            @Override
            public void init() {
                try {
                    this.class_ = (Base) Class.forName(className).newInstance();
                }
                catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.select().forEach(object->{
            try {
                scrollPanel.add((JPanel) componentClass.getConstructor(JsonObject.class, Main.class).newInstance(new JsonParser().parse(object.toString()).getAsJsonObject(), this));
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        scrollPanel.repaint();
        scrollPanel.revalidate();
    }
    
    public void fillEvents() {
        fillData("Model.Evento", EventComponent.class, this.jPanelScrollEventos);
    }
    
    public void setLayouts() {
        this.jPanelScrollEventos.setLayout(new WrapLayout());
        this.jPanelScrollPessoas.setLayout(new WrapLayout());
        this.jPanelScrollInscricoes.setLayout(new WrapLayout());
        this.jPanelScrollUsuarios.setLayout(new WrapLayout());
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
    private javax.swing.JLabel jLabelExpClasses;
    private javax.swing.JLabel jLabelHist;
    private javax.swing.JLabel jLabelHistExp;
    private javax.swing.JLabel jLabelImpClasses;
    private javax.swing.JLabel jLabelInscricoes;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelMenuConfig;
    private javax.swing.JLabel jLabelMenuDados;
    private javax.swing.JLabel jLabelMenuEventos;
    private javax.swing.JLabel jLabelMenuInscricoes;
    private javax.swing.JLabel jLabelMenuPessoas;
    private javax.swing.JLabel jLabelMenuUsuarios;
    private javax.swing.JLabel jLabelPessoas;
    private javax.swing.JLabel jLabelReloadEventos;
    private javax.swing.JLabel jLabelReloadInscricoes;
    private javax.swing.JLabel jLabelReloadPessoas;
    private javax.swing.JLabel jLabelReloadUsuarios;
    private javax.swing.JLabel jLabelRelogio;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleExport;
    private javax.swing.JLabel jLabelTitleImport;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JList jListClasses;
    private javax.swing.JList jListClassesExp;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelDadosBG;
    private javax.swing.JPanel jPanelDragged;
    private javax.swing.JPanel jPanelEventos;
    private javax.swing.JPanel jPanelExportBG;
    private javax.swing.JPanel jPanelExportados;
    private javax.swing.JPanel jPanelImportados;
    private javax.swing.JPanel jPanelInscricoes;
    private javax.swing.JPanel jPanelPessoas;
    private javax.swing.JPanel jPanelScrollEventos;
    private javax.swing.JPanel jPanelScrollInscricoes;
    private javax.swing.JPanel jPanelScrollPessoas;
    private javax.swing.JPanel jPanelScrollUsuarios;
    private javax.swing.JPanel jPanelSideMenu;
    private javax.swing.JPanel jPanelSubConfigBG;
    private javax.swing.JPanel jPanelSubMenuConfig;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JPanel jPanelimportBG;
    private javax.swing.JRadioButton jRadioButtonJson;
    private javax.swing.JRadioButton jRadioButtonXml;
    private javax.swing.JScrollPane jScrollPaneEventos;
    private javax.swing.JScrollPane jScrollPaneHist;
    private javax.swing.JScrollPane jScrollPaneHist1;
    private javax.swing.JScrollPane jScrollPaneInscricoes;
    private javax.swing.JScrollPane jScrollPaneListClasses;
    private javax.swing.JScrollPane jScrollPaneListClasses1;
    private javax.swing.JScrollPane jScrollPanePessoas;
    private javax.swing.JScrollPane jScrollPaneUsuarios;
    // End of variables declaration//GEN-END:variables
}
