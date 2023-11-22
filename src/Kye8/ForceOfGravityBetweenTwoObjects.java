//https://www.codewars.com/kata/5b609ebc8f47bd595e000627/train/java
//8 kye
package Kye8;

public class ForceOfGravityBetweenTwoObjects {

    public static double solution(double[] arrVal, String[] arrUnit) {
        double[] transferToSI = new double[3];
        double G = 6.67 * Math.pow(10, -11);

        for (int i = 0; i < arrUnit.length; i++) {

            if (arrUnit[i].equalsIgnoreCase("g")) {
                transferToSI[i] = (double) 1 / 1_000;
            } else if (arrUnit[i].equalsIgnoreCase("mg")) {
                transferToSI[i] = (double) 1 / 1_000_000;
            } else if (arrUnit[i].equalsIgnoreCase("μg")) {
                transferToSI[i] = (double) 1 / 1_000_000_000;
            } else if (arrUnit[i].equalsIgnoreCase("lb")) {
                transferToSI[i] = 0.453592;
            } else {
                transferToSI[i] = 1;
            }

            if (arrUnit[arrUnit.length - 1].equalsIgnoreCase("cm")) {
                transferToSI[transferToSI.length - 1] = (double) 1 / 100;
            } else if (arrUnit[arrUnit.length - 1].equalsIgnoreCase("mm")) {
                transferToSI[transferToSI.length - 1] = (double) 1 / 1000;
            } else if (arrUnit[arrUnit.length - 1].equalsIgnoreCase("μm")) {
                transferToSI[transferToSI.length - 1] = (double) 1 / 1_000_000;
            } else if (arrUnit[arrUnit.length - 1].equalsIgnoreCase("ft")) {
                transferToSI[transferToSI.length - 1] = 0.3048;
            } else {
                transferToSI[transferToSI.length - 1] = 1;
            }

        }

        for (int i = 0; i < transferToSI.length; i++) {
            arrVal[i] = arrVal[i] * transferToSI[i];
        }

        double F = G * ((arrVal[0] * arrVal[1]) / (arrVal[2] * arrVal[2]));

        return F;

    }
}
