//https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java
//8 kye

package Kye8;

public class SumArrays {
    public static double sum(double[] numbers) {
        double sum = 0;
        if (numbers.length != 0) {
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
            return sum;
        } else {
            return 0;
        }
    }
}
