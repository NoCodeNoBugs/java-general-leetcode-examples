package javaprep;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class FindSecondHighestElementInArray {

    public static void main(String[] args) {

        // unsorted array
        int num[] = {1, 9, 5, 55, 8, -1, 3, 55, 100, 56, 85};


        int highest = Integer.MIN_VALUE; // 0
        int secondHighest = Integer.MIN_VALUE; //0

        //traverse the array

        for (int i = 0; i < num.length; i ++) {

            if (num[i] > highest){ //1>0

                //assign highest to second highest and assign num[i] to highest
                secondHighest = highest;

                //new highest
                highest = num[i];

            }
           if (num[i] < highest && num[i] > secondHighest) { //
                secondHighest = num[i];
            }

        }
        System.out.println("Second highest is: " + secondHighest);
    }
}