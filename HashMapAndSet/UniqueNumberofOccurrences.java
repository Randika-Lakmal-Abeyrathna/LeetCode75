package HashMapAndSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {

//
//    Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//
//
//            Example 1:
//
//    Input: arr = [1,2,2,1,1,3]
//    Output: true
//    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//            Example 2:
//
//    Input: arr = [1,2]
//    Output: false
//    Example 3:
//
//    Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//    Output: true

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer i : arr){
            if (map.containsKey(i)){
                Integer value = map.get(i);
                map.put(i,value+1);
            }else {
                map.put(i,1);
            }
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return map.size() == set.size();
    }

    public static void main(String[] args) {

        int[] a1 ={1,2,2,1,1,3};
        int[] a2 ={1,2};
        int[] a3 ={-3,0,1,-3,1,1,1,-3,10,0};

        System.out.println(uniqueOccurrences(a1));
        System.out.println(uniqueOccurrences(a2));
        System.out.println(uniqueOccurrences(a3));


    }
}
