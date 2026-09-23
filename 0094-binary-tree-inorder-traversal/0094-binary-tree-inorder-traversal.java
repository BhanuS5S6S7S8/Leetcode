
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ; 
        in(root , ans) ; 
        return ans ; 
    }
    public void in(TreeNode root , List<Integer> ans ){
        if(root == null){
            return ; 
        }
        in(root.left , ans ) ; 
        ans.add(root.val) ; 
        in(root.right , ans ) ; 
    }
}