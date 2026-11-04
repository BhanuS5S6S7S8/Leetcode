class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>() ; 
        
        postorder(root , li) ; 
        return li ; 
    }
    public void postorder(TreeNode root , List<Integer> li){
        if(root == null) return ; 

        postorder(root.left, li) ;
        postorder(root.right , li) ; 
        li.add(root.val) ;  
    }
}