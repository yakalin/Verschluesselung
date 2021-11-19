package yakalin.cipher;

import java.util.Locale;

/**
 * In dieser Klasse ist der Grundbaustein für die Verschlüsselungen.
 * @author Yusuf Akalin
 * @version 2021-11-17
 */
public class MonoAlphabeticCipher implements Cipher {

    //Das Geheimalphabet
    private String secretAlphabet;
    //Das normale Alphabet
    private static String normalAlphabet="abcdefghijklmnopqrstuvwxyzäöüß";

    //Konstruktor
    public MonoAlphabeticCipher(){
        this.secretAlphabet="abcdefghijklmnopqrstuvwxyzäöüß";
    }

    //Gibt Geheimalphabet zurück
    public String getSecretAlphabet() {
        return this.secretAlphabet;
    }

    //Setzt Geheimalphabet
    protected void setSecretAlphabet(String secretAlphabet){
        if(secretAlphabet.length()==30){
            this.secretAlphabet=secretAlphabet;
        }
        else{
            for(int i=secretAlphabet.length(); i<30;i++){
                secretAlphabet=secretAlphabet+normalAlphabet.charAt(i);
            }
            this.secretAlphabet=secretAlphabet;
        }
    }

    /**
     * Diese Methode verschlüsselt den übergebenen Text.
     * @param text der zu verschlüsselnde Text
     * @return den verschlüsselten Text
     */
    @Override
    public String encrypt(String text){
        StringBuilder ergebnis = new StringBuilder();
        int i;
        for(char c : text.toLowerCase().toCharArray()){
            i=normalAlphabet.indexOf(String.valueOf(c));
            if(i>=0){
                ergebnis.append(Character.toLowerCase(this.secretAlphabet.charAt(i)));
            }
            else{
                ergebnis.append(c);
            }
        }
        return ergebnis.toString();
    }

    /**
     * Diese Methode entschlüsselt den übergebenen Text.
     * @param text der zu entschlüsselnde Text
     * @return den entschlüsselten Text
     */
    @Override
    public String decrypt(String text){
        StringBuilder entschlüsseln= new StringBuilder();
        for(char c : text.toLowerCase().toCharArray()){
            int i = secretAlphabet.indexOf(String.valueOf(c));
            if(i>=0){
                entschlüsseln.append(Character.toLowerCase(normalAlphabet.charAt(i)));
            }
            else{
                entschlüsseln.append(c);
            }
        }
        return entschlüsseln.toString();
    }
}
