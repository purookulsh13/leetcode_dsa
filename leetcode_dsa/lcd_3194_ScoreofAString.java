/*
 * Problem : You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the score of s.

Example 1:
Input: s = "hello"
Output: 13
Explanation:
The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

Example 2:
Input: s = "zaz"
Output: 50
Explanation:
The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.
 */

 class Solution {
    public int scoreOfString(String s) {
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            res+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return res;
    }
}

/*
 * **Solution**:
 *    Let's make it simple to understand the question first. We need to calculate the "score" of the string `s`. The score is defined as the sum of the absolute differences between each consecutive pair of characters in the string.
 * 
 * **Steps**:
 * 1. We initialize a variable `res` to 0. This will store the cumulative score.
 * 2. We loop through the string from the first character to the second-to-last character.
 * 3. In each iteration, we calculate the absolute difference between the current character `s.charAt(i)` and the next character `s.charAt(i + 1)`.
 * 4. We add this absolute difference to `res`.
 * 5. After the loop finishes, `res` will contain the total score of the string, which we then return.
 */