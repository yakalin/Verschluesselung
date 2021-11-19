package yakalin.cipher;

import javax.swing.*;

/**
 * In dieser Klasse wird getestet.
 * @author Yusuf Akalin
 * @version 2021-11-18
 */
public class Test {
    public static void main(String[] args) {
        SubstitutionCipher sc = new SubstitutionCipher("ßüöäzyxwvutsrqponmlkjihgfedcba");
        String text = JOptionPane.showInputDialog(null,"Den zu verschlüsselnden Text eingben: ");
        JOptionPane.showMessageDialog(null, sc.encrypt(text));
        text=sc.encrypt(text);
        JOptionPane.showMessageDialog(null,sc.decrypt(text));
    }
}
