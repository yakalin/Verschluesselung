package yakalin.cipher;

import java.util.Arrays;

public class KeywordCipher extends MonoAlphabeticCipher{
    public KeywordCipher(String keyword){
        if(keyword != null && keyword != "") {
            this.setSecretAlphabet(keyword);
        }
    }
    public void setSecretAlphabet(String keyword){
        String normalAlphabet="abcdefghijklmnopqrstuvwxyzäöüß";
        String secretAlphabet="";
        Character[] delete = new Character[0];
        char[] keywordC = keyword.toCharArray();
        for(int i = keywordC.length-1; i >= 0; i--){
            for(int a = keywordC.length-1-i; a >= 0; a--){
                if(keyword.charAt(i) == keywordC[a]){
                    delete = Arrays.copyOf(delete, delete.length+1);
                    delete[delete.length-1] = keywordC[a];
                    keywordC[a] = ' ';
                }
            }
        }
        keyword = "";
        for(int i=0;i< keywordC.length;i++){
            if(keywordC[i] != ' '){
                keyword += keywordC[i];
            }
        }
        secretAlphabet += keyword;
        for(int i=0; i<normalAlphabet.length();i++){
            if(Arrays.asList(delete).contains(normalAlphabet.charAt(i))){
                normalAlphabet=normalAlphabet.replace(normalAlphabet.charAt(i), ' ');
            }
        }
        String neuNA="";
        for(int i=0;i< normalAlphabet.length();i++){
            if(normalAlphabet.charAt(i) != ' '){
                neuNA += normalAlphabet.charAt(i);
            }
        }
        secretAlphabet += normalAlphabet;
        super.setSecretAlphabet(secretAlphabet);
    }
}
