// Easy
// Alternating Characters - HackerRank / Algorithms / Strings

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            int result = 0;
            String word = sc.next();
            int charLen = word.length();
            Character prev = word.charAt(0);
            for(int j=1;j<charLen;j++){
                Character cur = word.charAt(j);
                if((prev+"").equals(cur+"")){
                    result++;
                }
                prev = cur;
            }
            System.out.println(result);
        }
    }
}
