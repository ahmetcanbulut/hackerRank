import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int max = 0;
        for(int i=l;i<=r;i++){
            for(int j=l;j<=r;j++){
                int res = i^j;
                if(res>max){
                    max = res;
                }
            }
        }
        System.out.println(max);
    }
}
