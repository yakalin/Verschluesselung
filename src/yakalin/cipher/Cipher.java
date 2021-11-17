package yakalin.cipher;

/**
 * In diesem Interface sind die Methoden für das Ver- und Entschlüsseln
 * @author Yusuf Akalin
 * @version 2021-11-17
 */
public interface Cipher {
    /**
     * Diese Methode verschlüsselt den übergebenen Text.
     * @param text der zu verschlüsselnde Text
     * @return den verschlüsselten Text
     */
    public String encrypt(String text);

    /**
     * Diese Methode entschlüsselt den übergebenen Text.
     * @param text der zu entschlüsselnde Text
     * @return den entschlüsselten Text
     */
    public String decrypt(String text);
}
