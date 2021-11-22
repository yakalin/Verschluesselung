package yakalin.cipher;

import javax.swing.*;
import java.awt.*;

/**
 * In dieser Klasse ist der Inhalt der GUI.
 * @author Yusuf Akalin
 * @version 2021-11-19
 */
public class CipherPanel extends JPanel{

    private JButton shift, substitution, shiftEncrypt, substitutionEncrypt, shiftDecrypt, substitutionDecrypt;
    private JTextField input;
    private JLabel output;

    public CipherPanel(CipherController c){
        this.setLayout(new BorderLayout());
        shift = new JButton("Shift Cipher");
        shift.setActionCommand("shift");
        shift.addActionListener(c);
        substitution = new JButton("Substitution Cipher");
        substitution.setActionCommand("substitution");
        substitution.addActionListener(c);
        input = new JTextField("Text eingeben",10);
        output = new JLabel("Hier steht der verschlüsselte Text");
        shiftEncrypt = new JButton("Shift Encryption");
        shiftEncrypt.setActionCommand("shiftEncrypt");
        shiftEncrypt.addActionListener(c);
        substitutionEncrypt = new JButton("Substitution Encryption");
        substitutionEncrypt.setActionCommand("substitutionEncrypt");
        substitutionEncrypt.addActionListener(c);
        shiftDecrypt = new JButton("Shift Decryption");
        shiftDecrypt.setActionCommand("shiftDecrypt");
        shiftDecrypt.addActionListener(c);
        substitutionDecrypt = new JButton("Substitution Decryption");
        substitutionDecrypt.setActionCommand("substitutionDecrypt");
        substitutionDecrypt.addActionListener(c);
        JPanel buttons = new JPanel(new GridLayout(3,2));
        buttons.add(shift);
        buttons.add(substitution);
        buttons.add(shiftEncrypt);
        buttons.add(substitutionEncrypt);
        buttons.add(shiftDecrypt);
        buttons.add(substitutionDecrypt);
        this.add(buttons, BorderLayout.PAGE_END);
        this.add(input, BorderLayout.PAGE_START);
        this.add(output, BorderLayout.CENTER);
    }

    public String getInput(){
        return this.input.getText();
    }
    public String getOutput(){return this.output.getText();}
    public void setOutput(String text){
        this.output.setText(text);
    }
}