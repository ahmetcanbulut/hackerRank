// Easy
// Get Node Value - Hacker Rank / Data Structures / Linked Lists

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* ReverseInternal(Node* prev,Node* cur){
    
    if(cur == NULL){
        return prev;    
    }
    else{
        if(prev->next == cur){
            prev->next = NULL;
        }
        Node* temp = NULL;
        if(cur->next!=NULL){
            temp = cur->next;
        }
        cur->next = prev;
        return ReverseInternal(cur,temp);
    }
}

Node* Reverse(Node *head)
{
  // Complete this method
    if(head == NULL){
        return NULL;
    }
    Node* temp = NULL;
    if(head->next!=NULL){
        temp = head->next;
        head->next = NULL;
    }
    Node* tail = ReverseInternal(head,temp);
    return tail;
}

int GetNodeInternal(Node* head, int position){
    if(position == 0){
        return head->data;
    }else{
        return GetNodeInternal(head->next, position-1);
    }
}

int GetNode(Node *head,int positionFromTail)
{
    Node* tail = Reverse(head);
    return GetNodeInternal(tail,positionFromTail);
  // This is a "method-only" submission. 
  // You only need to complete this method. 
}

