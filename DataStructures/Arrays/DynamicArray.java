// Dynamic Array - HackerRank / Data Structures / Arrays
import java.io.*;
import java.util.*;

public class Solution {
    
    static class MyList{
        ArrayList<Integer> data;
        public MyList(){
            data = new ArrayList<>();
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numSeq = sc.nextInt();
        int numQuery = sc.nextInt();
        MyList[] seqList = new MyList[numSeq];
        for(int i=0;i<numSeq; i++){
            seqList[i] = new MyList();
        }
        
        int lastAns = 0;
        
        for(int i=0;i<numQuery;i++){
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(type == 1){
                Query1(seqList,x,y,lastAns,numSeq);
            }else{
                lastAns = Query2(seqList,x,y,lastAns,numSeq);
                System.out.println(lastAns);
            }
        }
    }
    
    static void Query1(MyList[] seqList, int x, int y, int lastAns, int numSeq){
        int index = (x^lastAns) % numSeq;
        seqList[index].data.add(y);
    }
    
    static int Query2(MyList[] seqList, int x, int y, int lastAns, int numSeq){
        int index = (x^lastAns) % numSeq;
        int size = seqList[index].data.size();
        int elemIdx = y%size;
        return seqList[index].data.get(elemIdx);
        
    }
    
}
