public class IncreasingTripletSubsequence {
//
//    Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
//
//
//
//    Example 1:
//
//    Input: nums = [1,2,3,4,5]
//    Output: true
//    Explanation: Any triplet where i < j < k is valid.
//    Example 2:
//
//    Input: nums = [5,4,3,2,1]
//    Output: false
//    Explanation: No triplet exists.
//            Example 3:
//
//    Input: nums = [2,1,5,0,4,6]
//    Output: true
//    Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

    public static boolean increasingTriplet(int[] nums) {

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if (nums[i]< nums[j] && nums[j] < nums[k]){
//                        return true;
//                    }
//                }
//            }
//        }
// start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
        int first = Integer.MAX_VALUE;
        int secound = Integer.MAX_VALUE;

        for(int n : nums){
            if (n <= first){
                first=n;
            }else if (n <= secound){
                secound =n;
            }else {
                return true;
            }
        }


        return false;
    }



    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {5,4,3,2,1};
        int[] a3 = {2,1,5,0,4,6};
        int[] a4 = {20,100,10,12,5,13};

        System.out.println(increasingTriplet(a1));
        System.out.println(increasingTriplet(a2));
        System.out.println(increasingTriplet(a3));
        System.out.println(increasingTriplet(a4));
    }

}
