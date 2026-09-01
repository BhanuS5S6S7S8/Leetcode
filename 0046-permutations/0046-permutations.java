class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        per(nums , 0 , nums.length -1 , ans ) ; 
        return ans ; 
    }
    public void per(int[] nums , int l , int r , List<List<Integer>> ans ){
        if(l == r){
            List<Integer> temp = new ArrayList<>(); 
            for (int x : nums) { 
                temp.add(x); 
            } 
            ans.add(temp); 
            return;
        }
        for(int i = l ; i <= r ;i++ ){
            swap(nums , l , i ) ; 
            per(nums , l+1 , r , ans ) ; 
            swap(nums , l , i ) ; 
        }
    }
    public void swap(int[] nums , int l , int i){
        int tem = nums[l] ; 
        nums[l] = nums[i] ; 
        nums[i] = tem ; 
    }
}