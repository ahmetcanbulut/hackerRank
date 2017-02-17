/*
   Reverse a doubly linked list, input list may also be empty
   Node is defined as
   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }
*/
Node* Reverse(Node* head)
{
    if(head == NULL){
        return head;
    }
    
    Node* current = head;
    Node* temp = NULL;
    while(current!=NULL){
        temp = current->prev;
        current->prev = current->next;
        current->next = temp;
        current = current->prev;
    }
    
    return temp->prev;
}
