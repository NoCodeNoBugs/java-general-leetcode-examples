package javaprep;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class FindANumberIsFibonacci extends FibonacciNumberUsingRecursion{


/*
    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else
            return fib(n - 1) + fib(n - 2);
    }*/

    public static boolean isFibonacci(int n) {

      return  (n >= fib(n)) ;

    }

    public static void main(String[] args) {

        System.out.println(isFibonacci(13));
    }
}