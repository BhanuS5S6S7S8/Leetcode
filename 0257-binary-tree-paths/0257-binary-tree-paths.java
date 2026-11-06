class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>() ; 
        path(root , ans , new StringBuilder() ) ; 
        return ans ; 
    }
    public void path(TreeNode root , List<String> ans , StringBuilder st){
        if(root == null){
            return ; 
        }
        int len = st.length() ;
        if(st.length() > 0) st.append("->") ; 
        st.append(root.val) ; 

        if(root.left == null && root.right == null){
            ans.add(st.toString()) ; 
        }else{
            path(root.left , ans , st) ; 
            path(root.right , ans , st) ;
        }

        st.setLength(len) ;  
    }
}