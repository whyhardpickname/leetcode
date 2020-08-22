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
    public ListNode swapPairs(ListNode head) {
        ListNode h;
        if (head == null)
        {
            return null;
        }
        else 
        {
            if (head.next != null)
            {
                h = head.next;
            }
            else
            {
                h = head;
            }
        }
        ListNode p = head;
        ListNode lead = new ListNode(0, p);
        ListNode tmp;
        while (p != null && p.next != null)
        {
            tmp = new ListNode(p.val, p.next);
            p.next = p.next.next;
            tmp.next.next = p;
            lead.next = tmp.next;
            lead = p;
            p = p.next;
        }
        return h;
    }
}
