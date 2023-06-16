package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNumberofKSumPairs {

//    You are given an integer array nums and an integer k.
//
//    In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
//
//    Return the maximum number of operations you can perform on the array.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,3,4], k = 5
//    Output: 2
//    Explanation: Starting with nums = [1,2,3,4]:
//            - Remove numbers 1 and 4, then nums = [2,3]
//            - Remove numbers 2 and 3, then nums = []
//    There are no more pairs that sum up to 5, hence a total of 2 operations.
//            Example 2:
//
//    Input: nums = [3,1,3,4,3], k = 6
//    Output: 1
//    Explanation: Starting with nums = [3,1,3,4,3]:
//            - Remove the first two 3's, then nums = [1,4,3]
//    There are no more pairs that sum up to 6, hence a total of 1 operation.
//
//
//            Constraints:
//
//            1 <= nums.length <= 105
//            1 <= nums[i] <= 109
//            1 <= k <= 109

    public static int maxOperations(int[] nums, int k) {

        int opcount =0;
        int start =0;
        int end = nums.length-1;
        Arrays.sort(nums);

        while (start<end){
            if (nums[start]+nums[end] > k){
                end--;
            }else if (nums[start]+nums[end]< k){
                start++;
            }else{
                opcount++;
                start++;
                end--;
            }
        }

        return opcount;
    }

    public static void main(String[] args) {

        int[] a1 ={1,2,3,4};
        int k1 =5;

        int[] a2 ={3,1,3,4,3};
        int k2 =6;

        int[] a3 ={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k3 =2;

        System.out.println(maxOperations(a1,k1));
        System.out.println(maxOperations(a2,k2));
        System.out.println(maxOperations(a3,k3));

    }




}
