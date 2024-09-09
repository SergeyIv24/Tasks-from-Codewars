//https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

package Kye7;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        String[] arrOfXO = str.split("");
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < arrOfXO.length; i++) {
            if (arrOfXO[i].equalsIgnoreCase("x")) {
                counterX = counterX + 1;
            } else if (arrOfXO[i].equalsIgnoreCase("o")){
                counterO = counterO + 1;

            }

        }

        if (counterX == counterO){
            return true;
        } else {
            return false;
        }
    }
}
