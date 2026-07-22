import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        LinkedList<Integer> list = new LinkedList<>();

        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : list) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }
}