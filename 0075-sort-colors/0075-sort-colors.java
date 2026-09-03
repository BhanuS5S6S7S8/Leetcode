class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0 ) +1 ) ; 
        } 
        int ind = 0 ; 
        int zero = hm.getOrDefault(0, 0);
        while (zero > 0) {
            nums[ind++] = 0;
            zero--;
        }

        int one = hm.getOrDefault(1, 0);
        while (one > 0) {
            nums[ind++] = 1;
            one--;
        }

        int tw = hm.getOrDefault(2, 0);
        while (tw > 0) {
            nums[ind++] = 2;
            tw--;
        }
    }
}