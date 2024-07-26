/*
 * Problem : You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.

For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.

Return the head of the modified linked list.

 

Example 1:


Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 3 + 1 = 4.
- The sum of the nodes marked in red: 4 + 5 + 2 = 11.
Example 2:


Input: head = [0,1,0,3,0,2,2,0]
Output: [1,3,4]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 1 = 1.
- The sum of the nodes marked in red: 3 = 3.
- The sum of the nodes marked in yellow: 2 + 2 = 4.

 */

 class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode newnode = new ListNode();
        ListNode temp = newnode;
        int sum=0;
        head = head.next;
        while(head!=null){
            if(head.val!=0)
                sum+=head.val;
            else{
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum=0;
            }
            head=head.next;
        }
        return newnode.next;
    }
}

/*
 * Solution Explanation:
 * 
 * Problem:
 * Given a linked list where nodes contain integers, and the list starts and ends with zeroes, merge adjacent nodes between zeroes by summing their values and create a new linked list with these sums.
 * 
 * Approach:
 * 
 * 1. **Initialization**:
 *    - Create a dummy node `newnode` which will help in building the resulting list.
 *    - Use a `temp` pointer to track the current position in the new list.
 *    - Initialize a variable `sum` to accumulate values between zeroes.
 * 
 * 2. **Skip Initial Zero**:
 *    - Move the `head` pointer to skip the initial zero node.
 * 
 * 3. **Traverse and Accumulate**:
 *    - Traverse the input linked list.
 *    - Add node values to `sum` until a zero is encountered.
 *    - When a zero is encountered, create a new node with the accumulated `sum` and append it to the new list.
 *    - Reset `sum` for the next segment.
 * 
 * 4. **Return Result**:
 *    - Return the new linked list starting from `newnode.next` (skipping the dummy node).
 * 
 * Example:
 * 
 * Input: `head` = [0, 3, 1, 0, 4, 2, 0]
 * Output: [4, 6]
 * 
 * Explanation:
 * - The first segment between zeroes has values [3, 1] which sum up to 4.
 * - The second segment between zeroes has values [4, 2] which sum up to 6.
 * - The resulting linked list is [4, 6].
 */