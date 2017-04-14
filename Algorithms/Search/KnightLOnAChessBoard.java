// KnightL On A Chess Boar - HackerRank / Algorithms / Search
// Medium

import java.util.*;

class Node {
    int x;
    int y;
    Node parent;

    public Node(int a, int b){
        x = a;
        y = b;
        parent = null;
    }

}

public class Solution {
    public static boolean isValid(int n, int x, int y){
        if(x>=0 && x<=n-1 && y>=0 && y<= n-1){
            return true;
        }
        return false;
    }

    public static void expandNode(Node n, Queue<Node> queue, int[][] visited, int size, int a, int b){

        int x,y;
        x = n.x + a;
        y = n.y + b;
        checkAddNode(n,queue,visited,x,y,size);

        x = n.x + a;
        y = n.y - b;
        checkAddNode(n,queue,visited,x,y,size);

        x = n.x - a;
        y = n.y + b;
        checkAddNode(n,queue,visited,x,y,size);

        x = n.x - a;
        y = n.y - b;
        checkAddNode(n,queue,visited,x,y,size);

        x = n.x + b;
        y = n.y + a;
        checkAddNode(n,queue,visited,x,y,size);

        x = n.x + b;
        y = n.y - a;
        checkAddNode(n,queue,visited,x,y,size);

        x = n.x - b;
        y = n.y + a;
        checkAddNode(n,queue,visited,x,y,size);

        x = n.x - b;
        y = n.y - a;
        checkAddNode(n,queue,visited,x,y,size);

    }

    public static void checkAddNode(Node parent, Queue<Node> queue, int[][] visited, int x, int y, int size){
        if(isValid(size,x,y) && visited[x][y] == 0){
            Node newNode = new Node(x,y);
            newNode.parent = parent;
            queue.add(newNode);
            visited[x][y] = 1;
        }
    }

    public static boolean isFinal(Node node, int n){
        if(node.x == n-1 && node.y == n-1){
            return true;
        }
        return false;
    }

    public static int calculateAncestorChain(Node n){
        int count = 0;
        Node temp = n;
        while(temp.parent != null){
            count++;
            temp = temp.parent;
        }
        return count;
    }

    public static int solve(int n, int a, int b){
        int[][] visited = new int[n][n];
        Queue<Node> queue = new LinkedList<Node>();
        Node start = new Node(0,0);
        queue.add(start);
        ArrayList<Node> solutionList = new ArrayList<Node>();
        while(!queue.isEmpty()){
            Node current = (Node)queue.remove();
            if(isFinal(current,n)) {
               solutionList.add(current);
            }
            expandNode(current,queue,visited,n,a,b);
        }
        int minChainCount = Integer.MAX_VALUE;
        for(int i=0; i<solutionList.size(); i++){
            int result = calculateAncestorChain(solutionList.get(i));
            if(result<minChainCount){
                minChainCount = result;
            }
        }
        if(minChainCount != Integer.MAX_VALUE) {
            return minChainCount;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                System.out.print(solve(n,i,j) + " ");
            }
            System.out.println("");
        }
    }
}
