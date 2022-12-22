class Solution {
    public int findPeakElement(int[] nums) {
        // int n = nums.length;
        // if(n == 1) return 0;
        // if(n == 2){
        //     if(nums[0] > nums[1]) return 0;
        //     else return 1;
        // }
        // int l=1, r=n-2;
        // if(nums[0] > nums[l]) return 0;
        // if(nums[n-1] > nums[r]) return n-1;
        // while(l<=r){
        //     int mid = (l+r)/2;
        //     if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]) return mid;
        //     else if(nums[mid] < nums[mid+1]) l = mid+1;
        //     else r = mid-1;
        // }
        // return -1;
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int m = l + (r-l)/2;
            if(nums[m]<nums[m+1])
                l = m+1;
            else
                r = m;
        }
        return r; // when l=r
    }
}