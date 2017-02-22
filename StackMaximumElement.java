// Maximum Element Stack

import java.io.*;
import java.util.*;

public class Solution {

    static int findMax(ArrayList<Integer> list){
        int max = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int qCount = sc.nextInt();
        
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int topIdx = 0;
        int max = -1;
        
        for(int i=0;i<qCount;i++){
            int type = sc.nextInt();
            if(type == 1){
                int val = sc.nextInt();
                stack.add(topIdx,val);
                if(val>max){
                    max = val;
                }
                topIdx++;
            }else if(type == 2){
                int val = stack.get(topIdx-1);
                stack.remove(topIdx-1);
                if(val == max){
                    max = findMax(stack);
                }
                topIdx--;
            }else{
                // print max
                System.out.println(max);
            }
            
        }
    }
}
