// Staircase - HackerRank

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int symbolCount = 1;
        int spaceCount = count-symbolCount;
        for(int i=0;i<count;i++){
            for(int j=0;j<spaceCount;j++){
                System.out.print(" ");
            }
            for(int j=0;j<symbolCount;j++){
                System.out.print("#");
            }
            System.out.println();
            symbolCount++;
            spaceCount--;
        }
    }
}
