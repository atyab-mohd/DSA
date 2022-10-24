class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int l=1, r=position[n-1]-position[0];
        int ans=1;
        while(l<=r){
            int mid=(l+r)/2;
            if(isDistancePossible(position,m,mid)){
                ans=mid;
                l=mid+1;
            }
            else
                r=mid-1;
        }
        return ans;
    }
    public boolean isDistancePossible(int []position, int m, int dist){
        int noOfBallsPlaced=1;
        int n=position.length;
        int lastPosition= position[0];
        for(int i=1;i<n && noOfBallsPlaced<m; i++){
            if(position[i]>=lastPosition + dist){
                noOfBallsPlaced++;
                lastPosition=position[i];
            }
        }
        if(noOfBallsPlaced<m) return false;
        else return true;
    }
}
