// Simple Text Editor - HackerRank

java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int opCount = sc.nextInt();
        
        Deque<Integer> opStack = new ArrayDeque<Integer>();
        Deque<String> strStack = new ArrayDeque<String>();
        
        String s = "";
        
        for(int i=0;i<opCount;i++){
            int opType = sc.nextInt();
            // System.out.println("operation = "+opType);
            switch (opType){
                case 1: String str = sc.next();
                        opStack.push(1);
                        strStack.push(str);
                        s = s.concat(str);
                        break;
                case 2: int chCount = sc.nextInt();
                        opStack.push(2);
                        int len = s.length();
                        String removed = s.substring(len-chCount,len);
                        strStack.push(removed);
                        s = s.substring(0,len-chCount);                        
                        break;
                case 3: int k = sc.nextInt();
                        System.out.println(s.charAt(k-1)+"");
                        break;
                case 4: int undoType = opStack.pop();
                        String topStr = strStack.pop();
                        switch(undoType){
                            case 1: int curLen = s.length();
                                    int wlen = topStr.length();
                                    s = s.substring(0,curLen-wlen);
                                    break;
                            case 2: s = s.concat(topStr);
                                    break;
                        }
                        break;
                default:break;
            }
            // System.out.println("S = "+ s);
        }
    }
}
