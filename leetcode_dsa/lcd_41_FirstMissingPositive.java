/*
 * Problem : Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */

 class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 1;
        for(int i=0;i<n;){
            if(nums[i]>n || nums[i]<=0){
                i++;
            }
            else if(nums[nums[i]-1]==nums[i]){
                i++;
            }
            else{
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        
        int i=0;
        for(i=0;i<n;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        
        return nums[i-1]+1;
    }
}


/*
 * Solution Explanation:
 * 
 * Problem:
 * Given an unsorted integer array `nums`, find the smallest missing positive integer.
 * 
 * Approach:
 * 
 * 1. **Edge Case Handling**:
 *    - If the array is empty, the smallest missing positive integer is 1.
 * 
 * 2. **Rearrange the Array**:
 *    - Iterate through the array and place each number in its correct position if it is within the range [1, n].
 *    - Ignore numbers that are out of range (greater than n or non-positive).
 *    - Swap the current number with the number at its target position (nums[i] should be placed at index nums[i] - 1).
 * 
 * 3. **Find the First Missing Positive**:
 *    - Iterate through the array again and find the first index where the number is not equal to the index + 1.
 *    - Return index + 1 as the first missing positive integer.
 * 
 * 4. **Return the Next Number**:
 *    - If all numbers are in their correct positions, return the next number which is nums[i - 1] + 1.
 * 
 * Example:
 * 
 * Input: `nums = [3, 4, -1, 1]`
 * Output: `2`
 * 
 * Explanation:
 * - After rearranging: [1, -1, 3, 4]
 * - The first missing positive integer is 2.
 */