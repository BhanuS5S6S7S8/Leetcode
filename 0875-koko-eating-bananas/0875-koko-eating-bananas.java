class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1 ; 
        int max = piles[0] ;
        int ans = 0 ;  
        for(int i = 0 ; i < piles.length ; i++){
            if(max < piles[i]){
                max = piles[i] ; 
            }
        }
        while(min <= max){
            int mid = (min + max)/2 ; 
            if(isAble(piles , h , mid)){
                ans = mid ; 
                max = mid-1 ; 
            }else{
                min = mid+1 ; 
            }
        }
        return ans ; 
    }
    public boolean isAble(int[] piles , int h , int mid){
        int sum = 0 ; 
        for(int i = 0 ; i < piles.length ; i++ ){
            sum += Math.ceil((double)piles[i]/mid) ; 
        }
        return sum <= h ; 
    }
}