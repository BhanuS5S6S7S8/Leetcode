class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true ; 
        }
        return check(root.left , root.right) ; 
    }
    public boolean check(TreeNode lef , TreeNode rig){
        if(lef == null && rig == null){
            return true ;
        }if(lef == null || rig == null){
            return false ; 
        }if(lef.val != rig.val){
            return false ;
        }if(!check(lef.left , rig.right)){
            return false ; 
        }if(!check(lef.right , rig.left)){
            return false ; 
        }

        return true ;
    }
}