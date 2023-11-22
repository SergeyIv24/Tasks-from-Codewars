//https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java
//8 kye
package Kye8;

public class AWolfInSheepsClothing {

    public static String warnTheSheep(String[] array) {
        String output = "";
        for (int i = (array.length - 1); i >= 0; i--) {
            if (array[array.length - 1].equalsIgnoreCase("wolf")) {
                output = "Pls go away and stop eating my sheep";

            } else if (array[i].equalsIgnoreCase("wolf")) {
                int wolfIndex = i;
                output = "Oi! Sheep number " + (array.length - (i + 1)) + "!" + " You are about to be eaten by a wolf!";
            }
        }
        return output;
    }

}
