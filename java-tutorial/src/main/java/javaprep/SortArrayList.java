package javaprep;

/**
 * Created by pmukkamala on 5/30/18.
 */
public class SortArrayList {

    public static int[] theArray;

    public static int[] sortArray(int[] arr){

        for (int i = 0; i < arr.length-1; i ++) {

            for (int j = i+1; j < arr.length-1; j++){

                if(arr[i] < arr[j]){
                    swapValues(j, j+1);
                }
            }
        }
        return arr;
    }

    private static void swapValues(int indexOne, int indexTwo) {

        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;


    }

    public static void main(String[] args){

        int[] Array = { 4, 2, 6, 8, 1 };

        System.out.println("Sorted array is:" + sortArray(Array));;
    }
}

