/*
 * 1512. Number of Good Pairs
 
 Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 */

import java.util.HashMap;
import java.util.Map;

public class lcd_1512_goodpairs {
     public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : nums)
            mp.put(i, mp.getOrDefault(i,0)+1);
        
        int gp=0;
        for(int cnt : mp.values()){
            gp = gp + cnt*(cnt-1)/2;
        }
        
        return gp;
        
    }
}

/*
 * solution :
 * 
 * In this problem, we use a HashMap to efficiently count how many times each number appears in the array. 
 * Think of a HashMap as a special kind of table where each number (the key) is associated with a count (the value). 
 * First, we create this HashMap to store these key-value pairs. As we go through the array, we update the count for each number. 
 * If a number is already in the map, we increment its count. If it's not in the map yet, we add it with a count of 1.
 *
 * For example, if the array is [1, 2, 3, 1, 1, 3], the HashMap will eventually show that the number 1 appears 3 times, 2 appears once, and 3 appears twice. 
 * By using the HashMap, we can quickly and easily track the frequency of each number, 
 * which allows us to calculate the number of good pairs based on these counts.
 * 
 * Now, like for 1 it has 3 counts in the array so with gp logic we create : gp = 0(at initially) + 3 (3-1)/2 = 0 + 3*1 = 3,
 *      for 2 it has 1 count only in the array : gp = 0 + 1*(1 - 1)/2 = 0+0 = 0,
 *      for 3 it has 2 count in array : gp = 0 + 2*(2-1)/2 = 0+1 = 1
 *  
 * So, after all three = 3+0+1 = 4 = gp or good pair
 */