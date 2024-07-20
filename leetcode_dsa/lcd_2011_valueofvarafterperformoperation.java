/*
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

 

Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
Example 2:

Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.
Example 3:

Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.
 */

public class lcd_2011_valueofvarafterperformoperation {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        int n = operations.length;
        for(int i=0;i<n;i++){
            String m = operations[i];
            if(m.charAt(0)=='+' || m.charAt(1)=='+')
                res+=1;
            else
                res-=1;
        }
        return res;
    }
}

/*
 * Solution : 
 *      Step 1 : from String array we took value index by index and store that in another string through loop.
 *      Step 2 : With that String we check the character of the operation only 2 possible chanches if its pre-increment operator it has + character at 0 index of the string and if it has post-increment operator it has + character in 1 index.
 *      Step 3 : Same for pre-decrement and post-decrement operator.
 *      Step 4 : After checking the operator value we can easily add +1 or subtract -1 according to that.
 *  
 */