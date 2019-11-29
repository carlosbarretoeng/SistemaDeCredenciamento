package View;

import Util.DataType;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileScreen extends javax.swing.JDialog {

    public static String path = "";
    public static boolean cancel = true;
    
    public FileScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        FileScreen.path = "";
        FileScreen.cancel = true;
        File workingDirectory = new File(System.getProperty("user.dir"));
        this.jFileChooser.setCurrentDirectory(workingDirectory);
        this.setLocationRelativeTo(null);
    }
    
    public FileScreen(java.awt.Frame parent, boolean modal, int type, DataType dataType) {
        super(parent, modal);
        initComponents();
        FileScreen.path = "";
        FileScreen.cancel = true;
        File workingDirectory = new File(System.getProperty("user.dir"));
        this.jFileChooser.setCurrentDirectory(workingDirectory);
        this.setLocationRelativeTo(null);
        this.jFileChooser.setFileSelectionMode(type);
        this.jFileChooser.setAcceptAllFileFilterUsed(false);
        this.jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter(dataType.name(), dataType.toString()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser.setCurrentDirectory(new java.io.File("D:\\Photoshop\\Imagens"));
        jFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserActionPerformed
        FileScreen.cancel = evt.getActionCommand().equals("CancelSelection");
        try{
            FileScreen.path = this.jFileChooser.getSelectedFile().getAbsolutePath();
        }
        catch(Exception e) {
        }
        this.dispose();
    }//GEN-LAST:event_jFileChooserActionPerformed
 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FileScreen dialog = new FileScreen(new javax.swing.JFrame(), true);
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
    private javax.swing.JFileChooser jFileChooser;
    // End of variables declaration//GEN-END:variables
}
