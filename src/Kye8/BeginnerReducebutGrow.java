//https://www.codewars.com/kata/57f780909f7e8e3183000078/train/java


package Kye8;

public class BeginnerReducebutGrow {
    public static int grow(int[] x){
        int multiplay = 1; //Переменная для умножения в цикле
        for (int i = 0; i < x.length; i++) {
            multiplay = multiplay * x[i];
        }
        return multiplay;
    }

}
