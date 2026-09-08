class Solution {
    public int numSub(String s) {
        long ans = 0 ; 
        long count = 0 ; 
        int r = 0 ;
        while(r < s.length()){
            if(s.charAt(r) != '1'){
                count = 0 ; 
            }else{
                count++ ; 
            }
            r++ ;
            ans += count ; 
        } 
        return (int)(ans % 1000000007);
    }
}