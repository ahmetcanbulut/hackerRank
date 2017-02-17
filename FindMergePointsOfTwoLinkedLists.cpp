/*
   Find merge point of two linked lists
   Node is defined as
   struct Node
   {
       int data;
       Node* next;
   }
*/
int FindMergeNode(Node *headA, Node *headB)
{
    int bData = headB->data;
    while(headA != NULL){
        Node* tempA = headA->next;
        headA->next = NULL;
        headA = tempA;
    }
    
    while(headB != NULL){
        bData = headB->data;
        headB = headB->next;
    }
    
    return bData;
}
