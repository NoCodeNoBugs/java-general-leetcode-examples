package javaprep;

public class ReverseEveryWord {

    public static String reverseEveryWordInString(String str) {

        String [] words = str.split(" ");
        String reverseString = "";

        for(int i = 0; i < words.length; i ++) {

            String word = words[i];
            String reverseWord = "";
            for (int j = 0; j < word.length(); j++){

                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;
    }
}
