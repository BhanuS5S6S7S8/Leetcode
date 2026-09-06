class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> hs = new HashMap<>() ; 
        for(char i : s.toCharArray()){
            hs.put(i , hs.getOrDefault(i , 0) + 1 ) ; 
        }
        StringBuilder str = new StringBuilder() ; 
        while(hs.size() > 0){ 
            int largest = 0 ;
            char ans = ' ' ; 
            for(char i : hs.keySet()){
                if(hs.get(i) > largest){
                    largest = hs.get(i) ;
                    ans = i ;  
                }
            }
            hs.remove(ans) ; 
            for(int i = 0 ; i < largest ; i++){
                str.append(ans) ; 
            }
            largest = 0 ; 
        }
        return str.toString() ; 
    }
}