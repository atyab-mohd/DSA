class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int max=1;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i] - difference, 0)+1);
        }
        for(int val : hm.values()) max= Math.max(max, val);
        return max;
    }
}