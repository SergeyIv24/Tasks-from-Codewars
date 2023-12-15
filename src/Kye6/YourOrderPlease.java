// kye 6
// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

package Kye6;
import java.util.ArrayList;

public class YourOrderPlease {
    public static String order(String words) {
        char[] numbersArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9'}; //Массив символов чисел для опр-ия индекса
                                                                            // положения слова
        if (words.isEmpty()) {
            return words; //Если вошла пустая строка, возвращается пустая строка
        }

        String[] wordsArr = words.split(" "); // Строка в массив строк

        char[][] listOfWords = new char[wordsArr.length][]; // Массив массивов символов, каждая срока в wordsArr в массив

        char[][] correctOrder = new char[wordsArr.length][]; //Массив символов для слов в верном порядке

        for (int i = 0; i < wordsArr.length; i++) { //Преобразование строк в массивы символов
            char[] arr = wordsArr[i].toCharArray();
            listOfWords[i] = arr;
        }

        for (char[] arrOfLetters : listOfWords) { //Цикл по массиву массивов
            for (char arrOfLetter : arrOfLetters) { //Цикл по i - ому слову
                for (char c : numbersArr) { //Цикл по символам чисел
                    if (c == arrOfLetter) { //Если символ в слове равен символу в массиве цифр
                        int index = Character.getNumericValue(c) - 1; //Индекс слова
                        correctOrder[index] = arrOfLetters; //В массив с правильным порядком
                    }
                }
            }
        }

        String outputStr = ""; //Выходная строка

        for (int i = 0; i < correctOrder.length; i++) {
            if (i != 0) {
                outputStr = outputStr + " "; // Пробел после каждого слова (массива)
            }
            for (int j = 0; j < correctOrder[i].length; j++) {
                outputStr = outputStr + correctOrder[i][j]; //Добавления символов массива массивов в строку
            }

        }

        return outputStr;
    }
}
