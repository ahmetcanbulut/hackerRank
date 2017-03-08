// Easy
// Pangram (a sentence containing all letters in english alphabet) - Hacker Rank / Algorithms / Strings

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(!ch.equals(' ')){
                int curInt = Character.getNumericValue(Character.toLowerCase(ch));
                set.add(curInt);
            }
        }
        
        for(int i = Character.getNumericValue('a');i<=Character.getNumericValue('z');i++){
            if(!set.contains(i)){
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
}
