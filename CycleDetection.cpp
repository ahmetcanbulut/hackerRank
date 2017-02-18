// Cycle Detection - HackerRank
/*
Detect a cycle in a linked list. Note that the head pointer may be 'NULL' if the list is empty.

A Node is defined as: 
    struct Node {
        int data;
        struct Node* next;
    }
*/

bool has_cycle(Node* head) {
    if(head == NULL){
        return false;
    }
    Node* slow = head;
    Node* fast = head;
    for(int i=0;i<200;i++){
        if(slow->next == NULL || fast->next->next == NULL){
            return false;
        }
        slow = slow->next;
        fast = fast->next->next;
        if(slow == fast){
            return true;
        }
    }
    return false;
}

