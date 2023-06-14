package TwoPointers;

import java.util.Arrays;

public class MoveZeroes {

//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.
//
//
//
//    Example 1:
//
//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]
//    Example 2:
//
//    Input: nums = [0]
//    Output: [0]

    public static void moveZeroes(int[] nums) {

        int zero_count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==0){
                zero_count++;
            }else if (zero_count>0){
                int temp = nums[i];
                nums[i]=0;
                nums[i-zero_count] =temp;
            }
        }
        System.out.println(Arrays.toString(nums));

    }



    public static void main(String[] args) {
        int[] a1 = {0,1,0,3,12};
        moveZeroes(a1);
    }
}
