package javaprep;

/**
 * Created by pmukkamala on 7/18/18.
 */
public class URLifyString {

    public static String URLifyString(String str) {

        String newString = (new String(str).replaceAll(" ", "%20"));

         return newString;

}

    public static void main(String[] args) {

        String input = "I am fine" ;
        System.out.println(URLifyString(input));
    }
}

