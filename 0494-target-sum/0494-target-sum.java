class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return symbol(nums , 0 , target , 0 ) ; 
    }
    public int symbol(int[] nums ,int i , int target , int ans){
        if(nums.length == i){
            if(ans == target){
                return 1 ;
            }
            return 0 ; 
        }

        int plus =  symbol(nums , i+1 , target , ans + nums[i]) ; 
        int minus =  symbol(nums , i+1 , target , ans - nums[i]) ; 

        return plus + minus ; 
    }
}