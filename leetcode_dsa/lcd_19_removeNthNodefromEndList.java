/*
 * Problem : Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode res = slow;
        for(int i=1;i<n;i++)
            fast = fast.next;
        while(fast.next!=null){
            res = slow;
            slow = slow.next;
            fast = fast.next;
        } 
        
        if(slow==head) head=head.next;
        res.next = slow.next;
        return head;

    } 
}

/*
 * Solution :  
 *
 */