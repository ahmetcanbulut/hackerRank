// Easy
// Kangaroo - HackerRank / Algorithms / Implementation

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int abs(int x, int y){
        int res = x - y;
        if(res<0){
            return -res;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int prevDist = Integer.MAX_VALUE;
        int curDist = abs(x1,x2);
        
        while(curDist!=0 && curDist<prevDist){
            prevDist = curDist;
            x1 += v1;
            x2 += v2;
            curDist = abs(x1,x2); 
        }
        
        if(x1==x2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
