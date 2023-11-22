//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
//7 kye
package Kye7;

public class HighestandLowest {
    public static String highAndLow(String numbers) {
        String[] newStrArr = numbers.split(" ");
        int[] arrInt = new int[newStrArr.length];

        for (int i = 0; i < newStrArr.length; i++) {
            arrInt[i] = Integer.parseInt(newStrArr[i]);

        }

        int maxValue = arrInt[0];

        for (int i = 1; i < arrInt.length; i++){

            if (arrInt[i] > maxValue) {
                maxValue = arrInt[i];
            }
        }

        int minValue = arrInt[0];
        for (int i = 1; i < arrInt.length; i++){
            if (arrInt[i] < minValue) {
                minValue = arrInt[i];
            }
        }

        String output = "" + maxValue + " " + minValue;

        return output;

    }
}
