class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>() ; 
        if(root == null){
            return ans ; 
        }

        Queue<TreeNode> qu = new LinkedList<>() ; 
        qu.add(root) ; 
        while(!qu.isEmpty()){
            int size = qu.size() ; 
            double dou = 0 ; 
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = qu.poll() ;
                dou += curr.val ; 
                if(curr.left != null){
                    qu.add(curr.left) ; 
                }if(curr.right != null){
                    qu.add(curr.right) ; 
                }
            }
            ans.add(dou/size) ; 
        }
        return ans ; 
    }
}