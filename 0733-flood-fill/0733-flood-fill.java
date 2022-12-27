class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currColor = image[sr][sc];
        if(currColor == color) return image;
        dfs(image, sr, sc, currColor, color);
        return image;
    }
    void dfs(int [][]image, int sr, int sc, int currColor, int color){
        if(sr<0 || sr>image.length-1 || sc<0 || sc>image[0].length-1) return;
        if(image[sr][sc] == currColor){
            image[sr][sc] = color; //new color
            dfs(image, sr-1, sc, currColor, color);
            dfs(image, sr+1, sc, currColor, color);
            dfs(image, sr, sc-1, currColor, color);
            dfs(image, sr, sc+1, currColor, color);
        }
    }
}