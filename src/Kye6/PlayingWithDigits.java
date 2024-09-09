//https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java

package Kye6;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        String[] arr = String.valueOf(n).split("");
        int sum = 0;
        int iterP = p;
        int newP = 1;
        for (int i = 0; i < arr.length; i++) {
            sum = (int) (sum + Math.pow(Double.parseDouble(arr[i]), iterP++));
        }
        int k;
        while (true) {
            k = n * newP;
            if (k == sum) {
                return (n != 0) ? (sum/n) : 1;
            }
            newP = newP + 1;
            if (newP > 13500) {
                break;
            }
        }
        return -1;
    }
}
