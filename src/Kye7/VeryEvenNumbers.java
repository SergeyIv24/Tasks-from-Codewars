//https://www.codewars.com/kata/58c9322bedb4235468000019/train/java
//7 kye

package Kye7;

public class VeryEvenNumbers {
    public static boolean isVeryEvenNumber(int number) {
        boolean check = false;
        int sum = 0; //Переменная для суммирования

        for (int k = 0; k < 4; k++) {
            String numberToStr = String.valueOf(number); // Число в строку
            char[] arrNumbersCh = numberToStr.toCharArray(); // Строку в массив символов
            int[] arrNumbers = new int[arrNumbersCh.length]; // Новый массив для хранения символов в целочисленном типе

            for (int i = 0; i < arrNumbersCh.length; i++) {
                arrNumbers[i] = Character.getNumericValue(arrNumbersCh[i]); // Заполняется массив int значениями из char

            }

            for (int i = 0; i < arrNumbers.length; i++) {
                number = number + arrNumbers[i]; // Суммируются числа в массиве
            }
            if (arrNumbers.length == 1) {
                check = arrNumbers[0] % 2 == 0;
            }
        }
        return check;
    }
}