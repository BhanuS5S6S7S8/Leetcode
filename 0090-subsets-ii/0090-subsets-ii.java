class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        List<Integer> temp = new ArrayList<>() ;
        Arrays.sort(nums) ;  
        power(nums , 0 , ans , temp) ; 
        return ans ;
    }
    public void power(int[] nums , int i , List<List<Integer>> ans , List<Integer> temp ){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp)) ; 
            return ;
        }
        temp.add(nums[i]) ;     
        power(nums , i+1 , ans , temp) ; 
        temp.remove(temp.size()-1) ; 
        while(i < nums.length -1 && nums[i] == nums[i+1]){
            i++ ; 
        }
        power(nums , i+1 , ans , temp) ; 
    }
}