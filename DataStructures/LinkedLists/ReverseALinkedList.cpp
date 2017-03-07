// Easy
// Reverse A Linked List - Hacker Rank / Data Structures / Linked Lists
/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
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

