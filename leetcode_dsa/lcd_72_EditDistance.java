/*
 * Problem : Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
 

Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
 */

 class Solution {
    public int minDistance(String word1, String word2) {
        char[] str1=word1.toCharArray();
        char[] str2=word2.toCharArray();
        int temp[][]=new int[str1.length+1][str2.length+1];
        
        for(int i=0; i<temp[0].length;i++){
            temp[0][i]=i;
        }
        for(int i=0;i<temp.length;i++){
            temp[i][0]=i;
        }
        
        for(int i=1;i<=str1.length;i++){
            for(int j=1;j<=str2.length;j++){
                if(str1[i-1]==str2[j-1]){
                    temp[i][j]=temp[i-1][j-1];
                }
                else
                    temp[i][j]=1+min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1]);
            }
        }
        return temp[str1.length][str2.length];
    }

    int min(int a,int b,int c){
        int l=Math.min(a,b);
        return Math.min(l,c);
    }
}   

/*
 * Solution:
 *          The problem can be solved using Dynamic Programming by creating a 2D array to store the minimum edit distance between prefixes of the two words.
 *          
 *          1. Create a 2D array `temp` where `temp[i][j]` represents the minimum number of operations required to convert the first i characters of word1 to the first j characters of word2.
 *          
 *          2. Initialize the first row and first column of the array:
 *             - `temp[0][i] = i` for all i, since converting an empty string to a string of length i requires i insert operations.
 *             - `temp[i][0] = i` for all i, since converting a string of length i to an empty string requires i delete operations.
 *          
 *          3. Fill in the rest of the array:
 *             - If `str1[i-1] == str2[j-1]`, then `temp[i][j] = temp[i-1][j-1]` (no operation required).
 *             - Otherwise, `temp[i][j] = 1 + min(temp[i-1][j-1], temp[i-1][j], temp[i][j-1])`.
 *               The minimum is taken from the three possible operations: replace, delete, and insert, respectively.
 *          
 *          4. The value at `temp[str1.length][str2.length]` will be the minimum number of operations required to convert word1 to word2.
 */