// Height of Binary Tree - HackerRank	
/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
  // height of a single node is 0
  
static int height(Node root) {
	if(root == null){
	    return -1;
	}
	return 1 + Math.max(height(root.left),height(root.right));
}
