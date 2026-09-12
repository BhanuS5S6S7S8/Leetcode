class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        power(nums , 0 , ans , new ArrayList<>()) ;
        return ans ; 
    }
    public void power(int[] nums , int i , List<List<Integer>> ans , List<Integer> temp ){
        if(i == nums.length ){
            ans.add(new ArrayList<Integer>(temp) ); 
            return ; 
        }

        temp.add(nums[i]) ; 
        power(nums , i+1 , ans , temp) ; 
        temp.remove(temp.size() -1 ); 
        power(nums , i+1 , ans , temp) ; 
    }
}