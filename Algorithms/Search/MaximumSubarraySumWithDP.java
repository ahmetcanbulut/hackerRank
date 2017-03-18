// Hard
// Maximum Subarray Sum - HackerRank / Algorithms / Search
// Only works for some inputs, gets time out (not the best solution)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void applyDp(Scanner sc) {
        int elemCount = sc.nextInt();
        long modulo = sc.nextInt();
        long curMax = 0;
        long[][] dp = new long[elemCount][elemCount];

        // diagonal part of dp is given
        for(int j=0;j<elemCount;j++){
            int cur = sc.nextInt();
            dp[j][j] = cur % modulo;
            if(dp[j][j]>curMax){
                curMax = dp[j][j];
            }
        }

        // fill the upper half of dp
        for(int n=1;n<elemCount;n++){
            int y = n;
            for(int x=0; x<(elemCount-n); x++, y++){
                dp[x][y] = (dp[x][y-1] + dp[y][y]) % modulo;
                if(dp[x][y]>curMax){
                    curMax = dp[x][y];
                }
            }
        }
        System.out.println(curMax);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qCount = sc.nextInt();
        for(int i=0;i<qCount;i++){
            applyDp(sc);
        }
    }
}
