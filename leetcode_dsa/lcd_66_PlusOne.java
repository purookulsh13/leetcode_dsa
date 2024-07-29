/*
 * Problem : You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 * 
 */

 class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[n+1];
        digits[0]=1;
        return digits;
    }
}

/*
 * Solution:
 *          Let's break down the problem: We need to add one to a number represented as an array of digits.
 *          We'll start from the least significant digit (the last element of the array) and work our way to the most significant digit.
 *          
 *          1. We iterate through the array from the end to the beginning.
 *          2. If the current digit is less than 9, we simply increment it by one and return the array because there's no carry-over.
 *          3. If the current digit is 9, we set it to 0 and continue to the next digit to handle the carry-over.
 *          4. If all the digits are 9, we will end up with all zeros in the array. In this case, we need to create a new array with an additional digit at the beginning set to 1.
 *             This new array will represent the number 100...0 (with n zeros).
 *          
 *          The Math:
 *          - When we add one to a number, if the digit is less than 9, we just increment that digit.
 *          - If the digit is 9, it becomes 0, and we carry the one to the next digit.
 *          - We handle the carry for all digits. If we still have a carry after the most significant digit, we need to add a new digit.
 *          
 *          This approach efficiently handles the carry-over and correctly increments the number represented by the array.
 */

