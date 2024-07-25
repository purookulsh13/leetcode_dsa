/*
 * Problem :
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
            if(nums[i]<target)
                count++;
        }
        return count;
    }


/*
 * Solution Explanation:
 * 
 * Problem: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 
 * Approach:
 * 
 * 1. Traverse the array from the beginning to the end.
 * 
 * 2. During traversal:
 *    - If the target value matches the current element, return the current index.
 *    - If the target value is greater than the current element, keep a count of elements that are less than the target.
 * 
 * 3. If the target is not found, the `count` will represent the index where the target should be inserted to maintain sorted order.
 * 
 * Note: This solution has a time complexity of O(n), which is not optimal for large arrays.
 * 
 * Optimal Solution (O(log n) Complexity):
 * 
 * Use binary search to achieve O(log n) complexity. Here's the optimized code:
 */

 class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;  // Return the insertion point.
    }
}

/*
 * Solution Explanation:
 * 
 * Problem: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 
 * Approach:
 * 
 * 1. Traverse the array from the beginning to the end.
 * 
 * 2. During traversal:
 *    - If the target value matches the current element, return the current index.
 *    - If the target value is greater than the current element, keep a count of elements that are less than the target.
 * 
 * 3. If the target is not found, the `count` will represent the index where the target should be inserted to maintain sorted order.
 * 
 * Note: This solution has a time complexity of O(n), which is not optimal for large arrays.
 * 
 * Optimal Solution (O(log n) Complexity):
 * 
 * Use binary search to achieve O(log n) complexity. Here's the optimized code:
 */

 class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;  // Return the insertion point.
    }
}

/*
 * Solution Explanation:
 * 
 * Problem: Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 
 * Approach:
 * 
 * 1. Traverse the array from the beginning to the end.
 * 
 * 2. During traversal:
 *    - If the target value matches the current element, return the current index.
 *    - If the target value is greater than the current element, keep a count of elements that are less than the target.
 * 
 * 3. If the target is not found, the `count` will represent the index where the target should be inserted to maintain sorted order.
 * 
 * Note: This solution has a time complexity of O(n), which is not optimal for large arrays.
 * 
 * Optimal Solution (O(log n) Complexity):
 * 
 * Use binary search to achieve O(log n) complexity. Here's the optimized code:
 
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;  // Return the insertion point.
    }
}

* Optimal Solution Explanation:
 * 
 * 1. Initialize two pointers, `left` and `right`, to represent the range of indices to search.
 * 
 * 2. Use a `while` loop to perform binary search:
 *    - Calculate the middle index `mid`.
 *    - If the middle element equals the target, return `mid`.
 *    - If the middle element is less than the target, move the `left` pointer to `mid + 1`.
 *    - If the middle element is greater than the target, move the `right` pointer to `mid - 1`.
 * 
 * 3. If the target is not found, the `left` pointer will be at the position where the target should be inserted.
 * 
 * 4. Return `left` as the insertion point.
 */