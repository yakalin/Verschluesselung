package yakalin.cipher;

/**
 * In dieser Klasse wird eine Verschlüsselung durch Ersetzen durchgeführt.
 * @author Yusuf Akalin
 * @version 2021-11-17
 */
public class SubstitutionCipher extends MonoAlphabeticCipher {

    //Konstruktor
    public SubstitutionCipher(String secretAlphabet){
        this.setSecretAlphabet(secretAlphabet);
    }

    //Setzt das Geheimalphabet
    public void setSecretAlphabet(String secretAlphabet){
        String alphabet="";
        char c;
        boolean bedingung=true;
        for(int i=0; i<secretAlphabet.length();i++){
            c=secretAlphabet.charAt(i);
            if(alphabet.contains(String.valueOf(c))){
                bedingung=false;
                InvalidAlphabetException iae = new InvalidAlphabetException();
                throw iae;
            }
            else{
                alphabet=alphabet+c;
            }
        }
        if(bedingung==true) {
            super.setSecretAlphabet(secretAlphabet);
        }
    }
}
