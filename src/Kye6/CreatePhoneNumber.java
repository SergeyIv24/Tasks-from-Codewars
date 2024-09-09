//https://www.codewars.com/kata/525f50e3b73515a6db000b83


package Kye6;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(";

        for (int i = 0; i < numbers.length; i++){
            if (i == 2) {
                phoneNumber = phoneNumber + numbers[i] + ")" + " ";
                continue;
            }
            if (i == 5) {
                phoneNumber = phoneNumber + numbers[i] + "-";
                continue;
            }
            phoneNumber = phoneNumber + numbers[i];
        }

        return phoneNumber;
    }
}
