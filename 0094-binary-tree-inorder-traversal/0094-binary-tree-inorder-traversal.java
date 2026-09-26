
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ; 
        if(root == null){
            return ans ; 
        }

        Stack<TreeNode> st1 = new Stack<>() ; 
        TreeNode curr = root ; 
        while(curr != null || !st1.isEmpty()){
            while(curr != null){
                st1.push(curr) ; 
                curr = curr.left ; 
            }
            curr = st1.pop() ; 
            ans.add(curr.val) ;

            curr = curr.right ; 
        }
        return ans ; 
    }
}