// Easy
// Insert Node At The Head Of A Linked List - Hacker Rank / Data Structures / Linked Lists
/*
  Insert Node at the begining of a linked list
  Initially head pointer argument could be NULL for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
return back the pointer to the head of the linked list in the below method.
*/
Node* Insert(Node *head,int data)
{
  // Complete this method
    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = head;
    return newNode;
}
