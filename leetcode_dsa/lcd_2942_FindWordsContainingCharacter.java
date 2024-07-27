/*
 * Problem : You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.

 

Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
Example 3:

Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 */

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<Integer>();
        
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==x){
                    li.add(i);
                    break;
                }
            } 
        }
        
        return li;
    }
}

/*
 * Solution Explanation:
 * 
 * Problem:
 * Given an array of strings `words` and a character `x`, find the indices of the words that contain the character `x`.
 * 
 * Approach:
 * 
 * 1. **Initialization**:
 *    - Create an empty list `li` to store the indices of words containing the character `x`.
 * 
 * 2. **Iterate through the Words**:
 *    - Loop through each word in the `words` array using an index `i`.
 *    - For each word, loop through its characters using an index `j`.
 *    - If the character `x` is found in the word, add the index `i` to the list `li` and break out of the inner loop.
 * 
 * 3. **Return the List**:
 *    - After processing all words, return the list `li` containing the indices of words that contain the character `x`.
 */