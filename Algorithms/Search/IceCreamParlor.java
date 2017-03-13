// Easy
// Ice Cream Parlor - HackerRank / Algorithms / Search

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tripCount = sc.nextInt();
        for(int i=0;i<tripCount;i++){
            int totalMoney = sc.nextInt();
            int flavorCount = sc.nextInt();
            Map<Integer,Integer> costMap = new HashMap<Integer,Integer>();
            for(int j=0;j<flavorCount;j++){
                int cur = sc.nextInt();
                if(costMap.containsKey(totalMoney-cur)){
                    int firstIdx = costMap.get(totalMoney-cur)+1;
                    int secondIdx = j +1;
                    System.out.println(firstIdx +" "+secondIdx);
                }
                costMap.put(cur,j);
            }
        }
    }
}
