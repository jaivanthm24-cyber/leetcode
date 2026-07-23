/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        for (Node cur = head; cur != null; cur = cur.next.next) {
            Node copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
        }

        for (Node cur = head; cur != null; cur = cur.next.next) {
            if (cur.random != null)
                cur.next.random = cur.random.next;
        }

        Node newHead = head.next;

        for (Node cur = head; cur != null; cur = cur.next) {
            Node copy = cur.next;
            cur.next = copy.next;
            if (copy.next != null)
                copy.next = copy.next.next;
        }

        return newHead;
    }
}
