class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> hm = new HashMap<>() ; 
        int[] ans = new int[Math.min(nums1.length, nums2.length)] ; 
        int index = 0 ; 
        for(int i : nums1 ){
            hm.put(i , hm.getOrDefault(i,0) +1 ) ; 
        }
        for (int num : nums2) {
            if (hm.getOrDefault(num, 0) > 0) {
                ans[index++] = num;
                hm.put(num, hm.get(num) - 1);
            }
        }

        return Arrays.copyOf(ans, index);
    }
}