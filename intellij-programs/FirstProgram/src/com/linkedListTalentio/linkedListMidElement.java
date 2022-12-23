package com.linkedListTalentio;

import java.util.Scanner;

public class linkedListMidElement {
    class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }
    void insertList(int data){
        if(head==null){
            Node create = new Node(data);
            head = create;
            return ;
        }
        Node create = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = create;
    }
    static Node head;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

    }
}




//import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//
//public class Solution {
//    class Node{
//        int data;
//        Node next;
//        // constructor
//        Node(int key) {
//            data = key;
//            next = null;
//        }
//    }
//    static Node head;
//    void insertTheNode(int data){
//        Node temp = new Node(data);
//        temp.next = head;
//        head=temp;
//    }
//    void print(){
//        Node temp = head;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Solution begin = new Solution();
//        Scanner read = new Scanner(System.in);
//        int size = read.nextInt();
//        int[] array = new int[size];
//        for(int i=0;i<size;i++){
//            int temp = read.nextInt();
//            begin.insertTheNode(temp);
//        }
//        int target = read.nextInt();
//        begin.print();
//
//    }
//}