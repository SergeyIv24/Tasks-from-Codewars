//https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java

package Kye7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        return Arrays.stream(original.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}
