/*
Problem 1 : Two Sum
 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.*;
public class lcd_1_twosum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!m.containsKey(target-nums[i]))
                m.put(nums[i],i);
            else{
                res[1] = i;
                res[0] = m.get(target-nums[i]);
                return res;
            }
        }
        return res;
    }
    
}
}

/*
Solution :
1. for loop array ke saare elements ko iterate karta hai:
    a). if (!m.containsKey(target - nums[i])): Yeh check karta hai ki kya (target - current number) map mein exist karta hai ya nahi.
    b). m.put(nums[i], i);: Agar exist nahi karta, toh current number aur uska index map mein store kar do.
    c). else: Agar (target - current number) map mein exist karta hai, toh:
            res[1] = i;: Current index ko result array mein store kar do.
            res[0] = m.get(target - nums[i]);: Map se (target - current number) ka index nikal kar result array mein store kar do.
            return res;: Result return kar do kyunki humein valid pair mil gaya.
 */