class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length, count = 0 ;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        for(int val : hm.keySet()){
            if(hm.containsKey(val+k)){
                if(k>0){
                count++;
                }
                if(k==0){
                    if(hm.get(val+k)>1) count++;
                }
            }
        }
        return count;
    }
}