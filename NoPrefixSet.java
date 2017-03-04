import java.io.*;
import java.util.*;

class SetTrie{
    public HashMap<Character,SetTrie> children;
    public String word;
    public int childCount;
    public SetTrie(){
        children = new HashMap<Character,SetTrie>();
        childCount = 0;
        word = null;
    }

    public String add(String str){
        SetTrie node = this;
        boolean failed = false;
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            boolean isLast = false;
            if(i == str.length()-1){
                isLast = true;
            }
            if(node.children.containsKey(ch)){
                node = node.children.get(ch);
                if(node.word != null){
                    failed = true;
                }

                if(isLast){
                    if(node.childCount>0){
                        failed = true;
                    }
                    node.word = str;
                }
            }else{
                SetTrie newTrie = new SetTrie();
                node.childCount ++;
                node.children.put(ch,newTrie);
                node = newTrie;
                if(isLast){
                    node.word = str;
                }
            }
        }
        if(failed){
            return str;
        }else{
            return null;
        }
    }
}

public class Solution {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        SetTrie trie = new SetTrie();
        trie.word = "";

        for(int i=0; i< count; i++){
            String curStr = sc.nextLine();
            String result = trie.add(curStr);
            if(result!=null){
                System.out.println("BAD SET");
                System.out.println(result);
                return;
            }
        }
        System.out.println("GOOD SET");
    }
}
