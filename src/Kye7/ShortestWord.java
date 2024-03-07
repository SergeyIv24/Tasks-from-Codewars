//Kye 7
//https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java

package Kye7;

import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).min((word1, word2) -> word1.length() - word2.length()).get().length();
    }
}
