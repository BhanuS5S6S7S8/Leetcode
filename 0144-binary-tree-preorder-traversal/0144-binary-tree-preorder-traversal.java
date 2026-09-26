class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ; 
        if(root == null){
            return ans ; 
        }

        Stack<TreeNode> st1 = new Stack<>() ; 
        st1.push(root) ; 
        while(!st1.isEmpty()){
            TreeNode curr = st1.pop() ; 
            ans.add(curr.val) ; 
            if(curr.right != null){
                st1.push(curr.right) ; 
            }
            if(curr.left != null){
                st1.push(curr.left) ; 
            }
        }
        return ans ; 
    }
}
