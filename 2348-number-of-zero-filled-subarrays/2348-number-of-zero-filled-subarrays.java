class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cur = 0, ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) cur++;
            else{
                ans += (cur * (cur + 1))/ 2;
                cur = 0;
            }
        }
        ans += (cur * (cur + 1))/ 2;
        return ans;
    }
}