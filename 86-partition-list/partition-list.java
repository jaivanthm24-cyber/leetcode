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
    public ListNode partition(ListNode head, int x) {
        ListNode t=head;
        ListNode gg=new ListNode(-1);
        ListNode ll=new ListNode(-1);
        ListNode g=gg;
        ListNode l=ll;
        while(t!=null){
            if(t.val>=x){
                ListNode gval=new ListNode(t.val);
                g.next=gval;
                g=g.next;
            }
            else{
                ListNode lval=new ListNode(t.val);
                l.next=lval;
                l=l.next;                
            }
            t=t.next;
        }
        ListNode temp=ll;
        l.next = gg.next;
        return ll.next;
    }
}