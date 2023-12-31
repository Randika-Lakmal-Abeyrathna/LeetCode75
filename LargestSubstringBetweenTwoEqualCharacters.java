public class LargestSubstringBetweenTwoEqualCharacters {

//    Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
//
//    A substring is a contiguous sequence of characters within a string.
//
//
//
//            Example 1:
//
//    Input: s = "aa"
//    Output: 0
//    Explanation: The optimal substring here is an empty substring between the two 'a's.
//            Example 2:
//
//    Input: s = "abca"
//    Output: 2
//    Explanation: The optimal substring here is "bc".
//    Example 3:
//
//    Input: s = "cbzxy"
//    Output: -1
//    Explanation: There are no characters that appear twice in s.
//
//
//            Constraints:
//
//            1 <= s.length <= 300
//    s contains only lowercase English letters.


    public static int solution1(String s){

        int distance =-1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    distance = Math.max(distance,j-i-1);
                }
            }
        }

        return distance;
    }

    public static int solution2(String s){
        for (int i = s.length()-1; i >0 ; i--) {
            for (int j = 0; j+i <s.length() ; j++) {
                if (s.charAt(j) == s.charAt(j+i)){
                    return i-1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s1 = "aa";
        String s2 = "abca";
        String s3 = "cbzxy";

        System.out.println(solution1(s1));
        System.out.println(solution1(s2));
        System.out.println(solution1(s3));

        System.out.println(solution2(s1));
        System.out.println(solution2(s2));
        System.out.println(solution2(s3));


    }


}
