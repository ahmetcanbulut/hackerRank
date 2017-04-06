// Hackerrank In A String - HackerRank / Algorithms / Strings
// Easy

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int len = s.length();
            String hackerrank = "hackerrank";
            int hackerLength = hackerrank.length();
            int hackerIdx = 0;
            boolean yes = false;
            for(int i=0; i<len; i++){
                Character ch = s.charAt(i);
                if(ch == hackerrank.charAt(hackerIdx)){
                    hackerIdx++;
                }
                
                if(hackerIdx == hackerLength){
                    yes = true;
                    break;
                }
            }
            if (yes){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
