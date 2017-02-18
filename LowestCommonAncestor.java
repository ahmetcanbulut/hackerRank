 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
{
    Node v1Node = root;
    Node v2Node = root;
    Node common = root;
    while(v1Node != null && v2Node!= null){
        if(v1Node.data == v2Node.data){
            common = v1Node;
            
            if(v1<v1Node.data){
                v1Node = v1Node.left;
            }else if(v1>v1Node.data){
                v1Node = v1Node.right;
            }else{
                
            }

            if(v2<v2Node.data){
                v2Node = v2Node.left;
            }else if(v2>v2Node.data){
                v2Node = v2Node.right;
            }else{
                
            }
        }
        else{
            break;
        }
    }
    return common;
}
