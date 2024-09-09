//https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

package Kye5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimplePigLatin {
    public static String pigIt(String str) {
        String[] sentenceArr = str.split(" ");
        List<String> list = Arrays.stream(sentenceArr).map(word -> {
            String[] wordArr = word.split("");
            if ((wordArr.length <= 1) & !(Character.isLetter(wordArr[wordArr.length - 1].charAt(0)))) {
                return word;
            }
            final String firstLetter = wordArr[0];

            if (Character.isLetter(wordArr[wordArr.length - 1].charAt(0))
            | (Character.isDigit(wordArr[wordArr.length - 1].charAt(0)))) {
                wordArr[0] = " ";
                wordArr[wordArr.length - 1] = wordArr[wordArr.length - 1] + firstLetter + "ay ";
            } else {
                wordArr[0] = " ";
                wordArr[wordArr.length - 2] = wordArr[wordArr.length - 2] + firstLetter + "ay ";
            }


            return String.join("", wordArr).trim() + " ";
        }).collect(Collectors.toList());
        String out = "";

        for (String letter : list) {
            out = out + letter;
        }
        return out.trim();
    }
}