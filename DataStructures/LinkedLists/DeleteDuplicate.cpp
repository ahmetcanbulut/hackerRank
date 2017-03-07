// Delete Duplicate - HackerRank
/*
  Remove all duplicate elements from a sorted linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
void RemoveSecond(Node* first, Node* second){
    first->next = second->next;
}

Node* RemoveDuplicates(Node *head)
{
    Node* start = head;
    if(head == NULL){
        return head;
    }
    while(head!=NULL && head->next != NULL){
        Node* first = head;
        Node* second = head->next;
        if(first->data == second->data){
            RemoveSecond(first,second);
        }else{
            head = head->next;
        }      
    }
    return start;
}
