// Easy
// Flipping Bits - Hacker Rank - Algorithms - Bit Manipulation

import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class Solution {
    
    public static long generateXorMask(int count){
        long result = 1;
        for(int i=0;i<count-1;i++){
            result = result | (result << 1);
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        long mask = generateXorMask(32);
        
        for(int i=0;i<count;i++){
            long cur = sc.nextLong();
            long result = cur^mask;
            System.out.println(result);
        }
    }
}
