/*
 * Problem :
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 */

 class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        backtrace(target,comb,0,candidates,li);
        return li;
    }

    public void backtrace(int target,LinkedList<Integer> comb,int start,int[] candidates,List<List<Integer>> li){
        if(target==0){
            li.add(new ArrayList<Integer>(comb));
            return;
        }
        else if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;++i){
            comb.add(candidates[i]);
            backtrace(target-candidates[i],comb,i,candidates,li);
            comb.removeLast();
        }
    }
}

/*
 * Solution Explanation:
 * 
 * Problem: Given a set of candidate numbers and a target number, find all unique combinations of candidates where the candidate numbers sum up to the target. Each number in candidates may be used multiple times.
 * 
 * Approach:
 * 
 * 1. Create a list `result` to store all valid combinations.
 * 
 * 2. Use a `LinkedList` called `combination` to store the current combination being explored.
 * 
 * 3. Start the backtracking process with the `backtrace` function:
 *    - If `target` becomes zero, add a copy of the current `combination` to `result` as it is a valid combination.
 *    - If `target` becomes negative, return as no valid combination can be found.
 * 
 * 4. Iterate through the candidates array starting from the current index:
 *    - Add the current candidate to `combination`.
 *    - Recursively call `backtrace` with the updated target, including the current candidate.
 *    - After recursion, remove the last added candidate to backtrack and explore other possible combinations.
 * 
 * 5. Return the list `result` containing all the unique combinations that sum up to the target.
 */