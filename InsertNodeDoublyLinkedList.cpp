/*
    Insert Node in a doubly sorted linked list 
    After each insertion, the list should be sorted
   Node is defined as
   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }
*/
Node* SortedInsert(Node *head,int data)
{
    Node* newNode = new Node;
    newNode->data = data;
    newNode->next = NULL;
    newNode->prev = NULL;
    
    
    Node* current = head;
    if(current == NULL){
        return newNode;
    }
    
    while(current!=NULL){
        if(current->data >= data){
            Node* temp = current->prev;
            if(temp != NULL){
                temp->next = newNode;
            }
            current->prev = newNode;
            newNode->next = current;
            newNode->prev = temp;
            break;
        }else if(current->next == NULL){
            current->next = newNode;
            newNode->prev = current;
            break;
        }
        
        current = current->next;
    }

    if(head->data>=data){
        return head->prev;
    }
    return head;
}

