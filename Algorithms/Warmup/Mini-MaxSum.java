// Mini-Max Sum
// Mini-MaxSum HackerRank/Algorithms/Warmup
// Easy


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long max = 0;
        long min = Integer.MAX_VALUE;
        
        for(int arr_i=0; arr_i < 5; arr_i++){
            long current = in.nextLong();
            if(current>max){
                max = current;
            }
            
            if(current<min){
                min = current;
            }
            
            arr[arr_i] = current;
        }
        
        long minSum = 0;
        long maxSum = 0;
        
        boolean omitted = false;
        
        for(int i=0; i<5; i++){
            long cur = arr[i];
            if(cur != max || omitted){
                minSum += cur;
            } else{
                omitted = true;
            }
        }
        
        omitted = false;
        for(int i=0; i<5; i++){
            long cur = arr[i];
            if(cur != min || omitted){
                maxSum += cur;
            } else{
                omitted = true;
            }
        }
        
        System.out.println(minSum + " " + maxSum);
    }
}

