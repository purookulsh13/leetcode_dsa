/*
 * Problem :
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

 

Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
Example 2:

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 */

 class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[nums[i]];
        }
        return res;
    }
}

/*
 * Solution Explanation:
 * 
 * Problem:
 * Given a zero-indexed array `nums` of distinct integers, construct an array `res` where `res[i] = nums[nums[i]]` for each index `i`.
 * 
 * Approach:
 * 
 * 1. **Initialization**:
 *    - Get the length of the input array `nums`.
 *    - Initialize a new array `res` of the same length to store the result.
 * 
 * 2. **Build the Result Array**:
 *    - Iterate through each element in the input array `nums`.
 *    - For each index `i`, set `res[i]` to `nums[nums[i]]`.
 * 
 * 3. **Return the Result Array**:
 *    - After the loop completes, return the `res` array which contains the desired permutation.
 * 
 * Why This Approach:
 * 
 * - **Direct Mapping**: The solution directly maps each element in the `nums` array to its corresponding element in the `res` array based on the value at `nums[i]`.
 * - **Efficiency**: The solution runs in O(n) time complexity, where `n` is the length of the input array. The space complexity is also O(n) due to the additional array `res`.
 * 
 * Example:
 * 
 * Input: `nums = [0,2,1,5,3,4]`
 * Output: `[0,1,2,4,5,3]`
 * 
 * Explanation:
 * - For `i = 0`, `res[0] = nums[nums[0]] = nums[0] = 0`
 * - For `i = 1`, `res[1] = nums[nums[1]] = nums[2] = 1`
 * - For `i = 2`, `res[2] = nums[nums[2]] = nums[1] = 2`
 * - For `i = 3`, `res[3] = nums[nums[3]] = nums[5] = 4`
 * - For `i = 4`, `res[4] = nums[nums[4]] = nums[3] = 5`
 * - For `i = 5`, `res[5] = nums[nums[5]] = nums[4] = 3`
 */