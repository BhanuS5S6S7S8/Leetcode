class Solution {

    //  25
    public int splitArray(int[] nums, int k) {
        int min = nums[0] ; 
        int max = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            max += nums[i] ; 
            if(nums[i] > min){
                min = nums[i] ; 
            }
        } 
        int ans = 0 ;
        while(min <= max){
            int mid = ( min + max )/2 ; 
            if(isAble(mid , k , nums)){
                ans = mid ; 
                max = mid-1 ;
            }else{
                min = mid+1 ; 
            }
        }
        return ans ; 
    }
    public boolean isAble(int mid , int k , int[] nums){
        int stu = 1 ; 
        int sum = 0 ; 
        for(int i = 0 ; i < nums.length ; i++ ){
            if((sum + nums[i] ) > mid ){
                stu++ ; 
                sum = nums[i] ; 
            }else{
                sum += nums[i] ;
            }
        }

        return ( stu <= k ) ;
    }
}