class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int []a= new int[n];
        for(int i=0;i<n;i++){
            capacity[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i=0;i<n;i++){
            if(capacity[i]==0){
                count++;
            }
            else if(additionalRocks !=0 && additionalRocks>=capacity[i]){
                additionalRocks -= capacity[i];
                count++;
                
            }
        }
        return count;
    }
}
