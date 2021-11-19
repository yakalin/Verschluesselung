package yakalin.cipher;

/**
 * Diese Exception wird geworfen, wenn das Alphabet doppelte Zeichen enthält.
 * @author Yusuf Akalin
 * @version 2021-11-19
 */
public class InvalidAlphabetException extends RuntimeException{
    //Konstruktor ohne Parameter
    public InvalidAlphabetException(){
        super("Das Alphabet darf keine doppelten Zeichen enthalten!");
    }
    //Konstruktor mit Parameter
    public InvalidAlphabetException(String message){
        super(message);
    }
}
