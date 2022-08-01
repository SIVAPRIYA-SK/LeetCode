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
        ListNode dummy = new ListNode();
        ListNode temp = dummy;  // temp is the copy of dummy
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1) {   // Till this while case is true, the iteration continues
            int sum = 0;
            if(l1 != null) {
                sum += l1.val; // adding value of l1 with sum
                l1 = l1.next;  // iteration continues
            }
            if(l2 != null) {
                sum += l2.val; // adding value of l2with sum
                l2 = l2.next;  // iteration continues
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}