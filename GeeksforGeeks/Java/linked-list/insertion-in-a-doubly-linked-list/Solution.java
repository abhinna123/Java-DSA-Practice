class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node newNode = new Node(x);
        Node current = head;

        // Move to the p-th node (0-based).
        for (int i = 0; i < p; i++) {
            current = current.next;
        }

        Node nextNode = current.next;
        current.next = newNode;
        newNode.prev = current;
        newNode.next = nextNode;

        if (nextNode != null) {
            nextNode.prev = newNode;
        }

        return head;
    }
}
