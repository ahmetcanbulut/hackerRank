// Birthday Cake Candles
// HackerRank - Algorithms/WarmpUp
// Easy

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = -1;
        for(int height_i=0; height_i < n; height_i++){
            int current = in.nextInt();
            height[height_i] = current;
            if(current>max){
                max = current;
            }
            if(!map.containsKey(current)){
                map.put(current,1);
            }else {
                map.put(current, map.get(current)+1);
            }
        }
        
        System.out.println(map.get(max));
    }
}

