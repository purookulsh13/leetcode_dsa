/*
 * Problem : Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12

 */

 class Solution {
    public int minPathSum(int[][] grid) {
        for (int j = 1; j < grid[0].length; j++) {
            grid[0][j] += grid[0][j-1];
        }
        for (int i = 1; i < grid.length; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
            }
        }
        return grid[grid.length-1][grid[0].length -1];
    }
}

/*
 * Solution:
 *          The goal is to find the minimum path sum from the top-left corner to the bottom-right corner in a grid.
 *          1. Initialize the first row by updating each cell to be the sum of itself and the cell to its left.
 *          2. Initialize the first column by updating each cell to be the sum of itself and the cell above it.
 *          3. Iterate through each cell starting from (1,1):
 *              - Update each cell to be the sum of itself and the minimum of the cell to its left and the cell above it.
 *              - This ensures that each cell contains the minimum path sum to that cell.
 *          4. The value in the bottom-right cell will be the minimum path sum from the top-left to the bottom-right corner.
 *
 * Explanation:
 *          - By initializing the first row and column, we set up the base cases for the minimum path sum.
 *          - For each subsequent cell, we calculate the minimum path sum by considering the minimum path sum of the cell to its left and the cell above it.
 *          - This approach ensures that we always have the minimum path sum to each cell as we iterate through the grid.
 *          - Finally, we return the value in the bottom-right cell, which contains the minimum path sum to that cell.
 */