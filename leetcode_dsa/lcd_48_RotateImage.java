/*
 * Problem :
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 */

 class Solution {
    public void rotate(int[][] matrix) {
          int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++){   //transpose
            for(int j = i + 1; j < m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
/*
 * Solution Explanation:
 * 
 * Problem:
 * Given an `n x n` 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * 
 * Approach:
 * 
 * 1. **Transpose the Matrix**:
 *    - Swap elements across the main diagonal.
 *    - For each element `matrix[i][j]`, swap it with `matrix[j][i]` where `j > i`.
 * 
 * 2. **Reverse Each Row**:
 *    - Reverse the elements in each row to complete the 90-degree rotation.
 *    - For each row `i`, swap elements `matrix[i][j]` with `matrix[i][n - j - 1]` where `j < n / 2`.
 */