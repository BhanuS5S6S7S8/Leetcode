class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        List<Integer> temp = new ArrayList<>();
        com(n , k , ans , temp , 1) ;
        return ans ; 
    }
    public void com(int n , int k , List<List<Integer>> ans , List<Integer> temp , int i){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp)) ; 
            return ; 
        }for(int j = i ; j <= n ; j++){
            temp.add(j) ; 
            com(n , k , ans , temp , j+1 ) ;
            temp.remove(temp.size() -1 ) ; 
        }
    }

}