class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0], high = matrix[n-1][n-1];
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            int x = count(matrix, mid);
            if(x < k){
                low = mid + 1;
            }else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
    // int count(int m[][], int mid){
    //     int cnt = 0, c = m.length-1;
    //     for(int i=0;i<m.length;i++){
    //     //     while(c >= 0 && m[i][c] > mid) c--;
    //     // cnt += (c + 1);
    //         for(int j=0;j<m.length;j++){
    //             if(m[i][j] < mid) cnt++;
    //         }
    //     }
    //     return cnt;
    // }


    int count(int[][] m, int mid) {
        int n = m.length;
        int r = 0, c = n-1;
        int ans = 0;
 
        for(r = 0; r < n; r++) {
            while(c >= 0 && m[r][c] > mid) c--;
 
            ans += (c + 1);
        }
 
        return ans;
    }

}