// Easy
// Print Reverse - Hacker Rank / Data Structures / Linked Lists
/*
  Print elements of a linked list in reverse order as standard output
  head pointer could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/

void PrintInternal(Node* head){
    if(head == NULL){
        return;
    }
    std::cout<<head->data<<std::endl;   
    PrintInternal(head->next);
}

Node* ReversePrintInternal(Node* prev,Node* cur){
    
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
        return ReversePrintInternal(cur,temp);
    }
}

void ReversePrint(Node *head)
{
  // This is a "method-only" submission. 
  // You only need to complete this method.
    if(head == NULL){
        return;
    }
    Node* temp = NULL;
    if(head->next!=NULL){
        temp = head->next;
        head->next = NULL;
    }
    Node* tail = ReversePrintInternal(head,temp);
    PrintInternal(tail);
}
