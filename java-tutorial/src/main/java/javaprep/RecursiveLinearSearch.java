package javaprep;

public class RecursiveLinearSearch {

    public static int recursiveLinearSearch(int[] a, int i, int x) {
        int n = a.length-1;
        if (i > n) {
            return -1;
        } else if (a[i] == x) {
            return i;
        } else
            return  recursiveLinearSearch(a, i + 1, x);
    }

}
