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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode p3 = l3;
        ListNode p1 = l1;
        ListNode p2 = l2;
        if (p1 == null && p2 == null)
        {
            return null;
        }
        
        while (p1 != null || p2 != null)
        {
            if (p1 != null && p2 != null)
            {
                if (p1.val < p2.val)
                {
                    p3.val = p1.val;
                    p1 = p1.next;
                }
                else
                {
                    p3.val = p2.val;
                    p2 = p2.next;
                }
                if (p1 != null || p2 != null)
                {
                    p3.next = new ListNode();
                    p3 = p3.next;
                }
            }
            else if (p1 == null && p2 != null)
            {
                while(p2 != null)
                {
                    p3.val = p2.val;
                    p2 = p2.next;
                    if (p2 != null)
                    {
                        p3.next = new ListNode();
                        p3 = p3.next;
                    }
                }
            }
            else if (p1 != null && p2 == null)
            {
                while(p1 != null)
                {
                    p3.val = p1.val;
                    p1 = p1.next;
                    if (p1 != null)
                    {
                        p3.next = new ListNode();
                        p3 = p3.next;
                    }
                }
            }
        }
        return l3;
    }
}
