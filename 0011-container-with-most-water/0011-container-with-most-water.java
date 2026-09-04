class Solution {
    public int maxArea(int[] height) {
        int ans = 0 ; 
        int a = 0 ; 
        int b = height.length-1 ; 
        while(a<b){
            int area = Math.min(height[a] , height[b]) * (b-a) ; 
            ans = Math.max(ans , area) ; 
            if(height[a] < height[b]){
                a++ ; 
            }else {
                b-- ; 
            }
        }
        return ans ; 
    }
}