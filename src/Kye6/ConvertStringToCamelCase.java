//https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

package Kye6;

public class ConvertStringToCamelCase {
    public static String toCamelCase(String s) {
        char[] arrOfSymbols = s.toCharArray();
        String camelCaseStr = "";
        for (int i = 0; i < arrOfSymbols.length; i++) {
            if ((arrOfSymbols[i] == '-') | (arrOfSymbols[i] == '_')) {
                arrOfSymbols[i+1] = Character.toUpperCase(arrOfSymbols[i+1]);
                continue;
            }
            if ((arrOfSymbols[i] != '-') | (arrOfSymbols[i] != '_')) {
                camelCaseStr = camelCaseStr + arrOfSymbols[i];
            }
        }
        return camelCaseStr;
    }

    /* Решения с помощью StreamAPI
    public static String toCamelCase(String s) {
    *   String[] arr = str.split("-");
    *   return out = Arrays.stream(arr).map(s -> s.substring(0,1).toUpperCase() + s.substring(1)).collect(Collectors.toList()).toString();
    }
    * */
}
