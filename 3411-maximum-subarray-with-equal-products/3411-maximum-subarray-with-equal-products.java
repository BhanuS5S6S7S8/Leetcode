class Solution {
    public int maxLength(int[] nums) {
        int ans = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            long pro = 1 ; 
            int g = 0 ; 
            long l = 1 ; 
            for(int j = i ; j < nums.length ; j++ ){
                pro *= nums[j] ; 
                g = gcd(g, nums[j]) ; 
                l = lcm(l , nums[j]) ;

                if(pro == (long)g*l){
                    ans = Math.max(ans , j - i + 1) ; 
                } 
            }
        }
        return ans ; 
    }
    public int gcd(int i , int j ){
        if(j == 0){
            return i ;
        }
        return gcd(j , i%j) ; 
    }
    public long lcm(long i , long j ){
        return (i/gcd((int) i , (int) j) * j ) ; 
    }
}