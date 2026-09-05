class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] lis = new int[(matrix.length)*(matrix[0].length)] ; 
        int l = 0 ;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                lis[l] = matrix[i][j] ; 
                l++ ; 
            }
        }
        Arrays.sort(lis) ; 
        return lis[k-1] ; 
    }
}