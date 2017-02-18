// Huffman Coding - HackerRank
/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void printNode(Node root){
    System.out.print(Character.toString(root.data));
}

boolean isLeaf(Node root){
    if(root == null){
        return false;
    }
    
    if(root.left == null && root.right == null){
        return true;
    }
    return false;
}

void decode(String S ,Node root)
{
    Node current = root;
    int length = S.length();
    for(int i=0;i<length;i++){           
        char move = S.charAt(i);
        if(move == '0'){
            current = current.left;
        }else{
            current = current.right;
        }
        if(isLeaf(current)){
            printNode(current);
            current = root;
        }
    }    
}
