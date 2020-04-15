package javaprep;

/**
 * Created by pmukkamala on 5/30/18.
 */
public class SecondHighestElement {

    public static void findSecondHighestElement(int arr[]) {

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {

                secondHighest = highest;
                highest = arr[i];
            }
            if (arr[i] < highest && arr[i] > secondHighest) {
                arr[i] = secondHighest;
            }
        }
        System.out.println("Second highest is: " + secondHighest);
    }


    public static void main(String[] args) {

        int arr[] = {1, 9, 5, 55, 8, -1, 3, 55};

        findSecondHighestElement(arr);
    }
}
