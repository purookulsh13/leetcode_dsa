/*
 * Problem : A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
 Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

 

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
Example 2:

Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".
Example 3:

Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"
 */

 class Solution {
    public String truncateSentence(String s, int k) {
        if(s.length()<=k)
            return s;
        String[] space = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<k;i++){
            sb.append(space[i]);
            if(i<k-1)
                sb.append(" ");
        }
        
        return sb.toString();
    }
}
/*
 * Solution Explanation:
 * 
 * Problem:
 * Given a sentence `s` and an integer `k`, truncate the sentence such that it contains only the first `k` words. Return the truncated sentence.
 * 
 * Approach:
 * 
 * 1. **Edge Case Handling**:
 *    - If the length of the string `s` is less than or equal to `k`, return the string `s` as it is, because truncation is not needed.
 * 
 * 2. **Splitting the Sentence**:
 *    - Use the `split` method to divide the sentence `s` into words using spaces as delimiters. This results in an array `words` where each element is a word from the sentence.
 * 
 * 3. **Building the Truncated Sentence**:
 *    - Use a `StringBuilder` to build the resulting truncated sentence efficiently.
 *    - Iterate over the first `k` words in the `words` array.
 *    - Append each word to the `StringBuilder`.
 *    - If the current word is not the last word in the truncated sentence, append a space after it.
 * 
 * 4. **Returning the Result**:
 *    - Convert the `StringBuilder` to a string and return it as the truncated sentence.
 */