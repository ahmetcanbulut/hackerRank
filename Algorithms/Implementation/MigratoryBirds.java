// Easy
// Migratory Birds - HackerRank / Algorithms / Implementation

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int maxCount = 0;
        int maxId = 0;
        for(int types_i=0; types_i < n; types_i++){
            int curType = in.nextInt();
            types[curType]++ ;
            if(types[curType]>maxCount){
                maxCount = types[curType];
                maxId = curType;
            }else if(types[curType] ==  maxCount){
                if(curType<maxId){
                    maxId = curType;
                }
            }
        }
        
        System.out.println(maxId);
    }
}
