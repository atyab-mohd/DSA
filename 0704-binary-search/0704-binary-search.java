class Solution {
    public int search(int[] nums, int target) {
        //  TIME COMPLEXITY OF THE FOLLOWING CODE IS:- O(n)
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;
        
        // NOW USING BINARY SEARCH WE ARE DECREASING THE TIME COMPLEXITY
        // NOW THE TIME COMPLEXITY DECRESED TO:- O(log n)
        int n=nums.length;
        int l=0, r=n-1, mid;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<target){
                l=mid+1;            
            }
            if(nums[mid]>target){
                r=mid-1;
            }
            if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}