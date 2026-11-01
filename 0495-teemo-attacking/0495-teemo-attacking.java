class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0 ; 
        for(int i = 0 ; i < timeSeries.length-1 ; i++ ){
            int diff = timeSeries[i+1] - timeSeries[i] ; 
            ans += Math.min(diff , duration) ;  
        }
        if(timeSeries.length > 0){
            ans += duration ; 
        }
        return ans ; 
    }
}