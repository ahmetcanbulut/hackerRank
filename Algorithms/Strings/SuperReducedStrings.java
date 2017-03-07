// Super Reduced Strings - Hacker Rank / Algorithms / Strings

import java.io.*;
import java.util.*;

public class Solution {

    static String Reduce(String str){
        if(str.length() <= 1){
            return str;
        }
        
        int size = str.length();
        for(int i=0;i+1<size;){
            Character cur = str.charAt(i);
            Character next = str.charAt(i+1);
            if(cur.equals(next)){
                str = str.substring(0,i) + str.substring(i+2,size); 
                size = size-2;
            }else{
                i = i+1;
            }
        }
        return str;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String temp = "";
        while(temp!=str){
            temp = str;
            str = Reduce(str);
        }
        
        if(str.equals("")){
            str = "Empty String";
        }
            
        System.out.print(str);
    }
}
