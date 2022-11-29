class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        HashMap<Character, Integer> freqT = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            freqT.put(ch, freqT.getOrDefault(ch, 0)+1);
        }
        HashMap<Character, Integer> freqS = new HashMap<>();
        int i=-1;
        int j=-1;
        int curCount=0;
        int maxCount= t.length();
        while(true){
            //Accquire
            boolean f1= false, f2= false; //to get out from the while loop
            while(i<s.length()-1 && curCount < maxCount){
                i++;
                char ch= s.charAt(i);
                freqS.put(ch, freqS.getOrDefault(ch, 0)+1);
                if(freqS.getOrDefault(ch,0) <= freqT.getOrDefault(ch,0)) curCount++;
                f1=true;
            }
            //Collect and Release
            while(j<i && curCount == maxCount){
                String curString= s.substring(j+1, i+1);
                if(ans.length() == 0 || curString.length() < ans.length()) ans= curString;
                j++;
                char ch= s.charAt(j);
                if(freqS.get(ch) == 1) freqS.remove(ch);
                else freqS.put(ch, freqS.get(ch)-1);
                if(freqS.getOrDefault(ch,0) < freqT.getOrDefault(ch,0)) curCount--;
                f2=true;
            }
            if(f1 == false && f2 == false) break;
        }
        return ans;
    }
}