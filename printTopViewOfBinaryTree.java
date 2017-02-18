// Print Top View Of A Binary Tree - HackerRank
/*
   class Node 
       int data;
       Node left;
       Node right;
*/

void print_left(Node root){
    if(root == null){
        return;
    }
    
    if(root.left != null){
        print_left(root.left);
    }
    System.out.print(root.data + " ");
}

void print_right(Node root){
    if(root == null){
        return;
    }
    
    System.out.print(root.data + " ");
    if(root.right != null){
        print_right(root.right);
    }
}

void top_view(Node root)
{
    if(root == null){
        return;
    }
    
    print_left(root.left);
    System.out.print(root.data + " ");
    print_right(root.right);
}

