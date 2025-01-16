package LinkedList;

public class SinglyLinkedList {
    private ListNode head;

    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode (int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void display () {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertFirst (int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtAnyPosition (int val, int position) {
        ListNode newNode = new ListNode(val);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;
            int count = 1;
            while (count < position -1) {
                current = current.next;
                count++;
            }
            ListNode previous = current.next;
            current.next = newNode;
            newNode.next = previous;
        }
    }
    public static void main(String[] args) {
       SinglyLinkedList sll = new SinglyLinkedList();
       sll.insertFirst(3);
       sll.insertFirst(4);
       sll.insertAtAnyPosition(7, 2);
       sll.display();
    }
}
