/*
 * Problem : You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target==matrix[i][j])
                    return true;
            }
        }
        return false;
    }
}

/*
 * Solution:
 *          This solution uses a straightforward approach by iterating through each element of the matrix.
 *          The goal is to check if the target value exists in the matrix.
 *          
 *          1. We iterate through each row of the matrix using a for loop.
 *          2. Within each row, we iterate through each column using another for loop.
 *          3. We compare the current element with the target.
 *          4. If the current element matches the target, we return true.
 *          5. If we finish checking all elements and don't find the target, we return false.
 *          
 *          This solution has a time complexity of O(m*n), where m is the number of rows and n is the number of columns.
 *          Although it is not the most efficient approach, it is simple and ensures that every element is checked.
 */