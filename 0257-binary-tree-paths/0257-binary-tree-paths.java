
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>() ; 
        StringBuilder st = new StringBuilder() ; 
        path(root , ans , st) ;
        return ans ;
    }
    public void path(TreeNode root , List<String> ans , StringBuilder st){
        if(root == null){
            return ; 
        }

        int len = st.length() ; 
        if(st.length() > 0){
            st.append("->") ; 
        }
        st.append(root.val) ; 

        if(root.left == null && root.right == null){
            ans.add(st.toString()) ;  
        }else{
            if(root.left != null) path(root.left , ans , st) ; 
            if(root.right != null) path(root.right , ans , st) ; 
        }

        st.setLength(len) ; 
    }
}