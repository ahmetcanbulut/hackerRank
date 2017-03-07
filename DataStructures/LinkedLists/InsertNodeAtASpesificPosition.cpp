// Easy
// Insert Node At A Spesific Position - Hacker Rank / Data Structures / Linked Lists
/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/


Node* InsertNthInternal(Node *start, Node* head, int data, int position){
    
    if(position == 0){
        Node* newNode = new Node();
        newNode->data = data;
        newNode->next = head;
        return newNode;
    }else if(position == 1){
        Node* newNode = new Node();
        newNode->data = data;
        newNode->next = head->next;
        head->next = newNode;
        return start;
    }else{
        return InsertNthInternal(start, head->next,data,position-1);
    }
    
}

Node* InsertNth(Node *head, int data, int position)
{
  // Complete this method only
  // Do not write main function. 
  return InsertNthInternal(head,head,data,position);
}
