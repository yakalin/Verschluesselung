package yakalin.cipher;

/**
 * In dieser Klasse ist der Grundbaustein für die Verschlüsselungen.
 * @author Yusuf Akalin
 * @version 2021-11-17
 */
public class MonoAlphabeticCipher implements Cipher {

    //Das Geheimalphabet
    private String secretAlphabet;

    //Konstruktor
    public MonoAlphabeticCipher(){

    }

    //Gibt Geheimalphabet zurück
    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    //Setzt Geheimalphabet
    protected void setSecretAlphabet(String secretAlphabet){

    }

    /**
     * Diese Methode verschlüsselt den übergebenen Text.
     * @param text der zu verschlüsselnde Text
     * @return den verschlüsselten Text
     */
    @Override
    public String encrypt(String text){
        String encryptedText="";

        return encryptedText;
    }

    /**
     * Diese Methode entschlüsselt den übergebenen Text.
     * @param text der zu entschlüsselnde Text
     * @return den entschlüsselten Text
     */
    @Override
    public String decrypt(String text){
        String decryptedText="";

        return decryptedText;
    }
}
