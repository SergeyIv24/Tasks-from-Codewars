//https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

package Kye8;

public class ReversedStrings {
    public static String solution(String str) {
        String newStr = "";
        for (int i = (str.length() - 1); i >= 0; i--){
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }
}
