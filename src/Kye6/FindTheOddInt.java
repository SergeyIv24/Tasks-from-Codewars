//https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

package Kye6;

public class FindTheOddInt {
    public static int findIt(int[] a) {
        int counter = 0;
        int outputNum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter += 1;
                }
            }
            if (counter % 2 != 0) {
                outputNum = a[i];
                break;

            } else {
                counter = 0;
            }
        }
        return outputNum;
    }
}
