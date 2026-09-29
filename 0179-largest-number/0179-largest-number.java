class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder st = new StringBuilder() ; 
        for(int i = 0 ; i < nums.length ; i++){
            int max = i ;
            for(int j = i+1 ; j < nums.length ; j++){
                String a = String.valueOf(nums[max]) ;  
                String b = String.valueOf(nums[j]) ;
                if((b + a).compareTo(a + b) > 0){
                    max = j ; 
                }  
            }
            int temp = nums[max] ;
            nums[max] = nums[i] ; 
            nums[i] = temp ; 

            st.append(nums[i]) ; 
        }
        if(st.charAt(0) == '0') {
            return "0";
        }
        return st.toString() ; 
    }
}