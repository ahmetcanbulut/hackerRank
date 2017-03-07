// Left Rotation - Hacker Rank / Data Structures / Arrays
import java.io.*;
import java.util.*;

public class Solution {

    static int[] array;
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int shiftCount = sc.nextInt();
        shiftCount = shiftCount%size;
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        
        for(int i=0;i<shiftCount;i++){
            LeftShift(array,size);
        }
        PrintArray(array,size);
    }
    
    static void LeftShift(int[] array, int size){
        int first = array[0];
        for(int i=1;i<size;i++){
            array[i-1] = array[i];
        }
        array[size-1] = first;
    }
    
    static void PrintArray(int[] array, int size){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
