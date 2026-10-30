class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0] ; 
        int maxPro = 0 ;
        for(int i : prices){
            min = Math.min(min , i) ; 
            maxPro = Math.max(maxPro , i - min) ; 
        }
        return maxPro ; 
    }
}