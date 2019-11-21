
package View;

import Controller.EventoController;
import com.google.gson.JsonObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class EventComponent extends javax.swing.JPanel {

    JsonObject dados;
    Main parent;
    
    public EventComponent(JsonObject dados, Main parent) {
        this.parent = parent;
        initComponents();
        this.dados = dados;
        this.jLabelCapacidade.setHorizontalAlignment(SwingConstants.RIGHT);
        this.jLabelDataHora.setHorizontalAlignment(SwingConstants.RIGHT);
        SimpleDateFormat ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        this.jLabelNome.setText("<html>" + dados.get("nome").getAsString() + "</html>");
        this.jLabelDescricao.setText("<html>" + dados.get("descricao").getAsString() + "</html>");
        this.jLabelDataHora.setText("<html>" + "De " + ddMMyyyy.format(new Date(dados.get("data_inicio").getAsString())) + " até " + ddMMyyyy.format(new Date(dados.get("data_termino").getAsString())) + "</html>");
        this.jLabelCapacidade.setText("<html>" + "Com capacidade para " + dados.get("capacidade").getAsString() + " pessoas" + "</html>");
        this.jLabelLocal.setText("<html>" + "Local: " + dados.get("local").getAsString() + "</html>");
        this.jLabelExcluir.setIcon(new ImageIcon("icones//error.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDataHora = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelCapacidade = new javax.swing.JLabel();
        jLabelLocal = new javax.swing.JLabel();
        jLabelExcluir = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDataHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataHora.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDataHora.setText("Data e hora");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelCapacidade, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                        .addComponent(jLabelLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDataHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExcluirMouseClicked
        int id = dados.get("id").getAsInt();
        new EventoController().delete(id);
        this.parent.fillEvents();
    }//GEN-LAST:event_jLabelExcluirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCapacidade;
    private javax.swing.JLabel jLabelDataHora;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelExcluir;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelNome;
    // End of variables declaration//GEN-END:variables
}
