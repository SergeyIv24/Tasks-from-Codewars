//https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java
//8 kye

package Kye8;

public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name){
        char countLatters = name.charAt(0);
        char searchLatter = 'R';
        char searchLatterLow = 'r';
        if ((countLatters == searchLatterLow) | (countLatters == searchLatter)){
            String output = name + " plays banjo";
            return output;
        } else {
            String output = name + " does not play banjo";
            return output;
        }
    }
}
