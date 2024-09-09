//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java


package Kye6;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String textLowCase = text.toLowerCase();
        char[] textArr = textLowCase.toCharArray();
        char[] unigueLetters = new char[textArr.length];
        int counter = 0;
        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < textArr.length; j++) {
                if ((i != j) & (textArr[i] == textArr[j])) {
                    textArr[j] = '\u0000';
                    unigueLetters[i] = textArr[i];
                }
            }
        }

        for (int i = 0; i < unigueLetters.length; i++) {

            if (unigueLetters[i] != '\u0000') {
                counter = counter + 1;
            }

        }
    return counter;
    }
}
