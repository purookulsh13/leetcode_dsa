/*
 * Problem : You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). 
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The testcases are generated so that the answer will be less than or equal to 2 * 109.

Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right -> Right -> Down -> Down
2. Down -> Down -> Right -> Right

Input: obstacleGrid = [[0,1],[0,0]]
Output: 1
 */

 class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1) return 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    if(obstacleGrid[i][j]==1 || (i!=0 && obstacleGrid[i-1][0] == 0) || (j!=0 && obstacleGrid[i][j-1]==0)){
                        obstacleGrid[i][j]=0;
                    }
                    else{
                        obstacleGrid[i][j]=1;
                    }
                }
                else{
                    if(obstacleGrid[i][j]==1){
                        obstacleGrid[i][j]=0;
                    }
                    else{
                        obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                    }
                }
        
            }
           
        }
         return obstacleGrid[m-1][n-1];
    }
}

/*
 * Solution:
 *          The goal is to find the number of unique paths from the top-left corner to the bottom-right corner in a grid with obstacles.
 *          1. If the starting cell (0,0) has an obstacle, return 0 immediately since no paths can start there.
 *          2. Iterate through each cell in the grid:
 *              - For cells in the first row or first column:
 *                  - If the cell itself or any cell before it in the same row/column has an obstacle, set it to 0 (no path).
 *                  - Otherwise, set it to 1 (since there's only one path to these cells, straight from the start).
 *              - For other cells:
 *                  - If the cell has an obstacle, set it to 0 (no path through this cell).
 *                  - Otherwise, set it to the sum of the values from the cell above it and the cell to the left (paths from those cells).
 *          3. The value in the bottom-right cell will be the number of unique paths to that cell.
 */