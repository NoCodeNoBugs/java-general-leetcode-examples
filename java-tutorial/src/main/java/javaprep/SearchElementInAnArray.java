package javaprep;

/**
 * Created by pmukkamala on 5/30/18.
 */
public class SearchElementInAnArray {

    public static int[] theArray = { 4, 2, 6, 8, 1 };


    public static boolean isElementFound(int value){

        boolean isValuePresent = false;

        for (int i = 0; i<theArray.length; i ++ ){

            if (theArray[i] == value){
                isValuePresent = true;
            }
        }
             return isValuePresent;

    }

    public static void main(String[] args){

        System.out.println(isElementFound(14));
    }
}
