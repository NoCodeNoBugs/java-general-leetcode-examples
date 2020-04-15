package javaprep;

/**
 * Created by pmukkamala on 7/12/18.
 */
public class FactorialOfANumber_1 {

    public static int fact(int num) {

        if (num==0||num ==1 ){
            return 1;
        }else {
            return (num * fact(num-1));
        }
    }
    public static void main (String args[]) {

        System.out.println(fact(1));
    }
}
