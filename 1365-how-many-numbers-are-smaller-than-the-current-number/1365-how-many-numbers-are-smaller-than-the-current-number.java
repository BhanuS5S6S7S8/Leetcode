class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] an = new int[nums.length] ; 
        int ind = 0 ; 
        int[] count = new int[101] ; 
        HashMap<Integer , Integer> hm = new HashMap<>() ; 
        for(int i = 0 ; i < nums.length ; i++ ){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0 ) + 1 ) ; 
        }
        count[0] = 0 ; 
        for(int i = 1 ; i < 101 ; i++ ){
            count[i] = count[i-1] + hm.getOrDefault (i-1 ,0 ) ; 
        }
        for(int i = 0 ; i < nums.length ; i++){
            an[ind] = count[nums[i]] ; 
            ind++ ; 
        }
        return an ; 
    }
}