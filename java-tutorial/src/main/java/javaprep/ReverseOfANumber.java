package javaprep;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class ReverseOfANumber {

    public static int numberReverse(int num) {

        int reverse = 0;
        while (num != 0) {

            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(numberReverse(52));
    }
}


