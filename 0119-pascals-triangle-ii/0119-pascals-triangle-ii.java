class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> curr = new ArrayList<>() ; 
        curr.add(1) ;
        if(r == 0){
            return curr ; 
        }
        for(int i = 1 ; i <= r ; i++ ){
            List<Integer> n = new ArrayList<>() ; 
            n.add(1) ;
            for(int j = 1 ; j < curr.size() ; j++){
                n.add(curr.get(j-1) + curr.get(j)) ;
            } 
            n.add(1) ; 
            curr = n ; 
        }
        return curr ; 
    }
}