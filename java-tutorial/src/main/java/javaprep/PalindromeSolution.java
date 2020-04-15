package javaprep;

/**
 * Created by pmukkamala on 7/22/18.
 */
public class PalindromeSolution {

    public static void main(String[] args) {

        String string1 = "madam";

        System.out.println(isPalindrome(string1));
        //  Scanner sc=new Scanner(System.in);
        //  String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
    }

    public static boolean isPalindrome(String string1) {

        for (int i = 0; i < string1.length() - 1; i++) {
            for (int j = string1.length() - 1; j >= 0; j--) {

                if (string1.charAt(i) != string1.charAt(j))
                    System.out.println("Char string i: " + string1.charAt(i) + " " + "Char string j " + string1.charAt(j));
                return false;
            }
        }
        return true;
    }

}
