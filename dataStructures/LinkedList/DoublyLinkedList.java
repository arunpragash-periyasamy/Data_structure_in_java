package dataStructures.LinkedList;

public class DoublyLinkedList {
    Node head = null;
    Node next = null;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            next = newNode;
        } else {
            newNode.head = next;
            next.next = newNode;
            next = newNode;
        }
    }
    

    // This method will insert the new node at the specific index. If suppose the index is not found then it will insert at end of the linked list.
    public void insert(int index, int data) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        if (temp.next == null)
            this.next = newNode;
        temp.next = newNode;
        newNode.head = temp;
        newNode.next = temp.next;

    }
    

    // [1,2, 3 ,4,5] (2)
    public int delete(int index) {
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            if (temp.next == null)
                return -1;
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        return data;
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp!= null) {
            sb.append(temp.data);   
            temp = temp.next;
            if (temp!= null) {
                sb.append("->");
            }
        }
        return sb.toString();
    }
}
