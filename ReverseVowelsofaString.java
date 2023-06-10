import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReverseVowelsofaString {

//    Given a string s, reverse only all the vowels in the string and return it.
//
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//    Example 1:
//
//    Input: s = "hello"
//    Output: "holle"

    public static String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";

        int start =0;
        int end =s.length()-1;

        char[] word = s.toCharArray();

        while (start<end){

            while (start<end && !vowels.contains(word[start]+"")){
                start++;
            }

            while(start<end && !vowels.contains(word[end]+"")){
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end]=temp;

            start++;
            end--;


        }
        return new String(word);
    }



    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }


}
