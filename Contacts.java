import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Trie {
    private HashMap<String, Integer> nodeMap = new HashMap<>();

    public Trie() {}

    public Trie(String s) {
        add(s);
    }

    public void add(String s) {
        HashMap<String,Integer> node = nodeMap;
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            current = current + s.charAt(i);
            if (!node.containsKey(current)) {
                node.put(current, 1);
            }else{
                node.put(current, node.get(current) + 1);
            }
        }
    }
 
    public void delete(String s){
        HashMap<String,Integer> node = nodeMap;
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            current = current + s.charAt(i);
            if (node.containsKey(current)) {
                int count = node.get(current);
                if(count>1){
                    node.put(current, node.get(current) - 1);
                }else if(count == 1){
                    node.remove(current);
                }
            }
        }
    }
    
    public int findWithPre(String s){
        HashMap<String, Integer> node = nodeMap;
        if(node.containsKey(s)){
           return node.get(s);
        }
        
        return 0;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int qCount = sc.nextInt();
        Trie myTrie = new Trie();
        for(int i=0;i<qCount;i++){
            String q = sc.next();
            String word = sc.next();
            if(q.equals("add")){
                myTrie.add(word);
            }else if(q.equals("find")){
                System.out.println(myTrie.findWithPre(word));
            }
        }
    }
}
