//kye 6
//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

package Kye6;

import java.util.ArrayList;
import java.util.List;

public class DuplicateEncoder {
    public static String encode(String word){
        String wordLow = word.toLowerCase();
        char[] arrCh = wordLow.toCharArray();

        List<Character> symbolWord = new ArrayList<>();
        List<Character> outSymbol = new ArrayList<>();

        for (int i = 0; i < arrCh.length; i++) {

            symbolWord.add(arrCh[i]);
        }
        for (Character sym : symbolWord) {
            int counterOfSym = 0;
            for (Character sumForFind : symbolWord) {
                if (sym == sumForFind) {
                    counterOfSym += 1;
                }
            }
            if (counterOfSym > 1) {
                outSymbol.add(')');
            } else if (counterOfSym == 1) {
                outSymbol.add('(');
            }
        }

        String outWord = "";

        for (Character sym : outSymbol) {
            outWord = outWord + sym;
        }

        return outWord;
    }
}
