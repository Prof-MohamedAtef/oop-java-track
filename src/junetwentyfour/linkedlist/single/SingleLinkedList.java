package junetwentyfour.linkedlist.single;

public class SingleLinkedList {
    Node head;

    // insert node at the beginning

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
     
        newNode.next = head; // give the new/next node the address of the current head

        head = newNode; // then, let make the head address equal = the new node address to let the cursor moves to the next node
    }

    // insert at the end

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // let the cursor makes the head contains the new node's address
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // give the temp the address of the head
            }
            temp.next = newNode; // then set the new node address to the next of the head 
        }
    }

    // delete from the beginning
    public void deleteFromBeginning(){
        if (head != null) {
            head = head.next; // go to the head, and replace the head with the address of the next node
        }
    }

    // delete from the end
    public void deleteFromEnd(){
        if (head == null) return; // end the process if the nodes are null (Empty)
        if (head.next == null) { /* if the next of the current head == null -> remove the next of the head by making it equal null */ // then end the process
            head = null;
            return;
        }
        /*
         * if the head not equal null, and the head is having a next node address, get this address, then remove it by making it = null
         */
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void traverse(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // print each node data while iteration
            temp = temp.next;
        }
        System.out.println();
    }

}
