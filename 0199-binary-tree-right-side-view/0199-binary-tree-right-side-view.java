class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ; 
        Queue<TreeNode> qu = new LinkedList<>() ; 
        if(root == null){
            return ans ; 
        }
        qu.add(root) ; 
        while(!qu.isEmpty()){
            int si = qu.size() ; 
            for(int i = 0 ; i < si ; i++){
                TreeNode curr = qu.poll() ; 
                if(i == si-1){
                    ans.add(curr.val) ;
                }
                if(curr.left != null){
                    qu.add(curr.left) ; 
                }
                if(curr.right != null){
                    qu.add(curr.right) ;
                }
            }
        }
        return ans ; 
    }
}