class Solution {
    public Node delPos(Node head, int k) {
        if (head == null) {
            return null;
        }

        // Delete the first node.
        if (k == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        // Traverse to the k-th node (1-based).
        Node current = head;
        for (int position = 1; position < k && current != null; position++) {
            current = current.next;
        }

        // Leave the list unchanged when k is out of range.
        if (current == null) {
            return head;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }

        return head;
    }
}
