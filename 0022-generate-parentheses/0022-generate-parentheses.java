class Solution {
    List<String> l = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String ans = "";
        generation(n, n, ans);
        return l;
    }
    void generation(int open, int close, String ans){
        if(open == 0 && close == 0){
            l.add(ans);
            return;
        }
        if(open != 0){
            generation(open-1, close, ans+'(');
        }
        if(open < close){
            generation(open, close-1, ans+')');
        }
    }
}