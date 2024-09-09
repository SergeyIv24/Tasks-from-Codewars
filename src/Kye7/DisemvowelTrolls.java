//https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java

package Kye7;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] arrStr = str.toCharArray();
        for (int i = 0; i < arrStr.length; i++){
            for (int j = 0; j < vowels.length; j++){
                if (arrStr[i] == vowels[j]){
                    arrStr[i] = '\u0000';
                }
            }
        }
        String newMes = "";
        for (int i = 0; i < arrStr.length; i++){
            if (arrStr[i] != '\u0000'){
                newMes = newMes + arrStr[i];
            }
        }
        return newMes;
    }
}
