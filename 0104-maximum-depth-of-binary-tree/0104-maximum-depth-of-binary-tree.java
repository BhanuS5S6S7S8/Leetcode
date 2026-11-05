class Solution {
    public int maxDepth(TreeNode root) {
        int ans = 0 ;
        if(root == null) return ans ; 
        Queue<TreeNode> qu = new LinkedList<>() ;
        qu.add(root) ;
        while(!qu.isEmpty()){
            int size = qu.size() ;
            ans++ ;  
            for(int i = 0 ; i < size ; i++){
                TreeNode node = qu.poll() ; 
                if(node.left != null) qu.add(node.left) ; 
                if(node.right != null) qu.add(node.right) ; 
            }
        }
        return ans ;
    }
}