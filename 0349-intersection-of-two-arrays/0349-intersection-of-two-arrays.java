class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> hm = new HashMap<>() ; 
        for(int i : nums1 ){
            hm.put(i , hm.getOrDefault(i,0) +1 ) ; 
        }
        Set<Integer> st = new HashSet<>() ; 
        for(int i = 0 ; i < nums2.length ; i++){
            if(hm.containsKey(nums2[i])){
                st.add(nums2[i]) ; 
            }
        }
        int[] ans = new int[st.size()];
        int index = 0;
        for (int num : st) {
            ans[index++] = num;
        }
        return ans;
    }
}