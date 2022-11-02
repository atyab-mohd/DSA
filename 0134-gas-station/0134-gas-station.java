class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int requiredFule=0, extraFule=0, start=0;
        for(int i=0;i<gas.length;i++){
            extraFule+= gas[i]-cost[i];
            if(extraFule<0){
                requiredFule+=extraFule;
                extraFule=0;
                start=i+1;
            }
        }
        if(extraFule+requiredFule>=0) return start;
        return -1;
    }
}