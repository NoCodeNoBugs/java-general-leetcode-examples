package javaprep;

/**
 * Created by pmukkamala on 7/17/18.
 */
public class StringHasUniquesChars {

    public boolean isUniqueChar(String str) {

        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)

                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }

        return true;

    }

    public static void main(String args[])
    {

        StringHasUniquesChars obj = new StringHasUniquesChars();
        String input = "GeeksforGeeks";

        if (obj.isUniqueChar(input))
            System.out.println("The String " +
                                       input + " has all unique characters");
        else
            System.out.println("The String " +
                                       input + " has duplicate characters");
    }
}

