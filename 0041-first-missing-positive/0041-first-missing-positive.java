class Solution {
    public int firstMissingPositive(int[] nums) {

        // Set<Integer> set = new HashSet<>();
        // for(int num : nums) set.add(num);
        // int i = 1;
        // while(set.contains(i)) i++;
        // return i;

        //T.C-> O(n), S.C->O(n); using hashset;

        int n = nums.length;
        for(int i=0;i<n;i++){
            int element = nums[i];
            if(element >= 1 && element <=n){
                int chair = element - 1;
                if(nums[chair] != element){
                    int swap = nums[chair];
                    nums[chair] = nums[i];
                    nums[i] = swap;
                    i--;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i+1 != nums[i]) return i+1;
        }
        return n+1;

        //T.C-> O(n), S.C->)(1)
    }
}