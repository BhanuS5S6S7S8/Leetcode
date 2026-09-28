class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        int left = height(root.left) ; 
        int right = height(root.right) ; 

        int currDia = left + right ;

        int leftDia = diameterOfBinaryTree(root.left) ; 
        int rightDia = diameterOfBinaryTree(root.right) ;

        return Math.max(currDia , Math.max(leftDia , rightDia)) ;  
    }
    public int height(TreeNode root){
        if(root == null){
            return 0 ; 
        }

        int left = height(root.left) ; 
        int right = height(root.right) ; 

        return Math.max(left , right) + 1 ; 
    }
}