/*
 * Problem :There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
    https://leetcode.com/problems/unique-paths/
    Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
 */

class Solution {
    public int uniquePaths(int m, int n) {
       int[][] board = new int[m][n]; 
        
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(row==0 || col==0) 
                    board[row][col] = 1;
                else{
                    board[row][col] = board[row][col-1] + board[row-1][col];
                }
            }
        }
    
        return board[m-1][n-1];
    }
}
/*
 * Solution Explanation:
 * 
 * Problem:
 * Given an `m x n` grid, find the number of unique paths from the top-left corner to the bottom-right corner.
 * You can only move either down or right at any point in time.
 * 
 * Approach:
 * 
 * 1. **Initialize DP Table**:
 *    - Create a 2D array `board` of size `m x n` to store the number of unique paths to each cell.
 * 
 * 2. **Fill DP Table**:
 *    - Iterate through each cell in the grid.
 *    - For the first row and the first column, set the number of paths to 1 because there is only one way to reach any cell in the first row (by moving right) or the first column (by moving down).
 *    - For other cells, the number of ways to reach the cell at (row, col) is the sum of the ways to reach the cell directly above it (row-1, col) and the cell directly to the left of it (row, col-1).
 * 
 * 3. **Return Result**:
 *    - The value in the bottom-right cell `board[m-1][n-1]` gives the number of unique paths from the top-left to the bottom-right of the grid.
 * 
 * Why This Approach:
 * 
 * - **Dynamic Programming**: This approach uses dynamic programming to build up the number of ways to reach each cell in the grid.
 * - **Efficiency**: The solution has a time complexity of O(m*n) and a space complexity of O(m*n), making it efficient for most grid sizes.
 * 
 * Example:
 * 
 * Input: `m = 3`, `n = 7`
 * Output: `28`
 * 
 * Explanation:
 * - Initialize a 3x7 grid.
 * - Fill the grid according to the rules above.
 * - The bottom-right cell contains the number of unique paths, which is 28.
 */