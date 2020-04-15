package javaprep;

import javax.naming.ldap.SortResponseControl;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedSquareArray {

    public int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i ++) {

            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;

    }

}


