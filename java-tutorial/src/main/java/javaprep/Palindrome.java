package javaprep;

/**
 * Created by pmukkamala on 7/18/18.
 */
public class Palindrome {

    public static boolean isPalindrome(String str) {

        int i = str.length() - 1;
        int j = 0;
        while (i > j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {

        String str = "madam";
        System.out.println(isPalindrome(str));
        }
}
