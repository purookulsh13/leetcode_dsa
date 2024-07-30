/*
 * Problem : Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 */

 class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> li = new ArrayList<>();
       backtrack(nums,0,new ArrayList<Integer>(),li); 
       return li;
    }

    public void backtrack(int[] nums,int start,List<Integer> track,List<List<Integer>> li){
        li.add(new ArrayList<>(track));
        for(int i=start;i<nums.length;i++){
            track.add(nums[i]);
            backtrack(nums,i+1,track,li);
            track.remove(track.size()-1);
        }
    }
}


/*
 * Solution:
 *          This solution uses a backtracking approach to generate all possible subsets.
 *          The main idea is to explore each subset by either including or excluding each element.
 *          
 *          1. Create a result list to store all the subsets.
 *          2. Use a helper method 'backtrack' which takes the current array, starting index, current subset being built, and the result list.
 *          3. In the backtrack method:
 *             - Add the current subset to the result list.
 *             - Iterate over the elements starting from the 'start' index.
 *             - Include the current element in the subset and recursively call the backtrack method with the next starting index.
 *             - Remove the last element from the current subset to explore the subsets without the current element.
 *          
 *          This ensures that all possible combinations are explored and added to the result list.
 *          
 *          The time complexity of this algorithm is O(2^n) since there are 2^n possible subsets.
 *          The space complexity is O(n) for the recursion stack and current subset list.
 */