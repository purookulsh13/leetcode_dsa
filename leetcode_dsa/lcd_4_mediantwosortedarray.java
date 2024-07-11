/*
Problem : Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */



public class lcd_4_mediantwosortedarray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();
        for(int i : nums1)
            li.add(i);
        for(int j : nums2)
            li.add(j);
        Collections.sort(li);
        int si = li.size();
        // double res = 0;
        int ind=0;
        if(si%2!=0){
            ind = (si-1)/2;
            return (double) li.get(ind);
        }
        else{
            ind=si/2;
            return  (double)(li.get(si/2)+li.get((si/2)-1))/2.0;
        }
        
    }
}
