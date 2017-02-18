// Binary Search Tree Insertion - HackerRank
/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node InsertInternal(Node root, Node current, int value){
    if(root == null){
        Node newNode = new Node();
        newNode.data = value;
        return newNode;
    }
    
    if(current.data == value){
        return root;
    }
    
    if(current.data<value){
        if(current.right==null){
            Node newNode = new Node();
            newNode.data = value;
            current.right = newNode;
            return root;
        }else{
            return InsertInternal(root,current.right,value);
        }
    }else{
        if(current.left==null){
            Node newNode = new Node();
            newNode.data = value;
            current.left = newNode;
            return root;
        }else{
            return InsertInternal(root,current.left,value);
        }
    }
}

static Node Insert(Node root,int value)
{
    return InsertInternal(root,root,value);
}
