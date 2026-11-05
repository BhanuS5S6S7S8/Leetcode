class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        if(root == null) return ans ; 

        Queue<TreeNode> qu = new LinkedList<>() ; 
        qu.add(root) ;
        while(!qu.isEmpty()){
            int size = qu.size() ; 
            List<Integer> temp = new ArrayList<>() ; 
            for(int i = 0 ; i < size ; i++){
                TreeNode te = qu.poll() ; 
                temp.add(te.val) ; 

                if(te.left != null) qu.add(te.left) ; 
                if(te.right != null) qu.add(te.right) ; 
            }
            ans.add(temp) ; 
        } 
        return ans ; 
    }
}