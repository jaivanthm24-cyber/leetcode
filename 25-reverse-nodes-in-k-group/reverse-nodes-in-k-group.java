class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int n = list.size();
        List<Integer> ans = new ArrayList<>();
        for (int start = 0; start + k <= n; start += k) {
            List<Integer> temp = new ArrayList<>();
            for (int i = start; i < start + k; i++) {
                temp.add(list.get(i));
            }
            for (int i = temp.size() - 1; i >= 0; i--) {
                ans.add(temp.get(i));
            }
        }
        for (int i = (n / k) * k; i < n; i++) {
            ans.add(list.get(i));
        }
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for (int val : ans) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }
}