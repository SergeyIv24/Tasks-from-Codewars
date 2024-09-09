//https://www.codewars.com/kata/544a54fd18b8e06d240005c0/train/java

package Kye7;


import java.util.ArrayList;
import java.util.List;

public class SmallestValueOfAnArray {
    public static int findSmallest( final int[] numbers, final String toReturn ) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersList.add(numbers[i]);
        }
        switch (toReturn) {
            case "value":
                return numbersList.stream().min((num1, num2) -> num1 - num2).get();
            case "index":
                int element = numbersList.stream().min((n1, n2) -> n1 - n2).get();
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == element) {
                        return i;
                    }
                }
        }
        return 0;
    }
}
