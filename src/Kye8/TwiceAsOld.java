//https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java

package Kye8;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears){
        int differenceOfAge = 2 * sonYears - dadYears;
        if (differenceOfAge < 0) {
            differenceOfAge = differenceOfAge * -1;
        }
        return differenceOfAge;
    }

}
