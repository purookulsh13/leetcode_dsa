/*
 * Problem : You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

 class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}


/*
 * Solution:
 *          The problem can be visualized as finding the number of ways to reach the nth step.
 *          If you are at the ith step, you could have reached there either from (i-1)th step or from (i-2)th step.
 *          Thus, the number of ways to reach the ith step is the sum of the number of ways to reach the (i-1)th step and the (i-2)th step.
 *          
 *          This is a classic dynamic programming problem where:
 *          - dp[i] represents the number of ways to reach the ith step.
 *          - We initialize dp[0] = 1 (1 way to stay at the ground) and dp[1] = 1 (1 way to reach the first step).
 *          - For each step from 2 to n, we calculate dp[i] as dp[i-1] + dp[i-2].
 *          
 *          This approach efficiently computes the number of ways to reach the nth step using an iterative method, which ensures optimal time and space complexity.
 */