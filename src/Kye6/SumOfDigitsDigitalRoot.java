//https://www.codewars.com/kata/541c8630095125aba6000c00/train/java

package Kye6;

public class SumOfDigitsDigitalRoot {
    public static int digital_root(int n) {

        while (n >= 10) {
            String numStr = "" + n;
            String[] arrNum = numStr.split("");
            int[] numbers = new int[arrNum.length];

            for (int i = 0; i < arrNum.length; i++) {
                numbers[i] = Integer.parseInt(arrNum[i]);
            }
            n = 0;
            for (int i = 0; i < numbers.length; i++) {
                n = n + numbers[i];
            }
        }
        return n;
    }
}
