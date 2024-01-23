//Kye6
//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
package Kye6;

public class StopGninnipSMySdroW {
    public String spinWords(String sentence) {
        String[] words;
        words = sentence.split(" ");
        StringBuilder[] wordsBuild = new StringBuilder[words.length];

        for (int i = 0; i < words.length; i++) {
            wordsBuild[i] = new StringBuilder(words[i]);
        }

        for (int i = 0; i < wordsBuild.length; i++) {
            if (wordsBuild[i].length() >= 5) {
                wordsBuild[i].reverse();
            }
        }

        String outputSentence = "";

        for (int i = 0; i < wordsBuild.length; i++) {
            outputSentence = outputSentence + wordsBuild[i] + " ";
        }
        return outputSentence.trim();
    }
}
