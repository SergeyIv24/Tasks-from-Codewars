//https://www.codewars.com/kata/5effa412233ac3002a9e471d/train/java

package Kye7;

public class SixteenPlusEighteen {
    public static int add(int num1,int num2){
        int counterForNum1 = 0;
        int counterForNum2 = 0;
        String num1ToStr = String.valueOf(num1); // Первое число в строку
        String num2ToStr = String.valueOf(num2); // Второе число в строку

        for (int i = 0; i < num1ToStr.length(); i++) { //Считается количество символов в строке
            counterForNum1 = counterForNum1 + 1;
        }

        for (int i = 0; i < num2ToStr.length(); i++) { //Считается количество символов в строке
            counterForNum2 = counterForNum2 + 1;
        }

        //В зависимости от сравнения количества цифр, добавляется нужно количество 0
        if (counterForNum2 < counterForNum1) {
            if (counterForNum1 - counterForNum2 == 1) {
                num2ToStr = "0" + num2ToStr;
            } else if (counterForNum1 - counterForNum2 == 2) {
                num2ToStr = "00" + num2ToStr;
            } else if (counterForNum1 - counterForNum2 == 3) {
                num2ToStr = "000" + num2ToStr;
            }

        } else if (counterForNum2 > counterForNum1) {
            if (counterForNum2 - counterForNum1 == 1) {
                num1ToStr = "0" + num1ToStr;
            } else if (counterForNum2 - counterForNum1 == 2) {
                num1ToStr = "00" + num1ToStr;
            } else if (counterForNum2 - counterForNum1 == 3) {
                num1ToStr = "000" + num1ToStr;
            }
        }

        char[] arrNum1 = num1ToStr.toCharArray(); // Первое число в массив символов
        char[] arrNum2 = num2ToStr.toCharArray(); // Второе число в массив символов


        int[] arrForSum1 = new int[arrNum1.length]; // Пустой массив для чисел в int из массива char
        int[] arrForSum2 = new int[arrNum2.length]; // Пустой массив для чисел в int из массива char
        int[] arrRes = new int[arrForSum1.length];
        String result = "";

        for (int i = 0; i < arrNum1.length; i++){ //Массив char в массив int
            arrForSum1[i] = Character.getNumericValue(arrNum1[i]);
        }
        for (int i = 0; i < arrNum2.length; i++) { //Массив char в массив int
            arrForSum2[i] = Character.getNumericValue(arrNum2[i]);
        }


        for (int i = 0; i < arrRes.length; i++){ // Заполнение нового массива сложением значений из двух исходных
            arrRes[i] = arrForSum1[i] + arrForSum2[i];
        }


        for (int i = 0; i < arrRes.length; i++){
            result = result + arrRes[i];
        }

        int resOfadd = Integer.parseInt(result);
        return resOfadd;
    }
}
