class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length ;
        while(digits[n-1] == 9){
            n-- ; 
            if(n < 1){
                n = -10 ; 
                break ;
            }
        }
        if(n == -10){
            int[] ans = new int[digits.length+1] ;
            ans[0] = 1; 
            for(int i = 1 ; i <= digits.length ; i++){
                ans[i] = 0 ;
            }
            return ans ; 
        }else if(n==digits.length) {
            int[] ans = new int[digits.length] ;
            for(int i = 0 ; i < digits.length - 1 ; i++){
                ans[i] = digits[i] ; 
            }
            ans[digits.length-1] = digits[digits.length -1] + 1 ; 
            return ans ; 
        }else{
            int[] ans = new int[digits.length] ;
            for(int i = 0 ; i < n  ; i++ ){
                ans[i] = digits[i] ; 
            }
            ans[n - 1] = digits[n - 1] + 1;
            for (int i = n; i < digits.length; i++) {
                ans[i] = 0;
            }
            return ans;
        }
    }
}