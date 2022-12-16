class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int rows= box.length;
        int cols= box[0].length;
        for(int i=0;i<rows;i++){
            for(int j=cols-1;j>=0;j--){
                if(box[i][j] == '#'){
                    for(int k=j;k<cols-1;k++){
                        if(box[i][k+1] == '.'){
                            box[i][k+1]='#';
                            box[i][k]='.';
                        }
                        else break;
                    }
                }
            }
        }
        char [][]tilted= new char[cols][rows];
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                tilted[i][j]=box[j][i];
            }
            int start=0;
            int end=rows-1; //cols for tilted array;
            while(start<end){
                char swap= tilted[i][start];
                tilted[i][start]= tilted[i][end]; 
                tilted[i][end]= swap;
                start++;
                end--;
            }
        }
        return tilted;
    }
}