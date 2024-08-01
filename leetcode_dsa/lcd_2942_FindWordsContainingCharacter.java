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
 * **Solution**:
 *    Let's break down the problem to understand it clearly. We need to find the indices of the words in the array `words` that contain the character `x`.
 * 
 * **Steps**:
 * 1. We initialize an empty list `li` to store the indices of the words that contain the character `x`.
 * 2. We loop through each word in the array `words` using the index `i`.
 * 3. For each word `s` at index `i`, we loop through each character in the word.
 * 4. If we find a character in the word that matches `x`, we add the index `i` to the list `li` and break out of the inner loop to move to the next word.
 * 5. After we have checked all the words, we return the list `li` which contains the indices of the words that contain the character `x`.
 */