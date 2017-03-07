// Waiter - HackerRank

import java.io.*;
import java.util.*;

public class Solution {
    
    static int nextPrime(int start){
        while(true){
            if(isPrime(start)){
                return start;
            }
            start++;
        }
    }
    
    static boolean isPrime(int n) {
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;
        int step = 4, m = (int)Math.sqrt(n) + 1;
        for(int i = 5; i < m; step = 6-step, i += step) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stackA = new ArrayDeque<Integer>();
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            stackA.push(num);
        }
        
        int curPrime = 2;
        
        for(int i=0;i<q;i++){
            Deque<Integer> stackB = new ArrayDeque<Integer>();
            Deque<Integer> newStackA = new ArrayDeque<Integer>();
             while(stackA.size()>0){
                int cur = stackA.pop();
                if(cur%curPrime==0){
                    stackB.push(cur);
                }else{
                    newStackA.push(cur);
                }               
            }
            
            while(stackB.size()>0){
                System.out.println(stackB.pop());
            }
            stackA = newStackA;
            curPrime = nextPrime(curPrime+1);
        }
        
        while(stackA.size()>0){
            System.out.println(stackA.pop());
        }
    }
}
