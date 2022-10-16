class Solution {
    public int findMin(int[] nums) {
        //in binary search problems i mostly uses variable 'l' as the left index, 'r' as the right index and 'mid' as the middle index 
        int l=0, r=nums.length-1, mid;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<nums[r])
                r=mid; // r will be mid coz mid can also be our min value that's why we will not shit r to min-1 
            else if(nums[mid]>nums[r])
                l=mid+1;
            else
                return nums[mid]; // here l, r and mid all are at the same position we can return any of them(nums[l], nums[r] or nums[mid]) it will work.
        }
        return -1; //code will never reach here that's why just returning a dummy value.
    }
}
// WORST TIME COMPLEXITY WILL STRICKLY BE:- 0(log n) 