class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = new int[nums.length +1 ]; 

        for(int n : nums){
            if(arr[n] != 0){
                return n ; 
            }
            arr[n] = n ; 
        }

        return -1 ; 
    }
}