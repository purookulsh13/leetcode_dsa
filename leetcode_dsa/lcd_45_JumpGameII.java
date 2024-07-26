/*
 * Problem : 
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
 */

 class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n-1] = 0;
        
        for(int i=n-2;i>=0;i--){
             int min=Integer.MAX_VALUE;
            for (int j = i+1; j <=Math.min(n-1,i+ nums[i]) ; j++) {
                min=Math.min(min,dp[j]);
            }
            if(min != Integer.MAX_VALUE){
                dp[i]=min+1;
            }
        }
        return dp[0];

    }
}

/*
 * Solution Explanation:
 * 
 * Problem:
 * Given an array of non-negative integers `nums`, where each element represents the maximum jump length from that position, determine the minimum number of jumps needed to reach the last index from the first index.
 * 
 * Approach:
 * 
 * 1. **Initialization**:
 *    - Create a `dp` array of the same length as `nums` and initialize all elements to `Integer.MAX_VALUE` to represent infinity (unreachable).
 *    - Set `dp[n-1]` to 0 since no jumps are needed to reach the end from the last position.
 * 
 * 2. **Backward Traversal**:
 *    - Iterate through the array from the second last element to the first element.
 *    - For each position `i`, check all positions that can be reached with a jump from `i` up to the maximum jump length `nums[i]`.
 *    - Track the minimum jumps needed to reach the end from any of these positions and update `dp[i]` accordingly.
 * 
 * 3. **Return the Result**:
 *    - The value at `dp[0]` will be the minimum number of jumps needed to reach the end from the first position.
 * 
 * Example:
 * 
 * Input: `nums = [2, 3, 1, 1, 4]`
 * Output: `2`
 * 
 * Explanation:
 * - From position 0, jump to position 1 (2 steps ahead).
 * - From position 1, jump to position 4 (3 steps ahead).
 * - Total jumps = 2.
 */