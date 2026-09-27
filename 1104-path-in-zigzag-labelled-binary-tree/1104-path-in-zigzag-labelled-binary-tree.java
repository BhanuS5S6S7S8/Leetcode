class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>() ; 
        int le = 1 ;
        int temp = 0 ; 
        while(temp < label){
            temp += le ; 
            le *= 2 ; 
        }
        le /= 2 ; 
        while(label != 1){
            ans.add(label) ; 
            int com = 3 * le - label - 1 ;
            int po = com / 2 ;
            label = po ;
            le /= 2 ; 
        }
        ans.add(1) ; 
        Collections.reverse(ans) ; 
        return ans ; 
    }
}