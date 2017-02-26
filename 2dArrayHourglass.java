// 2D array HourGlass Sum - HackerRank

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */  
        int[][] array = new int[6][6];
        int maxRes = (-9)*6;
        array = ReadMatrix();
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int temp = GetHourGlass(array,i,j);
                if(temp>maxRes){
                    maxRes = temp;
                }
            }
        }
        System.out.print(maxRes);
    }
    
    static int GetHourGlass(int[][] array, int x, int y ){
        int sum = array[x][y] + array[x+1][y]+ array[x+2][y] + array[x+1][y+1]
            + array[x][y+2] + array[x+1][y+2] + array[x+2][y+2];
        return sum;
    }
    
    static int[][] ReadMatrix(){
        int[][] array = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<6 ; i++){
            for(int j=0; j<6; j++){
                array[j][i] = sc.nextInt();
            }
        }
        return array;
    }
}
