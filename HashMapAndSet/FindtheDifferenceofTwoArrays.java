package HashMapAndSet;

import java.util.*;

public class FindtheDifferenceofTwoArrays {

//    Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
//
//    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
//            answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
//    Note that the integers in the lists may be returned in any order.
//            Example 1:
//
//    Input: nums1 = [1,2,3], nums2 = [2,4,6]
//    Output: [[1,3],[4,6]]
//    Explanation:
//    For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
//    For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
//    Example 2:
//
//    Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
//    Output: [[3],[]]
//    Explanation:
//    For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
//    Every integer in nums2 is present in nums1. Therefore, answer[1] = [].



    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {


        Set<Integer> l1 = new HashSet<>();
        for(Integer i: nums1){
            l1.add(i);
        }

        Set<Integer> l2= new HashSet<>();
        for(Integer i: nums2){
            l2.add(i);
        }

        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        List<List<Integer>> resulst = new ArrayList<>();

        for (Integer i: l1){
            if (!l2.contains(i)){
                r1.add(i);
            }
        }

        for (Integer i: l2){
            if (!l1.contains(i)){
                r2.add(i);
            }
        }

        resulst.add(r1);
        resulst.add(r2);

        return resulst;
    }


    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 ={2,4,6};

        List<List<Integer>> difference = findDifference(a1, a2);
        System.out.println(difference.toString());

        int[] a3 = {1,2,3,3};
        int[] a4 ={1,1,2,2};

        List<List<Integer>> difference1 = findDifference(a3, a4);
        System.out.println(difference1.toString());


    }


}
