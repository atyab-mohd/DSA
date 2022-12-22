class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(n == 2){
            if(nums[0] > nums[1]) return 0;
            else return 1;
        }
        int l=1, r=n-2;
        if(nums[0] > nums[l]) return 0;
        if(nums[n-1] > nums[r]) return n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) return mid;
            else if(nums[mid] < nums[mid+1]) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
}