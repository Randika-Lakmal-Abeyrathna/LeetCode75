import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenationOfArray {


    /***
     *
     *Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     *
     * Specifically, ans is the concatenation of two nums arrays.
     *
     * Return the array ans.
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     * Example 2:
     *
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     *
     * **/
    public static int[] getConcatenation(int[] nums) {
        int [] answer = new int[nums.length *2];

        for (int i = 0; i < nums.length; i++) {
            answer[nums.length+i]=answer[i]=nums[i];
        }

        return answer;
    }

    public static int[] getConcatenation2(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j < nums.length; j++) {
                answer.add(nums[j]);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int [] a1 ={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(a1)));
        System.out.println(Arrays.toString(getConcatenation2(a1)));
    }
}
