// Easy
// Hackerland Radio Transmitters - HackerRank / Algorithms / Search

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        HashSet<Integer> houseSet = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            int cur = sc.nextInt();
            if(cur>max){
                max = cur;
            }
            if(cur<min){
                min = cur;
            }
            houseSet.add(cur);
        }
        
        int current = min;
        int total = 0;
        HashSet<Integer> transmitterSet = new HashSet<Integer>();
        while(current<=max){
            int target = current + k;
            while(!houseSet.contains(target)){
                target--;
            }
            transmitterSet.add(target);  // keeping all transmitters. (bonus)
            total++;
            if(target+k+1>max){
                break;
            }
            current = target + k+ 1;
            while(!houseSet.contains(current)){
                current++;
            }
        }
        
        System.out.println(total);
        
    }
}
