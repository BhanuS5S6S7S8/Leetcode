class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0 ; 
        }
        Queue<TreeNode> qu = new LinkedList<>() ; 
        qu.add(root) ;
        int depth = 0 ;

        while(!qu.isEmpty()){
            int size = qu.size() ; 
            depth++ ; 
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = qu.poll() ; 
                if(curr.left != null){
                    qu.add(curr.left) ; 
                }
                if(curr.right != null){
                    qu.add(curr.right) ; 
                }
            }
        }
        return depth ; 
    }
}