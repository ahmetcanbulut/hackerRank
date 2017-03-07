// Easy
// Compare Two Linked Lists - Hacker Rank / Data Structures / Linked Lists

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
  // This is a "method-only" submission. 
  // You only need to complete this method 
  if(headA == NULL && headB == NULL){
      return true;
  }else if( headA!=NULL && headB!= NULL ){
      if(headA->data == headB->data){
          return CompareLists(headA->next,headB->next);
      }else{
          return false;
      }
  }else{
      return false;
  }  
}
