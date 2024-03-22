// 6 kye
// https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java

package Kye6;

import java.util.Arrays;

public class TheSupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n) {

        if (customers.length == 0) {
            return 0;
        }

        int[] checkOuts = new int[n];

        for (int i = 0; i < checkOuts.length; i++) {
            if (i >= customers.length) {
                break;
            }
            checkOuts[i] = customers[i];
        }

        for (int i = n; i < customers.length; i++) {

            int minTimeElement = checkOuts[0];
            int minTimeIndex = 0;
            for (int j = 0; j < checkOuts.length; j++) {
                if (checkOuts[j] < minTimeElement) {
                    minTimeElement = checkOuts[j];
                    minTimeIndex = j;
                }
            }
            if (minTimeElement == checkOuts[0]) {
                checkOuts[0] = checkOuts[0] + customers[i];

            } else {
                checkOuts[minTimeIndex] = checkOuts[minTimeIndex] + customers[i];
            }

        }

        return Arrays.stream(checkOuts)
                .max()
                .getAsInt();
    }
}
