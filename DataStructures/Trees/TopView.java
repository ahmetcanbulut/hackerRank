// Easy
// Top View - Hacker Rank / Data Structures / Trees
/*
   class Node 
       int data;
       Node left;
       Node right;
*/

void printLeft(Node root){
    if(root == null){
        return;
    }
    
    if(root.left != null){
        printLeft(root.left);
    }
    System.out.print(root.data + " ");
}

void printRight(Node root){
    if(root == null){
        return;
    }
    
    System.out.print(root.data + " ");
    if(root.right != null){
        printRight(root.right);
    }
}

void top_view(Node root)
{
    if(root == null){
        return;
    }
    
    printLeft(root.left);
    System.out.print(root.data + " ");
    printRight(root.right);
}
