class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String []arr = s.split(" +"); //+ sign to remove multiple (" ") spaces*
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=1;i--){
            sb.append(arr[i]+" ");
        }
        sb.append(arr[0]);
        return sb.toString();
    }
}