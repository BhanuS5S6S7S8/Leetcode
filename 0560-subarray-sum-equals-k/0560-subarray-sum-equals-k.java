class Solution {
    public int subarraySum(int[] nums, int k) {
        int currsum = 0 ;
        int start = 0 ;  
        int i = 0 ; 
        int ans = 0 ; 
        HashMap<Integer , Integer> hm = new HashMap<>() ; 
        hm.put(0,1) ; 

        while(i < nums.length){
            currsum += nums[i] ;
            if(hm.containsKey(currsum - k)){
                ans += hm.get(currsum - k) ; 
            }
            hm.put(currsum , hm.getOrDefault(currsum , 0) + 1) ; 
            i++ ; 
        }
        return ans ; 
    }
}