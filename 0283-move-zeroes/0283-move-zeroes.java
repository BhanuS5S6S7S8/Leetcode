class Solution {
    public void moveZeroes(int[] nums) {
        int[] num = new int[nums.length] ; 
        int ind = 0 ;
        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] != 0 ){
                num[ind] = nums[i] ; 
                ind++ ; 
            }
        }
        for(int i = 0 ; i < ind ; i++){
            nums[i] = num[i] ; 
        }for(int i = ind ; i< nums.length ; i++){
            nums[i] = 0 ; 
        }
    }
}