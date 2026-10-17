class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[][] board = new int[n][n] ; 
        nQueen(board , 0 , ans) ; 
        return ans ; 
    }
    public void nQueen(int[][] board , int row ,List<List<String>> ans){
        if(row == board.length){
            List<String> list = new ArrayList<>();
            for(int i = 0 ; i < board.length ; i++){
                StringBuilder st = new StringBuilder() ; 
                for(int j = 0 ; j < board.length ;j++ ){
                    if(board[i][j] == 1){
                        st.append('Q') ; 
                    }else{
                        st.append('.') ; 
                    }
                }list.add(st.toString()) ; 
            }
            ans.add(list) ; 
            return;
        }
        for(int col = 0 ; col < board.length ; col++){
            if(isSafe(board,  row , col)){
                board[row][col] = 1 ;
                nQueen(board , row +1 , ans ) ; 
                board[row][col] = 0 ; 
            }
        }
    }
    public boolean isSafe(int[][] board , int row ,int col){
        for(int i = 0 ; i < row ; i++){
            if(board[i][col] == 1){
                return false ; 
            }
        }

        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < board.length) {
            if (board[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}