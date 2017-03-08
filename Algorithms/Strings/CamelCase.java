// Easy
// Camel Case - Hacker Rank / Algorithms / Strings

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int length = s.length();
        int wordCount = 1;
        for(int i=0;i<length;i++){
            if(Character.isUpperCase(s.charAt(i))){
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
