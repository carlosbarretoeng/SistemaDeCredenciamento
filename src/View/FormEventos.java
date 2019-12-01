package View;

import Controller.EventoController;
import com.google.gson.JsonObject;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class FormEventos extends javax.swing.JDialog {

    public static boolean cancel = true;
    public JsonObject json;
    
    public FormEventos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        json = new JsonObject();
        this.jTextFieldId.setText("0");
        this.jLabelSalvar.setIcon(new ImageIcon("icones//success.png"));
        this.jLabelCancelar.setIcon(new ImageIcon("icones//error.png"));
        setEnterEvent();
        cancel = true;
        this.jTextFieldNome.requestFocus();
        this.setLocationRelativeTo(null);
    }

    public FormEventos(java.awt.Frame parent, boolean modal, JsonObject dados) {
        super(parent, modal);
        initComponents();
        setEnterEvent();
        cancel = true;
        this.json = dados;
        this.jLabelSalvar.setIcon(new ImageIcon("icones//success.png"));
        this.jLabelCancelar.setIcon(new ImageIcon("icones//error.png"));
        SimpleDateFormat ddMMyyyy = new SimpleDateFormat("yyyy-MM-dd");
        this.jTextFieldId.setText(dados.get("id").getAsString());
        this.jTextFieldNome.setText(dados.get("nome").getAsString());
        this.jTextAreaDesc.setText(dados.get("descricao").getAsString());
        this.jTextFieldLocal.setText(dados.get("local").getAsString());
        try {
            this.jDateChooserDataInicio.setDate(ddMMyyyy.parse(dados.get("data_inicio").getAsString()));
            this.jDateChooserDataTermino.setDate(ddMMyyyy.parse(dados.get("data_termino").getAsString()));
        } catch (Exception ex) {
            Logger.getLogger(FormEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.jFormattedTextFieldHoraInicio.setText(dados.get("horario_inicio").getAsString());
        this.jFormattedTextFieldHoraTermino.setText(dados.get("horario_termino").getAsString());
        this.jTextFieldCapacidade.setText(dados.get("capacidade").getAsString());
        this.setLocationRelativeTo(null);
    }
   
    public void setEnterEvent() {
        KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        Set<KeyStroke> keys = new HashSet<>();
        keys.add(enter);
        KeyboardFocusManager.getCurrentKeyboardFocusManager().setDefaultFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, keys);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jLabelLocal = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jPanelInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jDateChooserDataInicio = new com.toedter.calendar.JDateChooser();
        jLabelInicioData = new javax.swing.JLabel();
        jLabelInicioHorario = new javax.swing.JLabel();
        jFormattedTextFieldHoraInicio = new javax.swing.JFormattedTextField();
        jPanelTermino = new javax.swing.JPanel();
        jLabelTermino = new javax.swing.JLabel();
        jLabelTerminoData = new javax.swing.JLabel();
        jDateChooserDataTermino = new com.toedter.calendar.JDateChooser();
        jLabelTerminiHorario = new javax.swing.JLabel();
        jFormattedTextFieldHoraTermino = new javax.swing.JFormattedTextField();
        jLabelLocal1 = new javax.swing.JLabel();
        jTextFieldCapacidade = new javax.swing.JTextField();
        jLabelCancelar = new javax.swing.JLabel();
        jLabelSalvar = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de eventos");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(72, 136, 123));
        jLabelNome.setText("Nome");

        jTextFieldNome.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldNome.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabelDescricao.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(72, 136, 123));
        jLabelDescricao.setText("Descrição");

        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextAreaDesc.setForeground(new java.awt.Color(102, 102, 102));
        jTextAreaDesc.setRows(5);
        jTextAreaDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jScrollPane1.setViewportView(jTextAreaDesc);

        jLabelLocal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelLocal.setForeground(new java.awt.Color(72, 136, 123));
        jLabelLocal.setText("Local");

        jTextFieldLocal.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldLocal.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldLocal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabelInicio.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(72, 136, 123));
        jLabelInicio.setText("Início");

        jDateChooserDataInicio.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooserDataInicio.setDateFormatString("yyyy-MM-dd");

        jLabelInicioData.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelInicioData.setForeground(new java.awt.Color(72, 136, 123));
        jLabelInicioData.setText("Data");

        jLabelInicioHorario.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelInicioHorario.setForeground(new java.awt.Color(72, 136, 123));
        jLabelInicioHorario.setText("Horário");

        jFormattedTextFieldHoraInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jFormattedTextFieldHoraInicio.setForeground(new java.awt.Color(102, 102, 102));
        try {
            jFormattedTextFieldHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldHoraInicioActionPerformed(evt);
            }
        });
        jFormattedTextFieldHoraInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldHoraInicioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInicioData)
                            .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInicioHorario)
                            .addComponent(jFormattedTextFieldHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelInicio))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInicioData)
                    .addComponent(jLabelInicioHorario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextFieldHoraInicio)
                    .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelTermino.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabelTermino.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTermino.setForeground(new java.awt.Color(72, 136, 123));
        jLabelTermino.setText("Término");

        jLabelTerminoData.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelTerminoData.setForeground(new java.awt.Color(72, 136, 123));
        jLabelTerminoData.setText("Data");

        jDateChooserDataTermino.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooserDataTermino.setDateFormatString("yyyy-MM-dd");

        jLabelTerminiHorario.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabelTerminiHorario.setForeground(new java.awt.Color(72, 136, 123));
        jLabelTerminiHorario.setText("Horário");

        jFormattedTextFieldHoraTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jFormattedTextFieldHoraTermino.setForeground(new java.awt.Color(102, 102, 102));
        try {
            jFormattedTextFieldHoraTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelTerminoLayout = new javax.swing.GroupLayout(jPanelTermino);
        jPanelTermino.setLayout(jPanelTerminoLayout);
        jPanelTerminoLayout.setHorizontalGroup(
            jPanelTerminoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerminoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelTerminoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTerminoLayout.createSequentialGroup()
                        .addGroup(jPanelTerminoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTerminoData)
                            .addComponent(jDateChooserDataTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTerminoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTerminiHorario)
                            .addComponent(jFormattedTextFieldHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelTermino))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelTerminoLayout.setVerticalGroup(
            jPanelTerminoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerminoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTermino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTerminoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTerminoData)
                    .addComponent(jLabelTerminiHorario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTerminoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserDataTermino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldHoraTermino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelLocal1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelLocal1.setForeground(new java.awt.Color(72, 136, 123));
        jLabelLocal1.setText("Capacidade");

        jTextFieldCapacidade.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldCapacidade.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCapacidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTextFieldCapacidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCapacidadeKeyTyped(evt);
            }
        });

        jLabelCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCancelar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelCancelar.setForeground(new java.awt.Color(204, 51, 0));
        jLabelCancelar.setText("  Cancelar");
        jLabelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelarMouseClicked(evt);
            }
        });

        jLabelSalvar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSalvar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelSalvar.setForeground(new java.awt.Color(0, 153, 102));
        jLabelSalvar.setText("  Salvar");
        jLabelSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalvarMouseClicked(evt);
            }
        });

        jLabelId.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(72, 136, 123));
        jLabelId.setText("Id");

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextFieldId.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTextFieldId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addComponent(jLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelLocal1)
                        .addComponent(jTextFieldCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                                .addComponent(jPanelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jPanelTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jTextFieldLocal)
                            .addComponent(jLabelLocal)
                            .addComponent(jLabelDescricao))
                        .addGroup(jPanelBGLayout.createSequentialGroup()
                            .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelId))
                            .addGap(28, 28, 28)
                            .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNome)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addComponent(jPanelTermino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addComponent(jPanelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLocal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
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

    private void jFormattedTextFieldHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldHoraInicioActionPerformed

    private void jTextFieldCapacidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCapacidadeKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCapacidadeKeyTyped

    private void jFormattedTextFieldHoraInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHoraInicioKeyTyped

    }//GEN-LAST:event_jFormattedTextFieldHoraInicioKeyTyped

    private void jTextFieldIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void jLabelSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalvarMouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        json.addProperty("id", this.jTextFieldId.getText());
        json.addProperty("nome", this.jTextFieldNome.getText());
        json.addProperty("local", this.jTextFieldLocal.getText());
        json.addProperty("capacidade", this.jTextFieldCapacidade.getText());
        json.addProperty("descricao", this.jTextAreaDesc.getText());
        json.addProperty("data_inicio", ((JTextField) this.jDateChooserDataInicio.getDateEditor().getUiComponent()).getText());
        json.addProperty("data_termino", ((JTextField) this.jDateChooserDataTermino.getDateEditor().getUiComponent()).getText());
        json.addProperty("horario_inicio", this.jFormattedTextFieldHoraInicio.getText());
        json.addProperty("horario_termino", this.jFormattedTextFieldHoraTermino.getText());
        new EventoController().insert(json.toString());
        cancel = false;
        this.dispose();
    }//GEN-LAST:event_jLabelSalvarMouseClicked

    private void jLabelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseClicked
        cancel = true;
        this.dispose();
    }//GEN-LAST:event_jLabelCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormEventos dialog = new FormEventos(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser jDateChooserDataInicio;
    private com.toedter.calendar.JDateChooser jDateChooserDataTermino;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldHoraTermino;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelInicioData;
    private javax.swing.JLabel jLabelInicioHorario;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelLocal1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSalvar;
    private javax.swing.JLabel jLabelTerminiHorario;
    private javax.swing.JLabel jLabelTermino;
    private javax.swing.JLabel jLabelTerminoData;
    private javax.swing.JPanel jPanelBG;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelTermino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextField jTextFieldCapacidade;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
