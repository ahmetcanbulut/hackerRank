// Jim and the skyscrapers - HackerRank
import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] buildingStack = new int[n];
        int[] countStack = new int[n];
        int top = 0;
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            int cur = scan.nextInt();
            while (top > 0 && cur > buildingStack[top - 1]) {
                --top;
            }
            if (top > 0 && cur == buildingStack[top - 1]) {
                ans += countStack[top - 1];
                countStack[top - 1]++;
            } else {
                buildingStack[top] = cur;
                countStack[top] = 1;
                top++;
            }
        }
        System.out.println(2 * ans);
    }
}
