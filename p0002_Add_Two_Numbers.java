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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode firstNode = l3;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0)
        {
            if (l1 != null && l2 != null)
            {
                l3.val = (l1.val + l2.val + carry ) % 10;
                carry = (l1.val + l2.val + carry ) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if (l1 == null && l2 != null)
            {
                l3.val = (l2.val + carry ) % 10;
                carry = (l2.val + carry ) / 10;
                l2 = l2.next;
            }
            else if (l1 != null && l2 == null)
            {
                l3.val = (l1.val + carry ) % 10;
                carry = (l1.val + carry ) / 10;
                l1 = l1.next;
            }
            else
            {
                l3.val =carry;
                carry = 0;
            }
            
            if (l1 == null && l2 == null && carry == 0)
                break;
            
            l3.next = new ListNode(0);
            l3 = l3.next;
        }
        return firstNode;
    }
}
