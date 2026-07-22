class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int n = list.size();
        ArrayList<Integer> newList = new ArrayList<>();

        for (int start = 0; start + k <= n; start += k) {
            for (int i = start + k - 1; i >= start; i--) {
                newList.add(list.get(i));
            }
        }

        // Add remaining nodes
        for (int i = (n / k) * k; i < n; i++) {
            newList.add(list.get(i));
        }

        ListNode dummy = new ListNode(0);
        curr = dummy;

        for (int val : newList) {   
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}