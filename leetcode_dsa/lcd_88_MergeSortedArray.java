/*
 * Problem: Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * - The initial number of elements in nums1 is m, and nums2 has n elements.
 * - nums1 has a size of m + n to accommodate all elements from both arrays.
 * 
 * Example:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 */

 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy elements from nums2 to nums1 starting from index m
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        
        // Sort the merged array
        Arrays.sort(nums1);
    }
}

/*
 * Solution:
 *          The task is to merge two sorted arrays into one sorted array.
 *          
 *          1. Start by copying the elements from the second array (nums2) into the end of the first array (nums1).
 *             - This is done by placing elements of nums2 starting from index `m` in nums1.
 *          2. After copying, sort the entire nums1 array to ensure it is in ascending order.
 *          
 *          This approach takes advantage of Java's built-in sorting functionality to sort the merged array.
 *          
 *          The time complexity of this approach is O((m+n) log(m+n)), where `m` and `n` are the lengths of the input arrays.
 *          The space complexity is O(1) as the sorting is done in place without additional space.
 */
