class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>() ; 
        for(int n : nums){
            if(hm.getOrDefault(n,0) != 2){
                hm.put(n , hm.getOrDefault(n , 0) + 1) ; 
            } 
        }
        int index = 0;
        for (int n : nums) {
            if (hm.get(n) > 0) {
                nums[index++] = n;
                hm.put(n, hm.get(n) - 1);
            }
        }
        return index ;
    }
}