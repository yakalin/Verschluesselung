package yakalin.cipher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CipherController implements ActionListener{

    private MonoAlphabeticCipher mac;
    private CipherFrame cf;
    private CipherPanel cp;

    public CipherController(){
        mac = new MonoAlphabeticCipher();
        cp = new CipherPanel(this);
        cf = new CipherFrame(cp);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String src = e.getActionCommand();

        if(src == "shift" && cp.getInput() != "") {
            String text = cp.getInput();
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Den zum Verschiebenden Wert eingeben: "));
            mac = new ShiftCipher(value);
        }
        if(src == "substitution" && cp.getInput() != ""){
            String secretAlphabet = JOptionPane.showInputDialog(null,"Das Geheimalphabet angeben: ");
            mac = new SubstitutionCipher(secretAlphabet);
        }
        if(src == "shiftEncrypt" && cp.getInput() != ""){
            String text = cp.getInput();
            cp.setOutput(mac.encrypt(text));
        }
        if(src == "substitutionEncrypt" && cp.getInput() != ""){
            String text = cp.getInput();
            cp.setOutput(mac.encrypt(text));
        }
        if(src == "shiftDecrypt" && cp.getInput() != ""){
            String text = cp.getOutput();
            cp.setOutput(mac.decrypt(text));
        }
        if(src == "substitutionDecrypt" && cp.getInput() != ""){
            String text = cp.getOutput();
            String secretAlphabet = JOptionPane.showInputDialog(null,"Das Geheimalphabet angeben: ");
            SubstitutionCipher sc = new SubstitutionCipher(secretAlphabet);
            cp.setOutput(sc.decrypt(text));
        }
        if(src == "transpositionEncrypt" && cp.getInput() != ""){
            String text = cp.getInput();
            TranspositionCipher tc = new TranspositionCipher(Integer.parseInt(cp.getLevel()));
            cp.setOutput(tc.encrypt(text));
        }
        if(src == "transpositionDecrypt" && cp.getInput() != ""){
            String text = cp.getInput();
            TranspositionCipher tc = new TranspositionCipher(Integer.parseInt(cp.getLevel()));
            cp.setOutput(tc.decrypt(text));
        }
    }

    public static void main(String[] args) {
        new CipherController();
    }
}
