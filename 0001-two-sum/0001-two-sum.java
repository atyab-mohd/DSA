class Solution {
    public int[] twoSum(int[] nums, int target) {
        // // O(n^2) 
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target)
        //             return new int[]{i,j};
        //     }
        // }
        // return new int[]{-1,-1};
        // // the upper algo takes O(n^2) let's try to redue the time compexity 
        
        //Arrays.sort(nums);
        int []ans = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> hm  =  new HashMap<>(); 
        for(int i=0;i<n;i++){
            if(hm.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = hm.get(target - nums[i]);
                return ans;
            }
            hm.put(nums[i], i);
        }
        return ans;
    }
}