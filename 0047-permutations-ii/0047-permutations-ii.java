class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>() ;
        per(nums , 0 , nums.length-1 , ans) ;
        List<List<Integer>> answer = new ArrayList<>(ans) ;
        return answer ; 
    }
    public void per(int[] nums , int l , int r , Set<List<Integer>> ans ){
        if(l==r){
            List<Integer> temp = new ArrayList<>() ; 
            for(int x : nums ){
                temp.add(x) ; 
            }
            ans.add(temp) ; 
            return ; 
        }
        for(int i = l ; i <= r ; i++){
            swap(nums , l , i) ; 
            per(nums , l+1 , r , ans) ;
            swap(nums , l , i) ; 
        }
    }
    public void swap(int[] nums , int a , int b){
        int temp = nums[a] ; 
        nums[a] = nums[b] ; 
        nums[b] = temp ; 
    }
}