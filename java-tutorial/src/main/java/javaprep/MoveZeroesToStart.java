package javaprep;

public class MoveZeroesToStart {


        public void moveZeroes(int[] nums) {

            int index = nums.length-1;
            for(int i = nums.length-1; i>=0; i--){
                if(nums[i]!=0){
                    nums[index] = nums[i];
                    index--;
                }
            }
            for(int i = index; i >=0; i--){
                nums[i]=0;
            }
        }

}
