package com.linkedListTalentio;

import javax.management.modelmbean.ModelMBeanAttributeInfo;
import java.util.Scanner;

public class Main {
    class Node{
        int data;
        Node next;
          // constructor
        Node(int key) {
            data = key;
            next = null;
        }
    }
    static Node head;
    void insertTheNode(int data){
        Node temp = new Node(data);
        temp.next = head;
        head=temp;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    int count(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        return count;
    }
    void insertAtLast(int data){
        if(head==null){
            Node create = new Node(data);
            head = create;
            return;
        }
        Node create = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = create;
    }
    void deleteAtFirst(){
        if(head == null){
            System.out.println("underflow");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
    }
//    0 bytes of memory. it will not take memory untill object not created.
    public static void main(String[] args) {
        Main begin = new Main();
        Scanner read = new Scanner(System.in);
//        int value = read.nextInt();
//        begin.insertTheNode(value);
        begin.insertTheNode(10);
        begin.insertTheNode(20);
        begin.insertTheNode(30);
        begin.insertTheNode(40);
//        begin.insertAtLast(value);
//        begin.insertAtLast(10);
//        begin.insertAtLast(20);
//        begin.insertAtLast(30);
//        begin.insertAtLast(40);
//        begin.deleteAtFirst();
//        System.out.println(head.next.next);
//        begin.print();
//        System.out.println("Count "+begin.count());
    }
}


