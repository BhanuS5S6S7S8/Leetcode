class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int sub = 0 ; 
        for(int i = 0 ; i < s.length() ; i++ ){
            bool charSeen[128] = {false} ;
            int l = 0 ; 
            for(int j = i ; j < s.length() ; j++ ){
                if(charSeen[s[j]]){
                    break ; 
                }
                charSeen[s[j]] = true;
                l++ ; 
            }
            if(l>sub){
                sub = l ;
            }
            l = 0  ; 
        }
        return sub ; 
    }
};