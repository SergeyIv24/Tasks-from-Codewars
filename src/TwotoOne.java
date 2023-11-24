//https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
// 7 kye

public class TwotoOne {
    public static String longest (String s1, String s2) {
        String generalStr = s1 + s2;
        String[] arrStr = generalStr.split("");

        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if ((i != j) & (arrStr[i].equalsIgnoreCase(arrStr[j]))) {
                    arrStr[j] = "0";
                }
            }
        }
        String outPutStr = "";
        for (int i = 0; i <arrStr.length; i++) {
            if (arrStr[i].equalsIgnoreCase("0")) {
                continue;
            }
            outPutStr = outPutStr + arrStr[i];
        }

        String[] arrOutPut = outPutStr.split("");
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alfabetArr = alfabet.split("");
        String[] newArr = new String[alfabetArr.length];

        for (int i = 0; i < arrOutPut.length; i++) {
            for (int j = 0; j < alfabetArr.length; j++){
                if (arrOutPut[i].equalsIgnoreCase(alfabetArr[j]) ) {
                    newArr[j] = arrOutPut[i];
                }
            }
        }

        String output = "";
        for (int i = 0; i < newArr.length; i++){
            if (newArr[i] != null) {
                output = output + newArr[i];
            }
        }
        return output;
    }
}
