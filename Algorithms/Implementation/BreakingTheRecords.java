// Easy
// Breaking THe Records - HackerRank / Algorithms / Implementation  

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        // your code goes here
        int first = score[0];
        int lowest = first;
        int highest = first;
        int highRec = 0;
        int lowRec = 0;
        for(int i=1;i<n;i++){
            int cur = score[i];
            if(cur>highest){
                highRec++;
                highest = cur;
            }else if(cur<lowest){
                lowRec++;
                lowest = cur;
            }
        }
        
        System.out.println(highRec + " " + lowRec);
    }
}
