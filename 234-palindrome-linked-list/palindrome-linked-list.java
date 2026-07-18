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
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }

            ListNode original = head;
            ListNode reversed = reverseList(copyList(head));

            while (original != null && reversed != null) {
                if (original.val != reversed.val) {
                    return false;
                }
                original = original.next;
                reversed = reversed.next;
            }

            return original == null && reversed == null;
        }

        private ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            return prev;
        }

        private ListNode copyList(ListNode head) {
            ListNode dummy = new ListNode();
            ListNode tail = dummy;
            ListNode current = head;

            while (current != null) {
                tail.next = new ListNode(current.val);
                tail = tail.next;
                current = current.next;
            }

            return dummy.next;
        }
}