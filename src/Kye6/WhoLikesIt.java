//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java


package Kye6;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        int lenOfNames = names.length;
        String output = "";
        switch (lenOfNames) {
            case 0:
                return output = "no one likes this";
            case 1:
                return output = names[0] + " like this";
            case 2:
                return output = names[0] + " and " + names[1] + " like this";
            case 3:
                return output = names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return output = names[0] + ", " + names[1] + " and " + (lenOfNames - 2) + " others like this";
        }
    }
}




