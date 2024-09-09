//https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java

package Kye6;

import java.util.Arrays;

public class FindTheParityOutlier {
    public static int find(int[] integers) {
        int[] numbers = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        if (numbers.length == 1) {
            return numbers[0];
        } else {
            return Arrays.stream(integers).filter(n -> n % 2 == 0).toArray()[0];
        }
    }
}
