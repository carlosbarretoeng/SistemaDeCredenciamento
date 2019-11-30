
package View;

import com.google.gson.JsonObject;

public class PessoaComponent extends javax.swing.JPanel {
    
    public PessoaComponent(JsonObject json) {
        initComponents();
        this.jLabelNome.setText(json.get("nome").getAsString());
        this.jLabelMatricula.setText("Matrícula: " + json.get("matricula").getAsString());
        this.jLabelCidade.setText("Cidade: " + json.get("cidade").getAsString());
        this.jLabelCpf.setText("CPF: " + json.get("cpf").getAsString());
        this.jLabelEmail.setText("Email: " + json.get("email").getAsString());
        this.jLabelEndereco.setText("Endereço: " + json.get("endereco").getAsString());
        this.jLabelRG.setText("RG: " + json.get("rg").getAsString());
        this.jLabelTelefone.setText("Telefone: " + json.get("telefone").getAsString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBG = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelMatricula = new javax.swing.JLabel();

        jPanelBG.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBG.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNome.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(72, 136, 123));
        jLabelNome.setText("Nome");

        jLabelCpf.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelCpf.setText("CPF");

        jLabelRG.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelRG.setText("RG");

        jLabelEndereco.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelEndereco.setText("Endereço");

        jLabelCidade.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelCidade.setText("Cidade");

        jLabelTelefone.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTelefone.setText("Telefone");

        jLabelEmail.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelEmail.setText("Email");

        jLabelMatricula.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelMatricula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMatricula.setText("Matricula");

        javax.swing.GroupLayout jPanelBGLayout = new javax.swing.GroupLayout(jPanelBG);
        jPanelBG.setLayout(jPanelBGLayout);
        jPanelBGLayout.setHorizontalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelBGLayout.createSequentialGroup()
                        .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBGLayout.createSequentialGroup()
                                .addComponent(jLabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanelBGLayout.setVerticalGroup(
            jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNome)
                .addGap(18, 18, 18)
                .addGroup(jPanelBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelRG))
                .addGap(18, 18, 18)
                .addComponent(jLabelEndereco)
                .addGap(18, 18, 18)
                .addComponent(jLabelCidade)
                .addGap(18, 18, 18)
                .addComponent(jLabelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmail)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelBG;
    // End of variables declaration//GEN-END:variables
}
