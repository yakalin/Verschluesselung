package yakalin.cipher;

import javax.swing.*;

/**
 * In dieser Klasse wird getestet.
 * @author Yusuf Akalin
 * @version 2021-11-18
 */
public class Test {
    public static void main(String[] args) {
        MonoAlphabeticCipher mac = new MonoAlphabeticCipher();
        String text= JOptionPane.showInputDialog(null,"Text eingeben: ");
        mac.setSecretAlphabet("ßüöäzyxwvutsrqponmlkjihgfedcba");
        JOptionPane.showMessageDialog(null, mac.encrypt(text));
        text=mac.encrypt(text);
        JOptionPane.showMessageDialog(null,mac.decrypt(text));
    }
}
