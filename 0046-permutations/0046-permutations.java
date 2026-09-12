class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        per(nums , 0 , ans ) ;
        return ans ;
    }
    public void per(int[] nums , int i , List<List<Integer>> ans ){
        if(nums.length == i ){
            List<Integer> temp = new ArrayList<>() ; 
            for (int x : nums) {
                temp.add(x) ;
            }
            ans.add(temp);
            return ;
        }
        for(int idx = i ; idx < nums.length ; idx++){
            swap(nums,idx , i) ; 
            per(nums , i+1 , ans ) ; 
            swap(nums,i , idx) ; 
        }
    }
    public void swap(int[] nums , int l , int r){
        int a = nums[l] ; 
        nums[l] = nums[r] ; 
        nums[r] = a ;
    }
}