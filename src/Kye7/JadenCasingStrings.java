//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

package Kye7;

public class JadenCasingStrings {
    public String  toJadenCase(String phrase) {

        if (phrase == null) {
            return phrase;
        }

        if (phrase.length() > 0) {
            String[] arrPhrase = phrase.split("");
            String newPhrase = "";
            for (int i = 0; i < arrPhrase.length; i++) {
                arrPhrase[0] = arrPhrase[0].toUpperCase();

                if (arrPhrase[i].equals(" ")) {
                    arrPhrase[i + 1] = arrPhrase[i + 1].toUpperCase();

                }
            }

            for (int i = 0; i < arrPhrase.length; i++){
                newPhrase = newPhrase + arrPhrase[i];
            }

            return newPhrase;
        } else {
            return null;
        }
    }
}
