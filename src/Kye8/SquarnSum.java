//https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

package Kye8;

public class SquarnSum {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + (n[i] * n[i]);
        }
        return sum;
    }

}
