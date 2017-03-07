// Lonely Integer - HackerRank / Algorithms / Bit Manipulation
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> lonelySet = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
                lonelySet.add(a[i]);
            }else{
                map.put(a[i],2);
                lonelySet.remove(a[i]);
            }
        }
        
        Iterator<Integer> it = lonelySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
