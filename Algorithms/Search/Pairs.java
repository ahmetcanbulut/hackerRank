// Pairs - HackerRank/Algorithms/Search
// Medium

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        int k = sc.nextInt();
        
        HashSet<Integer> set = new HashSet<>();
        int pairCount = 0;
        for(int i=0;i<numCount;i++){
            int cur = sc.nextInt();
            int small = cur - k;
            int big =  cur + k;
            if(set.contains(small)){
                pairCount++;
            }
            
            if(set.contains(big)){
                pairCount++;
            }
            
            set.add(cur);
        }
        
        System.out.println(pairCount);
    }
}
