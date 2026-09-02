class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            int pro = 1 ;  
            for(int j = i ; j < nums.length ; j++){
                pro *= nums[j] ; 
                if(pro < k){
                    ans++ ; 
                }else{
                    break ; 
                }
            }
        }
        return ans ; 
    }
}