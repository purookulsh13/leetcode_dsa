/*
 * Problem : You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.

 

Example 1:


Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
Output: [[9,9],[8,6]]
Explanation: The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
Example 2:


Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
Output: [[2,2,2],[2,2,2],[2,2,2]]
Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid. 
 */

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int[][] res = new int[len-2][len-2];
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                int max = 0;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        max = Math.max(max, grid[row][col]);
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
}



/*
 * Solution Explanation:
 * 
 * Problem:
 * Given an n x n integer matrix grid, generate an (n - 2) x (n - 2) matrix `res` where each element in `res[i][j]` is the largest value in the 3x3 submatrix of `grid` centered around row `i+1` and column `j+1`.
 * 
 * Approach:
 * 
 * 1. **Initialization**:
 *    - Determine the length of the input matrix `grid` and initialize the result matrix `res` of size (len-2) x (len-2).
 * 
 * 2. **Iterate Through the Grid**:
 *    - Loop through the possible starting indices `i` and `j` for the top-left corner of each 3x3 submatrix.
 *    - For each position `(i, j)` in the result matrix `res`, find the maximum value in the corresponding 3x3 submatrix in `grid`.
 * 
 * 3. **Find Maximum Value in Submatrix**:
 *    - For each 3x3 submatrix starting at `(i, j)`, iterate through its elements to find the maximum value.
 *    - Store the maximum value in `res[i][j]`.
 * 
 * 4. **Return the Result**:
 *    - After processing all possible 3x3 submatrices, return the result matrix `res`.
 * 
 * Example:
 * 
 * Input:
 * grid = [
 *   [9, 9, 8, 1],
 *   [5, 6, 2, 6],
 *   [8, 2, 6, 4],
 *   [6, 2, 2, 2]
 * ]
 * 
 * Output:
 * [
 *   [9, 9],
 *   [8, 6]
 * ]
 * 
 * Explanation:
 * - The 3x3 submatrix starting at (0, 0) has a maximum value of 9.
 * - The 3x3 submatrix starting at (0, 1) has a maximum value of 9.
 * - The 3x3 submatrix starting at (1, 0) has a maximum value of 8.
 * - The 3x3 submatrix starting at (1, 1) has a maximum value of 6.
 */