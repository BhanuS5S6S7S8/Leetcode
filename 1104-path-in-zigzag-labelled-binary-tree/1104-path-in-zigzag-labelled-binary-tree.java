class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>() ; 
        int level = 1 ; 
        int temp = 0 ;
        while(temp < label){
            temp += level ;
            level *= 2 ; 
        }
        level /= 2 ;

        while(label != 1){
            ans.add(label) ;
            int com = 3*level - label -1 ; 
            int par = com/2 ;
            label = par ; 
            level /= 2 ; 
        }
        ans.add(1) ; 
        Collections.reverse(ans) ; 
        return ans ; 
    }
}