class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = new int[arr.length] ;
        for(int i = 0 ; i < arr.length ; i++){
            sorted[i] = arr[i] ; 
        }
        Arrays.sort(sorted) ; 
        HashMap<Integer , Integer> hm = new HashMap<>() ;
        int position = 1 ;  
        for(int i = 0 ; i < arr.length ; i++ ){
            if(hm.getOrDefault(sorted[i] , 0) >= 1){
                continue ; 
            }
            hm.put(sorted[i] , position) ;
            position++ ;  
        }
        int[] an = new int[arr.length] ; 
        int ind = 0 ; 
        for(int i = 0 ; i < arr.length ; i++){
            an[ind] = hm.get(arr[i]) ; 
            ind++ ; 
        }
        return an ; 
    }
}