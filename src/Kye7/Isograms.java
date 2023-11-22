//https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
// 7kye
package Kye7;

public class Isograms {
    public static boolean  isIsogram(String str) {
        String[] arrOfLatters = str.split("");

        for (int i = 0; i < arrOfLatters.length; i++) {
            for (int j = 0; j < arrOfLatters.length; j++) {
                if ((arrOfLatters[j].equalsIgnoreCase(arrOfLatters[i])) & (i != j)) {
                    return false;
                }
            }

        }
    return true;
    }
}
