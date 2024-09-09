//https://www.codewars.com/kata/54c27a33fb7da0db0100040e


package Kye7;

public class Youresquare {
    public static boolean isSquare(int n) {
        for (int i = 0; i < 10000; i++){
            int sqr = i*i;
            if (n == sqr){
                return true;
            }
        }
        return false;
    }
}
