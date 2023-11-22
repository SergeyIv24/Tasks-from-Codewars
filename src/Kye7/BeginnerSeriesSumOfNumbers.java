//https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
//7 kye
package Kye7;

public class BeginnerSeriesSumOfNumbers {
    public int GetSum(int a, int b) {
        int sum = 0;

        if (a > b) {
            int amountOfNumbers = (a - b) + 1;

            for (int i = b; i <= a; i++) {
                sum = sum + i;
            }

            return sum;

        } else if (a < b) {
            int amountOfNumbers = (b - a) + 1;
            for (int i = a; i <= b; i++){
                sum = sum + i;
            }
            return sum;

        } else {
            return a;
        }

    }
}
