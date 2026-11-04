class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer,Integer> tr = new TreeMap<>() ; 
        int[] answer = new int[nums.length-k+1] ; 
        int ind = 0 ;
        int left = 0 ; 
        int right = k-1 ; 
        for(int i = left ; i <= right ; i++){
            tr.put(nums[i] , tr.getOrDefault(nums[i] , 0 ) + 1 ) ; 
        }
        right++ ; 
        answer[ind++] = tr.lastKey() ; 
        while(right < nums.length){
            if(tr.get(nums[left]) == 1 ){
                tr.remove(nums[left]) ;
            }else {
                tr.put(nums[left] , tr.get(nums[left]) - 1 ) ; 
            }
            left++ ; 
            tr.put(nums[right] , tr.getOrDefault(nums[right] , 0 ) + 1 ) ; 
            right++ ; 
            answer[ind++] = tr.lastKey() ; 
        }
        return answer ; 
    }
}