class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        List<Integer> temp = new ArrayList<>() ; 
        backtrak(nums , 0 , ans , temp ) ; 
        return ans ; 
    }
    public void backtrak(int[] nums , int ind , List<List<Integer>> ans , List<Integer> temp) {
        if(temp.size() >= 2){
            ans.add(new ArrayList<>(temp)) ;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = ind ; i < nums.length ; i++ ){
            if(set.contains(nums[i])){
                continue ; 
            }
            if(temp.size() == 0 || nums[i] >= temp.get(temp.size() - 1)){
                set.add(nums[i]) ; 
                temp.add(nums[i]) ; 
                backtrak(nums , i+1 , ans , temp) ; 
                temp.remove(temp.size() -1) ;
            }
        }
    }
}