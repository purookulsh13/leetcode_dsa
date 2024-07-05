/*
 219. Contains Duplicate II
Easy

6110

3088

Add to List

Share
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
import java.util.*;
 class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]) && i-mp.get(nums[i])<=k){
                return true;
            }
            mp.put(nums[i],i);
        }
        return false;
            
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        
        System.out.println(containsNearbyDuplicate(arr,n));
        s.close();
    }
}