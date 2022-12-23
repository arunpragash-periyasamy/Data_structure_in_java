package com.arun;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        float tempCelsius = read.nextFloat();
        float tempFarenhit = (tempCelsius * 9/5) + 32;
        System.out.println("Farenhit temperature is : "+tempFarenhit);
    }
}
