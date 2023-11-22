//https://www.codewars.com/kata/5583090cbe83f4fd8c000051
//8 kye

package Kye8;

public class ConvertNumberToReverseArrayOfDigits {
    public static int[] digitize(long n) {
        String numCh = String.valueOf(n); //Преобразование числа в строку
        int[] arr = new int[numCh.length()]; //Массив для записи чисел
        for (int i = 0; i < numCh.length(); i++) {
            int num = Character.getNumericValue(numCh.charAt(i)); //На каждой итерации каждое число переводим в int
            arr[numCh.length() - 1 - i] = num; //Записываем числа в массив в обратном порядке
        }
        return arr;
    }
}
