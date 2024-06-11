package dataStructures.LinkedList;
public class SinglyLinkedList {

    static Node head = null;
    

    SinglyLinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.tail != null) {
                temp = temp.tail;
            }
            temp.tail = newNode;
        }
    }

    public int delete() {
        Node temp = head;
        if (temp == null) {
            return -1;
        }
        if (temp.tail == null) {
            head = null;
            
            return temp.data;
        }
        while (temp.tail.tail != null) {
            temp = temp.tail;
        }
        int data = temp.tail.data;
        temp.tail = null;
        
        return data;
    }

    public int delete(int index) {
        Node temp = head;
        if (index == 0) {
            head = temp.tail;
            
            return temp.data;
        }
        // [1,2,3,4,5] 4
        for (int i = 1; i < index; i++) {
            if (temp.tail != null) {
                temp = temp.tail;
            } else {
                return -1;
            }
        }
        if (temp.tail != null) {
            int data = temp.tail.data;
            temp.tail = temp.tail.tail;
            
            return data;
        }
        return -1;
    }

    public void update(int index, int data) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp.tail != null)
                temp = temp.tail;
            else {
                return;
            }
        }
        temp.data = data;
        
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data);
            if (temp.tail != null)
                sb.append("->");
            temp = temp.tail;
        }
        return sb.toString();
    }
}