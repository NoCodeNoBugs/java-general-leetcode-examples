package javaprep;

/**
 * Created by pmukkamala on 5/30/18.
 */
public class ReverseAnArray {

    public static void reverseArray(int[] array) {


        for(int i=0; i<array.length/2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;

            System.out.println(array[i]);
        }


        /*int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp;
            temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
        return arr;*/

    }

/*
        if(start >=end) {

            return arr;
        }
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;

        int[] reverseArray = reverseArray(arr, start+1, end-1);
        return reverseArray;
    }*/

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 5, 6, 7};
        reverseArray(inputArray);
    }
}
