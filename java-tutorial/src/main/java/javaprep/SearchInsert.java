package javaprep;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int i =0;
        while (i < nums.length){
            if (nums[i] == target) {
                return i;
            }
            else {
                if(nums[i] > target){
                    return i;
                } else {
                    if(nums [i] < target)
                        return i+1;
                }


            }
        }
        return nums.length;
    }
}


