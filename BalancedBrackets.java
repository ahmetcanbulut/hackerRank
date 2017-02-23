// Balanced Brackets - HackerRank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    static String isMatching(String s){
        int len = s.length();
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<len;i++){
            Character ch = s.charAt(i);
            
            if(ch.equals('{') || ch.equals('[') || ch.equals('(')){
                stack.push(ch);
            }else if(stack.isEmpty()){ // start with closing paranthesis
                return "NO";
            }
            else if(ch.equals('}')){
                Character top = stack.pop();
                // System.out.println("top: " + top + " next in: " + ch);
                if(!top.equals('{')){
                    return "NO";
                }
           }else if(ch.equals(']')){
               Character top = stack.pop();
                // System.out.println("top: " + top + " next in: " + ch);
                if(!top.equals('[')){
                    return "NO";
                }
           }
           else if(ch.equals(')')){
                Character top = stack.pop();
                // System.out.println("top: " + top + " next in: " + ch);
                if(!top.equals('(')){
                    return "NO";
                }
            }
            else{
                return "NO";
            }
        }
        
        if(stack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println(isMatching(s));
        }
    }
}


