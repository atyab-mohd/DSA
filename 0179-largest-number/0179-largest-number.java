class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String []s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = String.valueOf(nums[i]);
        }
        for(int i=0;i<n;i++){
            int m=i;
            for(int j=i+1;j<n;j++){
                String s1=s[m]+s[j];
                String s2=s[j]+s[m];
                if(s2.compareTo(s1)>0){
                    m=j;
                }
            }
            String swap = s[i];
            s[i] = s[m];
            s[m] = swap;
        }
        if(s[0].equals("0")){
            return "0";
        }
        String ans = "";
        for(int i=0;i<n;i++){
            ans +=s[i];
        }
        return ans;
        
    }
}