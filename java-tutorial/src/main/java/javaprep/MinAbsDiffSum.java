package javaprep;

import java.util.Collections;
import java.util.List;

public class MinAbsDiffSum {

    static int sumOfMinAbsDifferences(List<Integer> arr){

        Collections.sort(arr);
        int n = arr.size();
        int minSum = 0;
        minSum = minSum + Math.abs(arr.get(0) - arr.get(1));
        minSum = minSum + Math.abs(arr.get(n - 1) - arr.get(n - 2));


        for (int i = 1; i < n - 1; i++)
            minSum += Math.min(Math.abs(arr.get(i) - arr.get(i - 1)),
                            Math.abs(arr.get(i) - arr.get(i + 1)));

        return minSum;
    }

}
