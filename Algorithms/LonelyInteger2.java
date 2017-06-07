import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     private static int lonelyInteger(int[] a) {
        int len = a.length;
        if(len == 1){
            return a[0];
        }
         
        int prev = a[0];
        for(int i=1;i<len;i++){
           int cur = a[i];
           prev ^= cur;
        }
         
        return prev;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
