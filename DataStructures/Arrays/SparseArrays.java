// Sparse Arrays - Hacker Rank / Data Structures / Arrays
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numStr = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<numStr;i++){
            String str = sc.nextLine();
            if(hm.containsKey(str)){
                int curVal = hm.get(str);
                hm.put(str,curVal+1);
            }else{
                hm.put(str,1);
            }
            //System.out.println(hm.get(str));
        }
        int numQ = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numQ;i++){
            String q = sc.nextLine();
            if(hm.containsKey(q)){
                System.out.println(hm.get(q));
            }else{
                System.out.println(0);
            }
        }
        
    }
}
