class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n= asteroids.length;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            if(st.empty() || asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                while(true){    
                    int peek= st.peek();
                    if(peek<0){
                        st.push(asteroids[i]);
                        break;
                    }
                    else if(peek== -asteroids[i]){
                        st.pop();
                        break;
                    }
                    else if(peek > -asteroids[i]){
                        break;
                    }
                    else{ //else if(st.peek() < -asteriod[i]){
                        st.pop();
                        if(st.empty()){
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int []ans= new int[st.size()];
        for(int i=st.size()-1; i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}