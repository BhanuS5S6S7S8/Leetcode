class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0){
            return 0 ; 
        }

        int[][] dp = new int[obstacleGrid.length+1][obstacleGrid[0].length+1] ; 
        if(obstacleGrid[0][0] == 1){
            return 0 ; 
        }
        dp[1][1] = 1 ; 

        for(int i = 1 ; i <= obstacleGrid.length ; i++ ){
            for(int j =1 ; j <= obstacleGrid[0].length ; j++ ){
                if(i == 1 && j == 1) continue ; 
                if(obstacleGrid[i-1][j-1] == 1){
                    dp[i][j] = 0 ; 
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1] ;
                } 
            }
        }
        return dp[obstacleGrid.length][obstacleGrid[0].length] ; 
    }
}