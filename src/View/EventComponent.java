
package View;

import Controller.EventoController;
import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class EventComponent extends javax.swing.JPanel {

    JsonObject dados;
    Main parent;
    
    public EventComponent(JsonObject dados, Main parent) {
        this.parent = parent;
        initComponents();
        System.out.println(dados);
        this.dados = dados;
        this.jLabelCapacidade.setHorizontalAlignment(SwingConstants.RIGHT);
        this.jLabelHora.setHorizontalAlignment(SwingConstants.RIGHT);
        this.jLabelNome.setText("<html>" + dados.get("nome").getAsString() + "</html>");
        this.jLabelDescricao.setText("<html>" + dados.get("descricao").getAsString() + "</html>");
        this.jLabelHora.setText("<html> das " + dados.get("horario_inicio").getAsString() + "h até " + dados.get("horario_termino").getAsString() + "</html>");
        this.jLabelData.setText("<html>" + "De " + dados.get("data_inicio").getAsString() + " até " + dados.get("data_termino").getAsString());
        this.jLabelCapacidade.setText("<html>" + "Com capacidade para " + dados.get("capacidade").getAsString() + " pessoas" + "</html>");
        this.jLabelLocal.setText("<html>" + "Local: " + dados.get("local").getAsString() + "</html>");
        this.jLabelExcluir.setIcon(new ImageIcon("icones//error.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHora = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelCapacidade = new javax.swing.JLabel();
        jLabelLocal = new javax.swing.JLabel();
        jLabelExcluir = new javax.swing.JLabel();
        jLabelExcluir1 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(51, 51, 51));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHora.setText("Data e hora");

        jLabelNome.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(72, 136, 123));
        jLabelNome.setText("Nome");

        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDescricao.setText("Descrição");

        jLabelCapacidade.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelCapacidade.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCapacidade.setText("Capacidade");
        jLabelCapacidade.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelLocal.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabelLocal.setForeground(new java.awt.Color(51, 51, 51));
        jLabelLocal.setText("Local");

        jLabelExcluir.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelExcluir.setForeground(new java.awt.Color(204, 51, 0));
        jLabelExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExcluir.setText("  Excluir");
        jLabelExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true));
        jLabelExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExcluirMouseClicked(evt);
            }
        });

        jLabelExcluir1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelExcluir1.setForeground(new java.awt.Color(51, 51, 255));
        jLabelExcluir1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExcluir1.setText("Atualizar");
        jLabelExcluir1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 1, true));
        jLabelExcluir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExcluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExcluir1MouseClicked(evt);
            }
        });

        jLabelData.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(153, 51, 255));
        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelData.setText("Data e hora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHora)
                    .addComponent(jLabelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExcluirMouseClicked
        int id = dados.get("id").getAsInt();
        new EventoController().delete(id);
        this.parent.fillEvents();
    }//GEN-LAST:event_jLabelExcluirMouseClicked

    private void jLabelExcluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExcluir1MouseClicked
        new FormEventos(null, true, this.dados).setVisible(true);
        this.parent.fillEvents();
    }//GEN-LAST:event_jLabelExcluir1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCapacidade;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelExcluir;
    private javax.swing.JLabel jLabelExcluir1;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelNome;
    // End of variables declaration//GEN-END:variables
}
