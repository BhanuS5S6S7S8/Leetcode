class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        int sum = 0 ; 
        int j = 0 ; 
        int ans = 0 ;

        HashMap<Integer , Integer> hm = new HashMap<>() ;
        hm.put(0,1) ;

        while(j < nums.length){
            sum += nums[j] ; 
            if(hm.containsKey(sum - k)){
                ans += hm.get(sum-k) ; 
            }
            hm.put(sum , hm.getOrDefault(sum , 0 ) + 1 ) ;
            j++ ;  
        }

        return ans ; 
    }
}