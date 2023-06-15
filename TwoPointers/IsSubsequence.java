package TwoPointers;

public class IsSubsequence {

//    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//
//
//    Example 1:
//
//    Input: s = "abc", t = "ahbgdc"
//    Output: true
//    Example 2:
//
//    Input: s = "axc", t = "ahbgdc"
//    Output: false

    public static boolean isSubsequence(String s, String t) {

        int point =0;

        for (int i = 0; i < t.length(); i++) {
            if (point<s.length() && (s.charAt(point) == t.charAt(i))){
                    point++;

            }

        }

        if (point == s.length()){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        String s1 ="abc";
        String s2 ="ahbgdc";

        System.out.println(isSubsequence(s1,s2));
    }


}
