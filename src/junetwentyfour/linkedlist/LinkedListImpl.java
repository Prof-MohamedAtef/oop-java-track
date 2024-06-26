package junetwentyfour.linkedlist;

import junetwentyfour.linkedlist.single.SingleLinkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Insert elements
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.traverse(); // Output: 1 2 3

        // insert at the end
        list.insertAtEnd(4);
        list.traverse(); // Output: 1 2 3 4

        // delete from the beginning
        // Delete elements
        list.deleteFromBeginning();
        list.traverse(); // Output: 2 3 4

        // delete from the end
        list.deleteFromEnd();
        list.traverse(); // Output: 2 3
    }
}
