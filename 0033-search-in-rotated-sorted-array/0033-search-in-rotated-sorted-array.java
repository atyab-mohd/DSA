class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0, r=n-1, mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<nums[r])
                r=mid;
            else if(nums[mid]>nums[r])
                l=mid+1;
            else
                 break;
        }
        int midIndex=mid;
        if(nums[midIndex]<=target && nums[n-1]>=target){
            l=midIndex;
            r=n-1;
        }
        else{
            l=0;
            r=midIndex-1;
        }
        return binarySearch(nums, l, r, target);
    }
    
    int binarySearch(int[]nums, int l, int r, int target){
        int mid;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]>target)
                r=mid-1;
            if(nums[mid]<target)
                l=mid+1;
            if(nums[mid]==target)
                return mid;
        }
        return -1;
    }
}
