package javaprep;

/**
 * Created by pmukkamala on 5/30/18.
 */
public class SwapVowelInString {

    public static String reverseVowel(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray(); //s = {a, e, i, o, u}
        String vowels = "aeiouAEIOU";
        while (i < j) {
            while (vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            while (vowels.indexOf(arr[j]) == -1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public static void swap(char[] arr, int i, int j){

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        String input = "the dog";
        System.out.println(reverseVowel(input));
    }
}
