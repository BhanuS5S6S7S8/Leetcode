class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[nums.length + 1] ; 

        int ans[] = new int[2] ; 
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i] ; 
            if(arr[n] != 0){
                ans[0] = n ; 
            }else{
                arr[n] = n ;
            }
        }
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == 0){
                ans[1] = i ;
                break ; 
            }
        }
        return ans ; 
        
    }
}