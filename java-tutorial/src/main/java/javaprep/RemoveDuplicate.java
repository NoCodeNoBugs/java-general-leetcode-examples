package javaprep;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {

        int prev = 0;
        for(int curr =0; curr < nums.length-1; curr = curr+2){

            if (nums[curr] == nums[curr + 1]) {
                nums[prev] = nums[curr];

                prev++;
            }
        }
        return prev+1;

    }

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,2,3,4};
        System.out.println(RemoveDuplicate.removeDuplicates(nums));
    }
}
