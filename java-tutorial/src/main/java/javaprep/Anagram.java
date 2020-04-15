package javaprep;

import java.util.Arrays;

/**
 * Created by pmukkamala on 7/19/18.
 */
public class Anagram {

    public static boolean isAnagram(String s1, String s2) {

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        if (s1.length()!= s2.length()) {
            return false;
        }
        for (int i =0; i<= s1.length(); i ++){
            if(array1[i]!=array2[i])
                return false;
        }
            return true;
    }

    public static void main(String[] args) {

        String s1 = "pots";
        String s2 = "tops";

        System.out.println(isAnagram(s1, s2));
    }
}
