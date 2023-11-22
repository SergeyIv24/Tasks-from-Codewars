//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
//7 kye
package Kye7;

public class SquareEveryDigit {
    public int squareDigits(int n) {
        String nToStr = String.valueOf(n);
        char[] arrN = nToStr.toCharArray();
        int [] arrNint = new int[arrN.length];

        for (int i = 0; i < arrN.length; i++){
            arrNint[i] = arrN[i];
        }

        for (int i = 0; i < arrNint.length; i++) {
            arrNint[i] = Character.getNumericValue(arrNint[i]) * Character.getNumericValue(arrNint[i]);
        }

        String sqrtSum = "";

        for (int i = 0; i < arrNint.length; i++){
            sqrtSum = sqrtSum + arrNint[i];
        }

        int sqrt = Integer.parseInt(sqrtSum);

        return sqrt;
    }
}
