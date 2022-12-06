//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.util.HashMap;
import java.io.*;

    class Node
    {
        int data;
        Node left,right;
        Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    }
		
public class GFG2
{
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void inorder(Node root)
	{
	    if(root==null)
	    return;
	    inorder(root.left);
	    System.out.print(root.data);
	    inorder(root.right);
	}
     /* Drier program to test above functions */
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    GFG g = new GFG();
			
			    ArrayList<Integer> res = g.zigZagTraversal(root) ;
			    for (int i = 0; i < res.size (); i++)
			        System.out.print (res.get (i) + " ");
			    System. out. println();  
    			
                t--;
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<Integer>();
        // if there is no element in the tree,return empty
        // arraylist
        if (root == null)
            return ans;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        // this variable helps to check if elements are to
        // be added from left to right or right to left
        boolean leftToRight = true;
        while (q.size() > 0) {
            int size = q.size();
            // this arraylist is used to store element at
            // current level
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
                temp.add(curr.data);
            }
            if (leftToRight) // at current level,add element
                             // from left to right to our
                             // answer
            {
                // do nothing
            }
            // we have to add element from to right to left
            // and this can be done by reversing our temp
            // arraylist
            else {
                Collections.reverse(temp);
            }
            // add element form temp arraylist to our ans
            // arraylist
            for (int i = 0; i < temp.size(); i++) {
                ans.add(temp.get(i));
            }
            // change the value of leftToRight from true to
            // false or false to true for next iteration.
            leftToRight = !(leftToRight);
        }
        // return our ans arraylist
        return ans;
	    
	    //Add your code here.
	   // ArrayList<Integer> ans = new ArrayList<>();
	   // if(root == null) return ans;
	   // Queue<Node> q = new LinkedList<>();
	   // q.add(root);
	   // int level = 1;
	   // while(q.size()>0){
	   //     int size = q.size();
	   //     for(int i=0;i<size;i++){
	   //         Node cur = q.poll();
	   //         ans.add(cur.data);
	   //         if(level % 2 == 0){
	   //             if(cur.left != null) q.add(cur.left);
	   //             if(cur.right != null) q.add(cur.right);
	   //             //level++;
	   //         }
	   //         else{
	   //             if(cur.right != null) q.add(cur.right);
	   //             if(cur.left != null) q.add(cur.left);
	   //             //level++;
	   //         }
	   //         level++;
	   //     }
	   // }
	   // return ans;
	}
}