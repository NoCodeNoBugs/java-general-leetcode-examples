package javaprep;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicates(int [] nums) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int num : nums) {

            if (!set.add(num)) {
                return true;
            }

        }
        return false;
    }
}
