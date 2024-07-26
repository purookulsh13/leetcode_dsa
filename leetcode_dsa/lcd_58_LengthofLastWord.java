/*
 * Problem : Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 * 
 */

 class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ') count++;
            else{
                if(count>0) return count;
            }
        }
        return count;
    }
}

/*
 * Solution Explanation:
 * 
 * Problem:
 * Given a string `s` consisting of words and spaces, return the length of the last word in the string.
 * A word is defined as a sequence of non-space characters.
 * 
 * Approach:
 * 
 * 1. **Initialize Count**:
 *    - Initialize `count` to 0. This will be used to count the length of the last word.
 * 
 * 2. **Iterate Backwards Through the String**:
 *    - Start from the end of the string and move backwards.
 *    - For each character:
 *      - If it is not a space, increment the `count`.
 *      - If it is a space and `count` is greater than 0, it means we have counted the last word, so return `count`.
 * 
 * 3. **Return Count**:
 *    - If we finish the loop without encountering a space after counting some characters, return `count`.
 * 
 * Why This Approach:
 * 
 * - **Efficiency**: This approach efficiently finds the length of the last word by scanning the string once from end to start, making it O(n) in time complexity.
 * - **Space Complexity**: The algorithm uses O(1) additional space, making it very space-efficient.
 * 
 * Example:
 * 
 * Input: `s = "Hello World"`
 * Output: `5`
 * 
 * Explanation:
 * - Starting from the end, we count 5 characters until we encounter a space.
 * - Return 5 as the length of the last word "World".
 */