package yakalin.cipher;

public class TranspositionCipher implements Cipher{
    private int transpositionLevel;
    public TranspositionCipher(int transpositionLevel){
        if(transpositionLevel > 0){
            this.transpositionLevel=transpositionLevel;
        }
    }

    @Override
    public String encrypt(String text){
        String encrypt = "";
        String[] level = new String[this.transpositionLevel];
        for(int x = 0; x < level.length; x++){
            level[x]="";
        }
        for(int b = 0; b < text.length();) {
            for (int i = 0; i < this.transpositionLevel; i++) {
                if((i+b)<text.length()) {
                    level[i] = level[i] + text.charAt(i + b);
                }
            }
            b += this.transpositionLevel;
        }
        for (int a = 0; a < level.length; a++) {
            encrypt = encrypt + level[a];
        }
        return encrypt;
    }

    @Override
    public String decrypt (String text){
        String decrypt = "";
        boolean bedingung = false;
        if(text.length() % this.transpositionLevel != 0){
            text += "#";
            bedingung = true;
        }
        int wert = (text.length()/this.transpositionLevel);
        String[] level = new String[this.transpositionLevel];
        for(int x = 0; x < level.length; x++){
            level[x]="";
        }
        for(int b = 0; b < this.transpositionLevel; b++){
            for(int a = 0 + b; a < text.length(); a += wert){
                if(a < text.length()) {
                    level[b] = level[b] + text.charAt(a);
                }
            }
        }
        if(bedingung == true){
            level[level.length-1] = level[level.length-1] + text.charAt(wert-1);
        }
        for( int i = 0; i < level.length; i++){
            decrypt = decrypt + level[i];
        }
        return decrypt;
    }

    public void setTranspositionLevel(int transpositionLevel) {
        if(transpositionLevel > 0) {
            this.transpositionLevel = transpositionLevel;
        }
    }
}
