package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberofRecentCalls {


    Deque<Integer> deque;


    public NumberofRecentCalls() {
            deque =new ArrayDeque<>();
    }

    public int ping(int t) {
        deque.addLast(t);
        while (deque.peek() < t - 3000){
            deque.pollFirst();
        }

        return deque.size();
    }

    public static void main(String[] args) {

        NumberofRecentCalls recentCalls = new NumberofRecentCalls();

        System.out.println(recentCalls.ping(0));
        System.out.println(recentCalls.ping(1));
        System.out.println(recentCalls.ping(100));
        System.out.println(recentCalls.ping(3001));
        System.out.println(recentCalls.ping(3002));



    }
}
