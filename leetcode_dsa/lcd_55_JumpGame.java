/*
 * Problem : You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */

 class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) 
            return true;
        int max=0;
        for(int i=0;i<nums.length-1 && max>=i;i++){
           if(max<i+nums[i]){
               max=i+nums[i];
           }
            if(max>=nums.length-1) 
                return true;
        }
        return false;
    }
}


/*
 * Solution Explanation:
 * 
 * Problem:
 * Determine if you can reach the last index of the array `nums` starting from the first index,
 * given that each element in the array represents the maximum jump length from that position.
 * 
 * Approach:
 * 
 * The approach used here is Greedy, which efficiently computes whether we can reach the last index.
 * 
 * 1. **Handle Single Element Case**:
 *    - If the array has only one element, return true because we're already at the last index.
 * 
 * 2. **Initialize Maximum Reach**:
 *    - Initialize `max` to 0, which represents the farthest index we can reach at any point.
 * 
 * 3. **Iterate Through the Array**:
 *    - For each index `i`:
 *      - If `max` is less than `i`, it means we can't reach this position, so the loop will break.
 *      - Update `max` to the maximum of its current value and `i + nums[i]`.
 *      - If `max` is greater than or equal to the last index (`nums.length - 1`), return true.
 * 
 * 4. **Return Result**:
 *    - After the loop, if `max` is still less than the last index, return false.
 * 
 * Why This Approach:
 * 
 * - **Efficiency**: The Greedy approach ensures O(n) time complexity, making it fast for large input sizes.
 * - **Space Complexity**: The algorithm uses O(1) additional space, making it very space-efficient.
 * 
 * Example:
 * 
 * Input: `nums = [2,3,1,1,4]`
 * Output: `true`
 * 
 * Explanation:
 * - Start at index 0: max = 0 + nums[0] = 2
 * - Index 1: max = max(2, 1 + nums[1]) = max(2, 4) = 4 (can reach the end)
 * - Since max >= nums.length - 1, return true.
 */