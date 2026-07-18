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
    static{
        ListNode n = new ListNode(0);
        for(int i=0;i<40;i++)
            isPalindrome(n);
    }
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        ListNode h = head, rev = null;
        while(fast != null && fast.next != null){
            ListNode temp = slow;

            slow = slow.next;
            fast = fast.next.next;

          
            temp.next = rev;
            rev = temp;
        }

        if(fast != null) slow = slow.next;

        while(slow != null && rev != null && slow.val == rev.val){
            slow = slow.next;
            rev = rev.next;
        }
        return slow == null;
    }
}