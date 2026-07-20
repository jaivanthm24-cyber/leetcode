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
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (seen.contains(curr.val)) {
                duplicates.add(curr.val);
            }
            seen.add(curr.val);
            curr = curr.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        curr = head;
        while (curr != null) {
            if (!duplicates.contains(curr.val)) {
                tail.next = new ListNode(curr.val);
                tail = tail.next;
            }
            curr = curr.next;
        }
        
        return dummy.next;
    }
}