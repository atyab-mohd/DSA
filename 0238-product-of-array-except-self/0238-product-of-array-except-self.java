class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int []ans= new int[n];
        int []pparr= new int[n];
        int []sparr= new int[n];
        pparr[0]=nums[0];
        for(int i=1;i<n;i++) pparr[i]= pparr[i-1]*nums[i];
        sparr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--) sparr[i]= sparr[i+1]*nums[i];
        ans[0]=sparr[1];
        ans[n-1]=pparr[n-2];
        for(int i=1;i<n-1;i++) ans[i]= pparr[i-1]*sparr[i+1];
        return ans;
    }
}