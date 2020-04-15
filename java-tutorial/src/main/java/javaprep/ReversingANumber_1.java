package javaprep;

/**
 * Created by pmukkamala on 7/12/18.
 */
public class ReversingANumber_1 {

    public static int reverseOfANumber(int num) {

        int reverse = 0;

        while (num != 0) {

            reverse = reverse *10 + num % 10;
            num = num / 10;
        }
        return  reverse;
    }

    public static void main (String args[]) {

        System.out.println(reverseOfANumber(321));
    }
}
