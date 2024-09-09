//https://www.codewars.com/kata/551f37452ff852b7bd000139


package Kye7;
public class BinaryAddition {

    public static String binaryAddition(int a, int b){
        int sum = a + b;
        String binaryNum = "";
        int toBinaryNum = sum;
        String surplus = "";
        int surplusNum = sum;

        while (toBinaryNum != 1) {
            surplusNum = toBinaryNum % 2;
            toBinaryNum = toBinaryNum / 2;
            surplus = surplus + surplusNum;

        }

        StringBuilder reverseSurplus = new StringBuilder(surplus);
        reverseSurplus.reverse();
        String reversSurplusStr = reverseSurplus.toString();

        binaryNum = "" + toBinaryNum;
        binaryNum = binaryNum + reversSurplusStr;
        return binaryNum;
    }
}
