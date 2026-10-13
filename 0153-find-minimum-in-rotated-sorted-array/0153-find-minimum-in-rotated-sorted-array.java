class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE ;
        for(int j : nums){
            if(min > j){
                min = j ;
            }
        }
        return min ; 
    }
}