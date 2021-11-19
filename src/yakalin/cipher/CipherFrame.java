package yakalin.cipher;

import javax.swing.*;
import java.awt.*;

public class CipherFrame extends JFrame {

    public CipherFrame(CipherPanel p){
        super("Cipher");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0,0, 1000, 600);
        this.setVisible(true);
        this.add(p);
    }
}
