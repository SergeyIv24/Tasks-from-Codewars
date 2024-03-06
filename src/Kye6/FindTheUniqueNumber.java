//Kye 6
//https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

package Kye6;


import java.util.Arrays;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        double[] newArr = Arrays.stream(arr).sorted().toArray();
        if (newArr[newArr.length - 1] != newArr[newArr.length / 2]) {
            return newArr[newArr.length - 1];
        }
        return newArr[0];
    }
}

