// Easy
// Delete A Node - Hacker Rank / Data Structures / Linked Lists
/*
  Delete Node at a given position in a linked list 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/

Node* DeleteNodeInternal(Node* start, Node* head, int position){
    if(position == 0){
        return head->next;
    }else if(position == 1){
        if(head->next != NULL){
            head->next = head->next->next;
            return start;
        }else{
            return start;
        }
    }else{
        return DeleteNodeInternal(start,head->next, position-1);
    }
}

Node* Delete(Node *head, int position)
{
  // Complete this method
    return DeleteNodeInternal(head,head,position);
}
