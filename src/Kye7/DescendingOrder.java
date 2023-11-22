//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java
//7 kye
package Kye7;


public class DescendingOrder {
    public static int sortDesc(final int num) {
        String numToStr = "" + num; // Число в строку

        String[] arrStrNum = numToStr.split(""); //Строка в массив строк
        int[] arrNum = new int[arrStrNum.length]; // Массив для чисел из строки

        for (int i = 0; i < arrNum.length; i++){
            arrNum[i] = Integer.parseInt(arrStrNum[i]); //Заполнение массива для чисел, значениями из массива строк
        }


        // Пузырьковая сортировка в обратном порядке
        for (int j = (arrNum.length-1); j >= 1 ; j--){
            for (int i = (arrNum.length - 1); i >= 1; i--) {
                if (arrNum[i - 1] > arrNum[i]) {

                } else {
                    int swap = arrNum[i - 1]; // Для переставления значений
                    arrNum[i - 1] = arrNum[i];
                    arrNum[i] = swap; //
                }
            }
        }

        String revNumToStr = "";

        for (int i = 0; i < arrNum.length; i ++){ // Массив чисел в строку
            revNumToStr = revNumToStr + arrNum[i];
        }

        int sortNum = Integer.parseInt(revNumToStr); // Строка в число
        return sortNum;

    }
}
