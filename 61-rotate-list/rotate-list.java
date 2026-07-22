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
import java.util.LinkedList;

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        LinkedList<ListNode> list = new LinkedList<>();
        ListNode current = head;

        while (current != null) {
            list.add(current);
            current = current.next;
        }

        int n = list.size();
        k = k % n;

        if (k == 0) {
            return head;
        }

        ListNode newHead = list.get(n - k);
        ListNode newTail = list.get(n - k - 1);
        ListNode oldTail = list.getLast();

        newTail.next = null;
        oldTail.next = head;

        return newHead;
    }
}