class Solution {
    String[] start = { "" , "" , "abc" ,"def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"} ;  
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>() ; 
        if(digits.length() == 0){
            return ans ; 
        }
        backtrack(digits , 0, new StringBuilder() , ans ) ; 
        return ans ; 
    }
    public void backtrack(String digits , int index , StringBuilder st , List<String> ans ){
        if(index == digits.length()){
            ans.add(st.toString()) ;
            return ;  
        }
        String letter = start[digits.charAt(index) - '0'] ; 

        for(int i = 0 ; i < letter.length() ; i++){
            st.append(letter.charAt(i)) ; 
            backtrack(digits, index+1 , st , ans) ; 
            st.deleteCharAt(st.length()-1) ; 
        }
    }
}