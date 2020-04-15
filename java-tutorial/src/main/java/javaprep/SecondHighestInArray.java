package javaprep;

public class SecondHighestInArray {

    public static void main (String [] args) {

        int x[] = {4, 6, 2, -10, 18, 33};

        int highest = Integer.MIN_VALUE;//0
        int secondHigest = Integer.MIN_VALUE;//0

        for (int i = 0; i < x.length; i++) {


            if (x[i] > highest) {

                secondHigest = highest;
                highest = x[i];

            }
            if (x[i] < highest && x[i] > secondHigest) {

                secondHigest = x[i];

            }

        }
        System.out.println("Second Highest " + secondHigest);

    }



       /* int max1;
        int max2;

        if (x[0] > x[1]) {
            max1 = x[0];
            max2 = x[1];
        } else
        {
            max1 = x[0];
            max2 = x[1];
        }

        for (int i = 2; i <x.length;i++) {

            if (x[i] >max1) {

                x[i] = max1;
            }
        }
    }*/


}
