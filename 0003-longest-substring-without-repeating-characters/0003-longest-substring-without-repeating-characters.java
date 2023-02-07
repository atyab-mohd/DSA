class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0,  right = 0;
        int ans = 0;
        while(right < s.length()){
            if(hm.containsKey(s.charAt(right))) 
                left = Math.max(left, hm.get(s.charAt(right)) +1);
            hm.put(s.charAt(right), right);
            ans = Math.max(ans, right - left +1);
            right++;
        }
        return ans;
    }
}