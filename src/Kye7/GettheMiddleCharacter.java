//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java


package Kye7;

public class GettheMiddleCharacter {
    public static String getMiddle(String word) {

        String[] arrInput = word.split(""); // В массив строк из символов

        int countOfLeters = 0; // Счетчик количества букв

        for (int i = 0; i < arrInput.length; i++){ // Подсчет количества букв
            countOfLeters = countOfLeters + 1;
        }

        if (countOfLeters % 2 == 0){
            int index1 = (countOfLeters / 2) -1; // Индекс первой буквы
            int index2 = index1 + 1; // Индекс второй буквы
            String output = "" + arrInput[index1] + arrInput[index2]; //Возвращается элемент массива по индексу в строке
            return output;

        } else {
            int index1 = (countOfLeters / 2); //Индекс первой буквы
            String output = "" + arrInput[index1]; //Возвращается элемент массива по индексу в строке
            return output;
        }
    }
}
