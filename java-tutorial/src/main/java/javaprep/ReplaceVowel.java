package javaprep;

/**
 * Created by pmukkamala on 5/30/18.
 */
public class ReplaceVowel {

    public static void replaceVowel(String s) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        //s = s.toLowerCase();

        for (char vow : vowels) {


                s = s.replace(vow, 'x');

            }

        System.out.println(s);
    }

    public static void main(String[] args) {

         String inputString = "the cat";
         replaceVowel(inputString);

    }
}
