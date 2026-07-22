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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int n = list.size();
        for (int start = 0; start + k <= n; start += k) {
            int left = start, right = start + k - 1;
            while (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for (int val : list) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }
}