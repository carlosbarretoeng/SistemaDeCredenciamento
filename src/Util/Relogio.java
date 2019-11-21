
package Util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Relogio implements Runnable{
    
    private final SimpleDateFormat pattern = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private final JLabel label;
    
    public Relogio(JLabel label) {
        this.label = label;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                this.label.setText(this.pattern.format(new Date()));
            } catch (InterruptedException ex) {
                Logger.getLogger(Relogio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
