/*
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)


Example 1:


Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]
 */

 class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode p3 = p2.next;
        p1.next = p3;
        p2.next = p1;
        if(p3!=null)
            p1.next = swapPairs(p3);
        
        return p2;
    }
}

/*
 * Solution Explanation:
 * 
 * 1. The problem is to swap every two adjacent nodes in a linked list.
 * 
 * 2. Base case: if the list is empty or has only one node, return the head.
 * 
 * 3. Initialize three pointers:
 *    - `p1` for the first node of the pair (head).
 *    - `p2` for the second node of the pair (head.next).
 *    - `p3` for the node after the pair (p2.next).
 * 
 * 4. Swap the first and second nodes by updating their `next` pointers:
 *    - Set `p1.next` to `p3` (the node after the pair).
 *    - Set `p2.next` to `p1` (the first node).
 * 
 * 5. Recursively call `swapPairs` on the rest of the list starting from `p3`.
 *    - If `p3` is not null, set `p1.next` to the result of the recursive call to continue swapping pairs.
 * 
 * 6. Return `p2` as the new head of the swapped pair.
 */