class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<n;i++){
            if(!st.empty() && st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        while(!st.empty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}