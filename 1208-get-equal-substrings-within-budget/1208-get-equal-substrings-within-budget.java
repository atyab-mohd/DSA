class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n= s.length();
        int start=0;
        int end=0;
        int cost=0;
        int ans=0;
        while(end<n){
            char ch1= s.charAt(end);
            char ch2= t.charAt(end);
            cost+= Math.abs(ch1-ch2);
            end++;
            while(start<end && cost>maxCost){
                cost-= Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;
    }
}