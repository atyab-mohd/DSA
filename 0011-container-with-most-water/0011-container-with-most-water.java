class Solution {
    public int maxArea(int[] height) {
       int max=0;
       int l=0, r=height.length-1;
       while(l<r){
           int cur_cap= Math.min(height[l], height[r]) * (r-l);
           max= Math.max(max, cur_cap);
           if(height[l] < height[r]) l++;
           else r--;
       }
       return max; 
    }
}