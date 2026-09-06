class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>() ; 
        for(int i : nums){
            int x = Math.abs(i) ; 

            if(nums[x-1] < 0){
                ans.add(Math.abs(i)) ; 
            }else{
                nums[x-1] = -nums[x-1] ; 
            }
        }
        return ans ; 
    }
}