//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    class NodeValue{
        int minNode, maxNode, maxSize;
        NodeValue(int minNode, int maxNode, int maxSize){
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.maxSize = maxSize;
        }
    }
    
    // Return the size of the largest sub-tree which is also a BST
    NodeValue largestBstHelper(Node root){
        //an empty tree is a bst of size 0
        if(root == null) return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        //get values from left and right of current subtree
        NodeValue left = largestBstHelper(root.left);
        NodeValue right = largestBstHelper(root.right);
        //current node is greater than max of left  AND smaller than min of right, it is a bst
        //bst condition
        if(left.maxNode < root.data && root.data < right.minNode){
            // it is a bst
            return new NodeValue(Math.min(root.data, left.minNode), Math.max(root.data, right.maxNode), left.maxSize + right.maxSize + 1);
        }
        //otherwise, return [-MINintVal, MAXintVal] so that parent can't be a valid bst
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
    }
     int largestBst(Node root)
    {
        // Write your code here
        return largestBstHelper(root).maxSize;
        
        
        
    }
    
}