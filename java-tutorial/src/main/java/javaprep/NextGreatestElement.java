package javaprep;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class NextGreatestElement {

    public static void nextGreaterNumber(int arr[]) {

        int next;

        for (int i=0 ; i <= arr.length; i ++) {

            next = -1;

            for (int j = i + 1; j < arr.length; j ++) {
                if (arr[i] < arr[j]){
                    next = arr[j];
                }
            }
        }
    }
}
