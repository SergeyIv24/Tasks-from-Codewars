//kye6
//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java

public class PersistentBugger {
    public static int persistence(long n) {

        int counter = 0;
        while (n >= 10) {
            counter += 1;
            String strNum = "" + n;
            char[] arrNumCh = strNum.toCharArray();
            int[] numbers = new int[arrNumCh.length];
            for (int i = 0; i < arrNumCh.length; i++) {
                numbers[i] = Integer.parseInt(String.valueOf(arrNumCh[i]));
            }
            n = 1;
            for (int i = 0; i < numbers.length; i++) {
                n = n * numbers[i];
            }
        }

        return counter;
    }
}
