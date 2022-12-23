class Solution {
    public int minAddToMakeValid(String s) {
        int prefix_sum=0, ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') prefix_sum++;
            else{
                if(prefix_sum == 0) ans++;
                else prefix_sum--;
            }
        }
        return prefix_sum + ans;
    }
}