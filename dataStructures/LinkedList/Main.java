package dataStructures.LinkedList;
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);
        sll.insert(5);
        sll.insert(6);
        System.out.println(sll);
        sll.update(4, 17);
        System.out.println(sll);
        sll.insert(7);
        sll.insert(8);
        sll.insert(9);
        sll.insert(10);
        System.out.println(sll);
        sll.delete();
        sll.delete(0);
        sll.delete(7);
        System.out.println(sll);
    }    
}
