import java.util.Arrays;

public class ProductofArrayExceptSelf {


//    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//    You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]
//    Example 2:
//
//    Input: nums = [-1,1,0,-3,3]
//    Output: [0,0,9,0,0]


    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] results = new int[len];
        results[0]=1;
        for (int i = 1; i < len; i++) {
            results[i] = results[i-1]*nums[i-1];
        }

        int right = 1;

        for (int i = len-1; i >= 0; i--) {
            results[i] *=right;
            right *=nums[i];
        }
        return results;
    }



    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{-1,1,0,-3,3};

        System.out.println(Arrays.toString(productExceptSelf(nums1)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }

}
