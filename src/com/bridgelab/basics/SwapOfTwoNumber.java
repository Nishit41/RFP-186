package com.bridgelab.basics;

import java.util.Scanner;

public class SwapOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int Number1 = sc.nextInt();
        System.out.println("Enter num2");
        int Number2 = sc.nextInt();
        Number1 =  Number1 + Number2;
        Number2 = Number1 - Number2;
        Number1 = Number1 - Number2;
        System.out.println("After Swapping " + Number1 +" "+ Number2);
    }
}
