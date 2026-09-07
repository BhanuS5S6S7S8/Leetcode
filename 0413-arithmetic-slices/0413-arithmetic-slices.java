class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length <= 2){
            return 0 ; 
        }
        int l = 0 ; 
        int r = 2 ;
        int count = 0 ;  
        int ans = 0 ; 
        while(r < nums.length){
            if((nums[r-1]-nums[r-2]) == (nums[r]-nums[r-1])){
                count++ ;
                ans += count ;  
            }else{
                count = 0 ;
            }
            r++ ; 
        }

        return ans ; 
    }
}