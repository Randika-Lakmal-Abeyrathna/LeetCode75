public class FindtheIndexoftheFirstOccurrenceinaString {


    /**
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     *
     *
     * Example 1:
     *
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     * Example 2:
     *
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.
     *
     *
     * Constraints:
     *
     * 1 <= haystack.length, needle.length <= 104
     * haystack and needle consist of only lowercase English characters.
     *
     *
     * */

    public static int strStr(String haystack,String needle){

        int index =0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(index)){
                index++;
            }else {
                i= i-index;
                index=0;
            }

            if (index == needle.length()){
                return i-needle.length()+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        String s1="sadbutsad";
        String s2="sad";

        System.out.println(strStr(s1,s2));

        String s3="leetcode";
        String s4="leeto";

        System.out.println(strStr(s3,s4));


    }

}
