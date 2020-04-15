package javaprep;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class StringReversalUsingRecursion {

    public static void main(String[] args) {
        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str == "") {
            return str;
        } else
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}