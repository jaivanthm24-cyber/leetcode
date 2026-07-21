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
import java.util.Iterator;

class Solution {
    public ListNode reverseList(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();

        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        Iterator<Integer> it = list.descendingIterator();

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (it.hasNext()) {
            tail.next = new ListNode(it.next());
            tail = tail.next;
        }

        return dummy.next;
    }
}