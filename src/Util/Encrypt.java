
package Util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.BigInteger;

public class Encrypt {
    public static String run(String pass) {
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encrypt.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.update(pass.getBytes(), 0, pass.length());
        return new BigInteger(1, m.digest()).toString(16);
    }
}
