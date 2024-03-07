//Kye 5
//https://www.codewars.com/kata/513e08acc600c94f01000001

package Kye5;

public class RGBToHexConversion {
    public static String rgb(int r, int g, int b) {
       if (r < 0) {
            r = 0;
        }
       if (r > 255) {
           r = 255;
       }
        if (g < 0){
            g = 0;
        }
        if (g > 255) {
            g = 255;
        }
        if (b < 0) {
            b = 0;
        }
        if (b > 255) {
            b = 255;
        }
        //System.out.println(String.format("%02X%02X%02X", r, g, b)); //Другое решение

        String rStr = String.format("%2s", Integer.toHexString(r).toUpperCase());
        String newR = ((rStr.charAt(0) == ' ') ? rStr.replace(" ", "0") : rStr);
        String gStr = String.format("%2s", Integer.toHexString(g).toUpperCase());
        String newG = ((gStr.charAt(0) == ' ') ? gStr.replace(" ", "0") : gStr);
        String bStr = String.format("%2s", Integer.toHexString(b).toUpperCase());
        String newB = ((bStr.charAt(0) == ' ') ? bStr.replace(" ", "0") : bStr);
        return newR + newG + newB;
    }
}
