/*
268. Missing Number
Easy

12076

3322

Add to List

Share
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */

import java.util.Arrays;
import java.util.Scanner;

public class lcd_268_missingnumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i])
                // System.out.print(i+" ");
                return i;
        }
        
        return nums.length;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        
        System.out.println(missingNumber(arr));
        s.close();
    }
    
}
