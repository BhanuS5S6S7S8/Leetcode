class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  ans = new ArrayList<>() ; 
        List<Integer> temp = new ArrayList<>() ; 
        Queue<TreeNode> qu = new LinkedList<>() ; 
        lev(root , ans , temp , qu) ; 
        return ans ; 
    }
    public void lev(TreeNode root , List<List<Integer>> ans , List<Integer> temp , Queue<TreeNode> qu){
        if(root == null){
            return ; 
        }
        qu.add(root) ; 
        qu.add(null) ; 
        while(!qu.isEmpty()){
            TreeNode curr = qu.remove() ; 
            if(curr == null){
                ans.add(temp) ; 
                temp = new ArrayList<>() ; 
                if(!qu.isEmpty()){
                    qu.add(null) ; 
                }
            }else{
                temp.add(curr.val) ; 
                if(curr.left != null){
                    qu.add(curr.left) ; 
                }
                if(curr.right != null){
                    qu.add(curr.right) ; 
                }
            }
        }
    }
}