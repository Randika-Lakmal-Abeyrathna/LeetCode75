package SlidingWindow;

public class MaxConsecutiveOnesIII {


//    Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
//
//
//
//            Example 1:
//
//    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//    Output: 6
//    Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
//            Example 2:
//
//    Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
//    Output: 10
//    Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
//    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


    public static int longestOnes(int[] nums, int k) {

        int zeroCount = 0;
        int start =0;
        int results =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                zeroCount++;
            }

            while(zeroCount >k){
                if (nums[start] == 0){
                    zeroCount--;
                }
                start++;
            }

            results = Math.max(results,i-start+1);

        }

        return results;
    }


    public static void main(String[] args) {

        int[] a1 = {1,1,1,0,0,0,1,1,1,1,0};
        int k1 =2;

        System.out.println(longestOnes(a1,k1));

    }
}
