// Easy
// Insert Node At The Tail Of A Linked List - Hacker Rank / Data Structures / Linked Lists
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* InsertInternal(Node* start, Node* head, int data){
    if(head == NULL){
        start = new Node();
        start->next = NULL;
        start->data = data;
        return start;
    }
    
    if(head->next == NULL){
        Node* newNode = new Node();
        newNode->data = data;
        newNode->next = NULL;
        head->next = newNode;
        return start;
    } else{
        return InsertInternal(start, head->next, data);
    }
}

Node* Insert(Node *head,int data)
{
  // Complete this method
    return InsertInternal(head, head, data );
}

