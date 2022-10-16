class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []pos=new int[2];
        pos[0]=firstpos(nums, target);
        pos[1]=lastpos(nums, target);
        return pos;
    }
    int firstpos(int []nums, int target){
        int l=0, r=nums.length-1, mid, ans=-1;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            if(nums[mid]>target)
                r=mid-1;
            if(nums[mid]==target){
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
    int lastpos(int []nums, int target){
        int l=0, r=nums.length-1, mid, ans=-1;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            if(nums[mid]>target)
                r=mid-1;
            if(nums[mid]==target){
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
    
}