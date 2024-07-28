/*
 * Problem : Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0] 
 *
 */
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(i==j)
                    continue;
                if(nums[i]>nums[j])
                    ++cnt;
            }
            arr[i] = cnt;
        }
        
        return arr;
    }
}

/*
 * Solution:
 *          Let's understand the problem step by step:
 *          1. We are given an array `nums` and we need to find out how many numbers are smaller than the current number at each index.
 *          2. We create a new array `arr` of the same length as `nums` to store the results.
 *          3. We use a nested loop to compare each element with every other element in the array:
 *              - For each element at index `i`, we initialize a counter `cnt` to 0.
 *              - We then compare `nums[i]` with every other element `nums[j]`.
 *              - If `nums[i]` is greater than `nums[j]`, we increment the counter `cnt`.
 *              - If `i` and `j` are the same, we skip the comparison to avoid comparing the element with itself.
 *          4. After comparing `nums[i]` with all other elements, we store the count `cnt` in `arr[i]`.
 *          5. Finally, we return the `arr` array which contains the count of numbers smaller than the current number at each index.
 */