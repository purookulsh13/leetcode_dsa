/*
 * Problem : Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */

 class Solution{ 
    public void sortColors(int[] nums) {
        int n= nums.length;
        int low=0,mid=0,high=n-1;
        while (mid <= high)
        {
            if (nums[mid] == 0)
            {
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++;
                low++;
            }
            else if (nums[mid] == 1)
            {
                ++mid;
            }
            else
            {
                nums[mid] = nums[high];
                nums[high] = 2;
                --high;
            }
        }
    }
}

/*
 * Solution:
 *          This solution uses the Dutch National Flag algorithm to sort the array with three colors (0, 1, 2).
 *          The main idea is to maintain three pointers: low, mid, and high.
 *          
 *          1. Initialize three pointers: low, mid to 0, and high to n-1.
 *          2. Iterate through the array while mid <= high.
 *          3. If nums[mid] == 0, swap nums[mid] with nums[low], increment both mid and low.
 *          4. If nums[mid] == 1, increment mid.
 *          5. If nums[mid] == 2, swap nums[mid] with nums[high], decrement high.
 *          
 *          This ensures that all 0's are moved to the front, 1's are in the middle, and 2's are at the end.
 *          
 *          The time complexity of this algorithm is O(n) since we traverse the array once.
 *          The space complexity is O(1) as we do the sorting in-place.
 */