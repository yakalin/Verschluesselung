package yakalin.cipher;

/**
 * In dieser Klasse wird eine Verschlüsselung durch Verschiebung der Buchstaben durchgeführt.
 * @author Yusuf Akalin
 * @version 2021-11-17
 */
public class ShiftCipher extends MonoAlphabeticCipher {
    private int value;
    private String secretAlphabet;
    //Konstruktor
    public ShiftCipher(int value){
        this.setShiftValue(value);
    }

    //Setzt den Wert, um den verschoben werden soll
    public void setShiftValue(int value){
        String normalAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        String secretAlphabet = "";
        for(int i=0; i<30;i++){
            if(i+value>=30){
                secretAlphabet = secretAlphabet + normalAlphabet.charAt(i + value - 30);
            }else {
                secretAlphabet = secretAlphabet + normalAlphabet.charAt(i + value);
            }
        }
        super.setSecretAlphabet(secretAlphabet);
    }
    //Getter-Methode
    public String getSecretAlphabet(){
        return this.secretAlphabet;
    }
}
