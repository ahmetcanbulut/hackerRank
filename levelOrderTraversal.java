// Level Order Traversal - HackerRank   
/* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
   {
       if(root == null){
           return;
       }
       
       int curLevelCount = 1;
       int nextLevelCount = 0;
       ArrayDeque<Node> queue = new ArrayDeque<Node>();

       queue.push(root);
       while(!queue.isEmpty()){
           Node curNode = queue.peekFirst();
           queue.pop();
           curLevelCount--;
           if(curNode != null){
               System.out.print(curNode.data + " ");
               if(curNode.left != null){
                   queue.offer(curNode.left);
                   nextLevelCount++;
               }
               if(curNode.right != null){
                    queue.offer(curNode.right);
                   nextLevelCount++;
               }
           }
           if(curLevelCount == 0){
               // System.out.println();
               curLevelCount = nextLevelCount;
               nextLevelCount = 0;
           }
       } 
   }
