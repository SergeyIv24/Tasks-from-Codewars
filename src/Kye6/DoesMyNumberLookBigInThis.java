//https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java

package Kye6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoesMyNumberLookBigInThis {
    public static boolean isNarcissistic(int number) {
        String[] numberToArray = String.valueOf(number).split("");
        double armstrongNum = 0;
        for (String digit : numberToArray) {
            armstrongNum = armstrongNum + Math.pow(Double.parseDouble(digit), numberToArray.length);
        }
        return armstrongNum == number;
    }


    //Решение с помощью StreamAPI
    public static boolean isNarcissistic1(int number) {
        double num = Arrays.stream(String.valueOf(number).split(""))
                .map(Double::parseDouble)
                .map(digit -> Math.pow(digit, String.valueOf(number).split("").length))
                .collect(Collectors.summingDouble(Double :: doubleValue));
        return number == num;
    }
}
