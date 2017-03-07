import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Trie {
    private HashMap<Character, Trie> nodeMap = new HashMap<>();
    private final Character END_CHARACTER = '$';
    public int numOfOccurances = 0;
    //public int numOfOccurences = 0;

    public Trie() {}

    public Trie(String s) {
        add(s);
    }

    public Trie(Collection<String> collection) {
        for (String s : collection) {
            add(s);
        }
    }

    public void add(String s) {
        HashMap<Character, Trie> node = nodeMap;
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (!node.containsKey(character)) {
                node.put(character, new Trie());
            }
            node.get(character).numOfOccurances++;
            node = node.get(character).nodeMap;
        }
        node.put(END_CHARACTER, new Trie());
    }
    /*
    public int countLeaves(HashMap<Character,Trie> node){
        Iterator it = node.entrySet().iterator();
        int total = 0;
        
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry<Character,Trie>)it.next();
            if(pair.getKey().equals('$')){
                total = total +1;
            }else{
                HashMap<Character,HashMap> child = (HashMap<Character,HashMap>)pair.getValue();
                total = total + countLeaves(child);
            }
        }
        return total;
    }
*/
    public boolean contains(String s) {
        HashMap<Character, Trie> node = nodeMap;
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (node.containsKey(character)) {
                node = node.get(character).nodeMap;
            } else {
                return false;
            }
        }
        return node.containsKey(END_CHARACTER);
    }
    
    public int findWithPre(String s){
        // HashMap<Character, Trie> node = nodeMap;
        Trie curTree = this;
        for(int i=0;i<s.length();i++){
            Character character = s.charAt(i);
            if(curTree.nodeMap.containsKey(character)){
                curTree = curTree.nodeMap.get(character);
            }else{
                return 0;
            }
        }
        
        return curTree.numOfOccurances;
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

