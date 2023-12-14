package Kye6;
import java.util.ArrayList;
import java.util.Arrays;

public class YourOrderPlease {
    public static String order(String words) {
        char[] numbersArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        ArrayList<char[]> listOfWords = new ArrayList<>();

        String[] wordsArr = words.split(" ");
        ArrayList<char[]> correctOrder = new ArrayList<>();


        for (int i = 0; i < wordsArr.length; i++) {
            char[] arr = wordsArr[i].toCharArray();
            listOfWords.add(arr);
        }

        for (char[] arrOfLet : listOfWords) {
            for (int j = 0; j < arrOfLet.length; j++) {
                for (int k = 0; k < numbersArr.length; k++) {
                    if (numbersArr[k] == arrOfLet[j]) {
                        System.out.println("t");
                        int index = Character.getNumericValue(numbersArr[k]) - 1;
                        correctOrder.add(arrOfLet);
                    }
                }

            }
        }
        System.out.println(correctOrder);




        return "";
    }
}


/*        String[] wordsArr = words.split(" ");
        char[][] wordsArrCh = new char[wordsArr.length][];


        for (int i = 0; i < wordsArr.length; i++) {
            char[] arr = wordsArr[i].toCharArray();
            wordsArrCh[i] = arr;
            System.out.println(wordsArrCh[i]);
        }*/
