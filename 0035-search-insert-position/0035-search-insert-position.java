class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int l=0, r=n-1,mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]<target)
                l=mid+1;
            if(arr[mid]>target)
                r=mid-1;
            if(arr[mid]==target)
                return mid;
        }
        return r+1; 
    }
}