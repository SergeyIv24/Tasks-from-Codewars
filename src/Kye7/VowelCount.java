//https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
//7 Kye
package Kye7;

public class VowelCount {
    public static int getCount(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] arrStr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arrStr.length; i++){
            if ((vowels[0] == arrStr[i]) | (vowels[1] == arrStr[i]) | (vowels[2] == arrStr[i])
                    | (vowels[3] == arrStr[i]) | (vowels[4] == arrStr[i])){
                count = count + 1;
            }
        }
        return count;
    }
}
