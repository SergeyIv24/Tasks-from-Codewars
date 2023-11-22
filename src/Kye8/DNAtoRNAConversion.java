//https://www.codewars.com/kata/5556282156230d0e5e000089/train/java
//8 kye
package Kye8;

public class DNAtoRNAConversion {
    public String dnaToRna(String dna) {
        String rna = "";
        for (int i = 0; i < dna.length(); i++){
            if (dna.charAt(i) == 'T'){
                rna = rna + 'U';
            } else {
                rna = rna + dna.charAt(i);
            }
        }
        return rna;
    }
}
