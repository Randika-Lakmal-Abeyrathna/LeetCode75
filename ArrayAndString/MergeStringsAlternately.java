package ArrayAndString;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        int max = Math.max(charArray1.length, charArray2.length);
        int count =0;

        while(count < max){

            if (charArray1.length > count){
                sb.append(charArray1[count]);
            }

            if (charArray2.length > count){
                sb.append(charArray2[count]);
            }

            count ++;
        }


        return sb.toString();
    }

//    Optimize solution
    public static String mergeAlternatelyOptimize(String word1, String word2){
        int n =word1.length(),m=word2.length(),i=0,j=0;

        StringBuilder stringBuilder = new StringBuilder();

        while (i<n || j<m){
            if (i < word1.length())
                stringBuilder.append(word1.charAt(i++));
            if (j<word2.length())
                stringBuilder.append(word2.charAt(j++));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
        System.out.println(mergeAlternately("abcd","pq"));
    }

}
