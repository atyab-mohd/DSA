//This is quite a good problem in this problem to search an index of an integer first i'm finding the min integer present in an array so that i can break this rotated array into two sub-arrays. After which the problem will become quite easy we will just use the binary search in both the sub-arrays which are sorted and strickly increasing and we will just return the index of the integer we have to find.
// i made the function name 'binarySearch' so that i don't have to write the same approach again for two subarrays
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
//TIME COMPLEXITY IS:- O(log n)