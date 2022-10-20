class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(!st.empty() && st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans="";
        while(!st.empty()){
            ans+=st.pop();
        }
        return ans;
    }
}