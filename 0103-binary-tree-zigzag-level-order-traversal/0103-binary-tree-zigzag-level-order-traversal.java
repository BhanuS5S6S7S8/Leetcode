class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>() ; 
        int height = 0 ; 
        if(root == null){
            return ans ; 
        }
        Queue<TreeNode> qu = new LinkedList<>() ; 
        qu.add(root) ; 
        while(!qu.isEmpty()){
            height++ ; 
            int siz = qu.size() ; 
            List<Integer> temp = new ArrayList<>() ;
            for(int i = 0 ; i < siz ; i++){
                TreeNode curr = qu.poll() ; 
                temp.add(curr.val) ; 
                if(curr.left != null){
                    qu.add(curr.left) ; 
                }
                if(curr.right != null){
                    qu.add(curr.right) ; 
                }
            }
            if(height%2 == 0){
                Collections.reverse(temp) ; 
            }
            ans.add(temp) ; 
        }
        return ans ;
    }
}