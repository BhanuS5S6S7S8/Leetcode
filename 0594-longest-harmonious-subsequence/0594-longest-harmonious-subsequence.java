class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer , Integer> hs = new HashMap<>() ; 
        for(int n : nums){
            hs.put(n , hs.getOrDefault(n , 0) + 1 ) ;  
        }
        int ans = 0 ;
        for(int i : hs.keySet()){
            if(hs.containsKey(i+1)){
                ans = Math.max(ans , hs.get(i) + hs.get(i+1)) ; 
            }
        }
        return ans ; 
    }
}