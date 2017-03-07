// Algorithmic Crush - HackerRank
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        size = size;
        int opCount = sc.nextInt();
        sc.nextLine();
        long[] array = new long[size+1];
        
        for(int i=0;i<size+1;i++){
            array[i] = 0;
        }
        
        for(int i=0;i<opCount;i++){
            int start = sc.nextInt();
            start = start-1;
            int fin = sc.nextInt();
            long val = sc.nextLong();
            array[start] = array[start] + val;
            
            array[fin] = array[fin] - val;
                       
            if(i!=opCount-1){
            sc.nextLine();
            }
        }
        
        long max = 0;
        long current = 0;

        for(int i=0;i<size;i++){
            current = current + array[i];
            if(current>max){
                max = current;
            }
        }
        System.out.println(max);
            
    }
}
