// 6 Kye
//https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java

package Kye6;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array) {

        char[] alfabet = new char[26]; // Массив символов алфавита
        char i;
        int j;
        for (i = 'a', j = 0; i <= 'z'; i++, j++) { // Заполнение массива символами алфавита
            alfabet[j] = i;
        }

        char[] arrayLowerCase = new char[array.length]; //Новый массив для Lower case
        for (int n = 0; n < array.length; n++) {
            arrayLowerCase[n] = Character.toLowerCase(array[n]);
        }

        char outputLetter = '\u0000'; //Выходная строка
       for (int k = 0; k < alfabet.length; k++) { //Цикл по алфавиту
            for (int l = 0; l < arrayLowerCase.length; l++) { // Цикл по входной строке
                if ((alfabet[k] == arrayLowerCase[l]) & arrayLowerCase[l] != 0) { //Если символы одинаковы
                    arrayLowerCase[l] = 0; //Удаление из массива найденного элемента
                    break;
                }
                if ((alfabet[k] != arrayLowerCase[l]) & arrayLowerCase[l] != 0) {
                    outputLetter = alfabet[k];
                }
            }
        }

        if (array[0] < 97) { //Если заглавные буквы
            return Character.toUpperCase(outputLetter);
        } else { // Если строчные буквы
            return outputLetter;
        }
    }
}
