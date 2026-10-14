class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";
        
        HashMap<Character,Integer> hs = new HashMap<>() ; 
        HashMap<Character,Integer> fun = new HashMap<>() ; 
        StringBuilder ans = new StringBuilder() ; 
        int ind = Integer.MAX_VALUE;
        int st = 0 ; 
        int left = 0 ; 
        int right = 0 ; 
        int count = t.length() ; 
        for(int i = 0 ; i < t.length() ; i++ ){
            hs.put(t.charAt(i) , hs.getOrDefault(t.charAt(i) , 0 ) + 1 ) ; 
        }
        while(right < s.length()){
            fun.put(s.charAt(right) , fun.getOrDefault(s.charAt(right) , 0) + 1 ) ; 
            if(hs.containsKey(s.charAt(right))  && fun.get(s.charAt(right)) <= hs.get(s.charAt(right))){
                count-- ; 
            }
            while (count == 0) {

                if (right - left + 1 < ind) {
                    ind = right - left + 1;
                    st = left;
                }

                char ch = s.charAt(left);

                fun.put(ch, fun.get(ch) - 1);

                if (hs.containsKey(ch) && fun.get(ch) < hs.get(ch)) {
                    count++;
                }

                if (fun.get(ch) == 0) {
                    fun.remove(ch);
                }

                left++;
            }
            right++ ; 
        } 
        if (ind == Integer.MAX_VALUE) {
            return "";
        }
        for(int i = st ; i < st+ind ; i++ ){
            ans.append(s.charAt(i)) ; 
        }
        return ans.toString() ; 
    }
}