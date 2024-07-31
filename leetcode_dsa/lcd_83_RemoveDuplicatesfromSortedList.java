/*
 * Problem : Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
 * Return the linked list sorted as well.

 

Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            if(temp.next==null){
                break;
            }
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}

/*
 * Solution:
 *          This solution iterates through the linked list and removes duplicate nodes.
 *          
 *          1. Start with the head of the linked list and initialize a 'current' pointer.
 *          2. Traverse the list:
 *             - If the value of the current node is the same as the value of the next node (i.e., duplicate values),
 *               adjust the 'next' pointer of the current node to skip the duplicate node.
 *             - Continue this process until no more duplicates are found in the current node's next position.
 *          3. Move to the next node and repeat the process.
 *          
 *          This approach ensures that duplicates are removed and only unique elements are retained in the linked list.
 *          
 *          The time complexity of this algorithm is O(n), where n is the number of nodes in the linked list.
 *          The space complexity is O(1) as no additional space is used apart from the input list.
 */