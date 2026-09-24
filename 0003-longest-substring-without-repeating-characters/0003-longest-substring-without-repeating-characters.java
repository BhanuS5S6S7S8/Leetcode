class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] st = s.toCharArray() ; 
        int ma = 0 ;
        for(int i = 0 ; i < st.length ; i++){
            boolean[] ch = new boolean[128] ; 
            int le = 0 ;
            for(int j = i ; j < st.length ; j++){
                if(ch[st[j]]){
                    break ; 
                }
                ch[st[j]] = true ; 
                le++ ; 
            }
            ma = Math.max(le, ma) ; 
        }
        return ma ; 
    }
}