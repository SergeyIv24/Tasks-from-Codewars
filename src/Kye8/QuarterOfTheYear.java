//https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/train/java
//8 kye
package Kye8;

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
        if (month <= 3) {
            return 1;
        } else if (month <= 6) {
            return 2;
        } else if (month <= 9) {
            return 3;
        } else {
            return 4;
        }
    }

}
