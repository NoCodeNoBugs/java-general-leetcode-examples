package javaprep;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersList {

    public static List<Integer> oddNumbers(int l, int r) {

        List<Integer> odds = new ArrayList<>();

        while (l <= r) {

            if (l % 2 != 0) {
                odds.add(l);

            } l++;

        }
        return odds;
    }
        public static void main(String[] args) {


            System.out.println(oddNumbers(3, 11));
        }
    }


