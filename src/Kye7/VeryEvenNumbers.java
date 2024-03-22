//https://www.codewars.com/kata/58c9322bedb4235468000019/train/java
//7 kye

package Kye7;

public class VeryEvenNumbers {
    public static boolean isVeryEvenNumber(int number) {

        if ((number) < 10) {
            return number % 2 == 0;
        }

        while (number >= 10) {
            String[] arrNumbers = String.valueOf(number).split("");
            number = 0;
            for (String num : arrNumbers) {
                number = number + Integer.parseInt(num);
            }
        }
        return number % 2 == 0;
    }
}