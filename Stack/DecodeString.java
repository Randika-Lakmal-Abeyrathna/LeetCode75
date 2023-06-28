package Stack;

import java.util.Stack;

public class DecodeString {

//    Given an encoded string, return its decoded string.
//
//    The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//
//    You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
//
//    The test cases are generated so that the length of the output will never exceed 105.
//
//
//
//    Example 1:
//
//    Input: s = "3[a]2[bc]"
//    Output: "aaabcbc"
//    Example 2:
//
//    Input: s = "3[a2[c]]"
//    Output: "accaccacc"
//    Example 3:
//
//    Input: s = "2[abc]3[cd]ef"
//    Output: "abcabccdcdcdef"


    public static String decodeString(String s) {

        String result="";

        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();

        int index =0;

        while(index < s.length()){

            if (Character.isDigit(s.charAt(index))){
                int count = 0;

                while(Character.isDigit(s.charAt(index))){
                    count = 10* count +(s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);

            }else if (s.charAt(index) == '['){
                resultStack.push(result);
                result="";
                index++;
            }else if (s.charAt(index) == ']'){
                StringBuilder sb = new StringBuilder(resultStack.pop());
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++) {
                    sb.append(result);
                }
                result = sb.toString();
                index++;
            }else {
                result +=s.charAt(index++);
            }

        }

        return result;
    }

    public static void main(String[] args) {

        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";


        System.out.println(decodeString(s1));
        System.out.println(decodeString(s2));
        System.out.println(decodeString(s3));


    }
}
