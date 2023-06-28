package Stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

//    We are given an array asteroids of integers representing asteroids in a row.
//
//    For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
//
//    Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
//
//
//
//    Example 1:
//
//    Input: asteroids = [5,10,-5]
//    Output: [5,10]
//    Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
//    Example 2:
//
//    Input: asteroids = [8,-8]
//    Output: []
//    Explanation: The 8 and -8 collide exploding each other.
//    Example 3:
//
//    Input: asteroids = [10,2,-5]
//    Output: [10]
//    Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.



    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> res = new Stack<>();


        for (int i : asteroids){

            boolean flag = true;

            while(!res.isEmpty() && (res.peek() > 0 && i <0)){

                if (Math.abs(res.peek()) < Math.abs(i)){
                    res.pop();
                    continue;
                }else if (Math.abs(res.peek()) == Math.abs(i)){
                    res.pop();
                }

                flag=false;
                break;
            }

            if (flag){
                res.push(i);
            }

        }

        int[] result = new int[res.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = res.peek();
            res.pop();
        }


        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {5,10,-5};
        int[] a2 = {8,-8};
        int[] a3 = {10,2,-5};

        System.out.println(Arrays.toString(asteroidCollision(a1)));
        System.out.println(Arrays.toString(asteroidCollision(a2)));
        System.out.println(Arrays.toString(asteroidCollision(a3)));
    }
}
