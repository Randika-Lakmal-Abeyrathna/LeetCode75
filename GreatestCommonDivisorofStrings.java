public class GreatestCommonDivisorofStrings {


    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1+str2) .equals(str2+str1)){
            return "";
        }

        int gcdValue = gcd(str1.length(),str2.length());

        return str2.substring(0,gcdValue);

    }

    public static int gcd(int l1,int l2){
        if (l2 == 0) return l1;
        else return gcd(l2,l1%l2);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcdOfStrings("LEET","CODE"));
    }

}
