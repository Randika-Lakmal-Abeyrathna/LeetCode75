package HashMapAndSet;

import java.util.HashMap;
import java.util.Map;

public class EqualRowandColumnPairs {

//    Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
//    A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
//    Example 1:
//
//    Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
//    Output: 1
//    Explanation: There is 1 equal row and column pair:
//            - (Row 2, Column 1): [2,7,7]
//    Example 2:
//    Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
//    Output: 3
//    Explanation: There are 3 equal row and column pairs:
//            - (Row 0, Column 0): [3,1,2,2]
//            - (Row 2, Column 2): [2,4,2,2]
//            - (Row 3, Column 2): [2,4,2,2]


    public static int equalPairs(int[][] grid) {

        int result =0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                stringBuilder.append(grid[i][j]);
                stringBuilder.append("+");
            }
            String s = stringBuilder.toString();
            map.put(s,map.getOrDefault(s,0)+1);
        }


        for (int i = 0; i < grid.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                stringBuilder.append(grid[j][i]);
                stringBuilder.append("+");
            }
            String s = stringBuilder.toString();
            if (map.containsKey(s)){
                result +=map.get(s);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] grid1 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};

        System.out.println(equalPairs(grid1));
    }

}
