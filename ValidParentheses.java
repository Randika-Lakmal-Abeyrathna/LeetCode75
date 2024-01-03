import java.util.Stack;

public class ValidParentheses {


    /***
     *
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     *
     *
     * Example 1:
     *
     * Input: s = "()"
     * Output: true
     * Example 2:
     *
     * Input: s = "()[]{}"
     * Output: true
     * Example 3:
     *
     * Input: s = "(]"
     * Output: false
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 104
     * s consists of parentheses only '()[]{}'.
     *
     * ***/

    public static boolean isValid(String s){

        var characterStack = new Stack<Character>();

        for (char c : s.toCharArray()){
            if (c =='(' || c=='[' || c=='{'){
                characterStack.push(c);
            }else{
                if (characterStack.isEmpty()){
                    return false;
                }

                if ((c == ')' && characterStack.peek() == '(') || (c == ']' && characterStack.peek() == '[') || (c == '}' && characterStack.peek() == '{')){
                    characterStack.pop();
                }else {
                    return false;
                }

            }
        }

        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "())(";

        System.out.println(isValid(s));
    }

}
