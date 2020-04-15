package javaprep;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class NextGreaterElementInArray {

    public static void nextGreaterElement(int arr[]) {

        int next ;

        for (int i = 0; i < arr.length; i++) {

            next = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println("Next greater element of " + arr[i] + " is " + next );
        }
    }


    public static void main(String[] args) {

        int arr[] = { 4, 2, 6, 8, 1 };
        nextGreaterElement(arr);
    }
}
