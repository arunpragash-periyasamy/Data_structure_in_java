package com.arun;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number 2: ");
        int num2 = input.nextInt();
        System.out.print("Sum of Two numbers is : "+(num1+num2));
    }
}
