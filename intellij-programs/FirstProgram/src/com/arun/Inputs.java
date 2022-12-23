package com.arun;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name;
        String fun;
        System.out.print("Enter a sentence to store in string: ");
        fun = read.nextLine();
        System.out.println(fun);
        System.out.print("Enter a number to print: ");
        int number = read.nextInt();
        System.out.println("You entered : "+number);
        System.out.print("Enter a string to store a first word only: ");
        name = read.next();
        System.out.println(name);
    }
}
