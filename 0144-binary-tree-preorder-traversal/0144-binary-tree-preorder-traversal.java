class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ; 
        if(root == null){
            return ans ; 
        }
        Stack<TreeNode> st = new Stack<>() ; 
        st.add(root) ; 
        while(!st.isEmpty()){
            TreeNode curr = st.pop() ;
            ans.add(curr.val) ; 
            if(curr.right != null){
                st.push(curr.right) ; 
            }
            if(curr.left != null){
                st.push(curr.left) ; 
            }
        }
        return ans ;
    }
}
