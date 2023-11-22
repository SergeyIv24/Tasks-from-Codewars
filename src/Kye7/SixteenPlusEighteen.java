//https://www.codewars.com/kata/5effa412233ac3002a9e471d/train/java
//7 kye

package Kye7;

public class SixteenPlusEighteen {
    public static int add(int num1,int num2){
        String num1ToStr = String.valueOf(num1); // Первое число в строку
        String num2ToStr = String.valueOf(num2); // Второе число в строку
        char[] arrNum1 = num1ToStr.toCharArray(); // Первое число в массив символов
        char[] arrNum2 = num2ToStr.toCharArray(); // Второе число в массив символов
        int[] arrForSum1 = new int[arrNum1.length]; // Пустой массив для чисел в int из массива char
        int[] arrForSum2 = new int[arrNum2.length]; // Пустой массив для чисел в int из массива char
        int[] arrRes = new int[arrForSum1.length + arrForSum2.length];
        String result = "";

        for (int i = 0; i < arrNum1.length; i++){
            arrForSum1[i] = Character.getNumericValue(arrNum1[i]);
        }
        for (int i = 0; i < arrNum2.length; i++) {
            arrForSum2[i] = Character.getNumericValue(arrNum2[i]);
        }
        for (int i = 0; i < arrForSum1.length; i++){
            arrRes[i] = arrForSum1[i] + arrForSum2[i];
        }
        for (int i = 0; i < arrRes.length; i++){
            result = result + arrRes[i];
        }
        int resOfadd = Integer.parseInt(result);
        return resOfadd;
    }
}
