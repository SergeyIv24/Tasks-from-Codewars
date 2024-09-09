//https://www.codewars.com/kata/523f5d21c841566fde000009/train/java

package Kye6;

import java.util.ArrayList;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        int countForDelete = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    countForDelete += 1;
                }
            }
        }

        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean isThereMatch = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isThereMatch = true;

                }
            }
            if (!isThereMatch) {
                output.add(a[i]);
            }
        }
        int[] out = new int[output.size()];

        for (int i = 0; i < output.size(); i++) {
            out[i] = output.get(i);
        }

        return out;
    }
}

