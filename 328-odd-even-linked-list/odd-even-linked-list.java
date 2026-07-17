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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head;          // pointer for odd-positioned nodes
        ListNode even = head.next;    // pointer for even-positioned nodes
        ListNode evenHead = even;     // save the head of the even list
        
        while (even != null && even.next != null) {
            odd.next = even.next;     // link odd → next odd
            odd = odd.next;           // move odd forward
            even.next = odd.next;     // link even → next even
            even = even.next;         // move even forward
        }
        
        odd.next = evenHead;          // connect odd list → even list
        return head;
    }
}