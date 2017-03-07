Array - DS - Hacker Rank / Data Structures / Arrays
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i] = scanner.nextInt();
        }
        
        for(int i=count-1;i>=0;i--){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
