//https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java

package Kye6;

import java.util.Arrays;

public class BitCounting {
    public static int countBits(int n){
        int surplus;
        String numInTwo = "";
        while (n > 1) {
            surplus = n % 2;
            n = n / 2;
            numInTwo = numInTwo + surplus;
        }
        StringBuilder revNum = new StringBuilder(numInTwo).reverse();
        String number2;
        number2 = n + revNum.toString();
        String[] arrNumber2 = number2.split("");
        return (int) Arrays.stream(arrNumber2).filter(digit -> !digit.equals("0")).count();
    }
}
