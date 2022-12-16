//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String str1, String str2){
        // code here
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str2.length();i++){
            hm.put(str2.charAt(i),1);
        }
        String ans="";
        for(int i=0;i<str1.length();i++){
            if(!hm.containsKey(str1.charAt(i))) ans += str1.charAt(i);
        }
        return ans;
    }
}