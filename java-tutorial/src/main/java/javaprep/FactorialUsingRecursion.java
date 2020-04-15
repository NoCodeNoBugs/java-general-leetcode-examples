package javaprep;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class FactorialUsingRecursion {

    public static int fact(int n) {

        if (n==0||n ==1 ){
            return 1;
        }else
            return n * (n-1) * (n-2);
    }

    public static void main (String[] args) {

        System.out.println(fact(4));
    }
}
