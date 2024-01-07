public class NumberOfGoodPairs {


    /***
     * Given an array of integers nums, return the number of good pairs.
     *
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     * Example 2:
     *
     * Input: nums = [1,1,1,1]
     * Output: 6
     * Explanation: Each pair in the array are good.
     * Example 3:
     *
     * Input: nums = [1,2,3]
     * Output: 0
     *
     * ***/
    public static int numIdenticalPairs(int[] nums) {
        int count =0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int [] a1 = {1,2,3,1,1,3};
        int [] a2 = {1,1,1,1};
        int [] a3 = {1,2,3};

        System.out.println(numIdenticalPairs(a1));
        System.out.println(numIdenticalPairs(a2));
        System.out.println(numIdenticalPairs(a3));

    }

}