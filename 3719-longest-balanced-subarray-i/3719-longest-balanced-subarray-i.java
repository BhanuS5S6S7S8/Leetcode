class Solution {
    public int longestBalanced(int[] nums) {
        int ans = 0 ;
        for(int i = 0; i < nums.length ; i++){
            int j = i ;
            HashSet<Integer> hsEven = new HashSet<>() ; 
            HashSet<Integer> hsOdd = new HashSet<>() ; 
            while(j < nums.length){
                if(nums[j]%2 == 0 ){
                    hsEven.add(nums[j]) ; 
                }else{
                    hsOdd.add(nums[j]) ; 
                }
                if(hsEven.size() == hsOdd.size()){
                    ans = Math.max(ans , j-i+1) ; 
                }
                j++ ; 
            } 
        }
        return ans ; 
    }
}