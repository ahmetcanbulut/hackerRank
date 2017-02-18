// Merge Two Sorted Linked List - HackerRank
/*
  Merge two sorted lists A and B as one linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/


Node* MergeLists(Node *headA, Node* headB)
{
  if(headA == NULL){
      return headB;
  }
   
  if(headB == NULL){
      return headA;
  }
   
  Node* node1 = headA;
  Node* node2 = headB;
    
  while(node1 != NULL && node2 != NULL ){
      Node* smaller;
      Node* bigger;
      if(node1->data < node2->data){
          smaller = node1;
          bigger = node2;
      }else{
          smaller = node2;
          bigger = node1;
      }
      
      while(smaller->next != NULL && smaller->next->data < bigger->data){
          smaller = smaller->next;
      }
      
      node1 = smaller->next;
      smaller->next = bigger;
      node2 = bigger;
  }
  
  if(headA->data < headB->data){
      return headA;
  }else{
      return headB;
  }
}
