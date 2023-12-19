import java.util.Arrays;

public class LongestCommonPrefix {

    public static String solution(String [] data){
        Arrays.sort(data);
        StringBuilder stringBuilder = new StringBuilder();

        String start = data[0];
        String end = data[data.length-1];

        for (int i = 0; i <Math.min(start.length(),end.length()) ; i++) {
            if (start.charAt(i) != end.charAt(i)){
                return stringBuilder.toString();
            }
            stringBuilder.append(start.charAt(i));
        }


        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] s1 = {"flower","flow","flight"};
        String[] s2 = {"dog","racecar","car"};
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
