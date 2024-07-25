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
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int delete() {
        Node temp = head;
        if (temp == null) {
            return -1;
        }
        if (temp.next == null) {
            head = null;
            
            return temp.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int data = temp.next.data;
        temp.next = null;
        
        return data;
    }

    public int delete(int index) {
        Node temp = head;
        if (index == 0) {
            head = temp.next;
            
            return temp.data;
        }
        // [1,2,3,4,5] 4
        for (int i = 1; i < index; i++) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                return -1;
            }
        }
        if (temp.next != null) {
            int data = temp.next.data;
            temp.next = temp.next.next;
            
            return data;
        }
        return -1;
    }

    public void update(int index, int data) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp.next != null)
                temp = temp.next;
            else {
                return;
            }
        }
        temp.data = data;
        
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null)
                sb.append("->");
            temp = temp.next;
        }
        return sb.toString();
    }
}