package datastructures;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head;

    /**
     * Add a new node to the LinkedList
     * @param data of the new node
     */
    public void append (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /**
     * Display the contents of the list
     */
    public void display() {
        Node current = head;
        while (current.next != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * Insert node at a specified position
     * @param pos where a node needs to be inserted
     * @param head first node of the list
     * @param data value of new node
     * @return the list with updated node at specified postion
     * */

    public Node insertAtPos(int pos, Node head, int data) {

        if (pos < 1) {
            return head;
        }

        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        for ( int i = 1; i < pos - 1; i++) {
            if (curr.next != null) {
                curr = curr.next;
            }
        }

        if (curr == null){
            return head;
        }

        Node newNode = new Node(data);

        newNode.next = curr.next;
        curr.next = newNode;

        return head;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Original LinkedList:");
        list.display();

        // Insert node at a specified position
        int data = 12, pos = 3;
        list.insertAtPos(pos, list.head, data);
        list.display();
    }
}
