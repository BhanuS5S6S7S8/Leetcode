class Solution {
    public int minFlips(String target) {
        int ans = 0 ; 
        char prev = '0' ; 
        for(int i = 0 ; i < target.length() ; i++ ){
            if(target.charAt(i) != prev){
                ans++ ; 
                prev = target.charAt(i) ; 
            }
        }
        return ans ; 
    }
}