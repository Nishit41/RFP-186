package com.bridgelab.basics;

import java.util.Scanner;
public class PowerOf2 {
       public static int  powerOf2(int n, int power){
           int result = 1;
           for ( int i=1 ; i <= power ; i++ ) {
               result = result * n;
           }
           return result;
       }
}
class InputFromUser {
    public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println("enter power");
        int power = sc.nextInt();
       if( power < 31 && power >= 0)
       {
           int returnedResult = PowerOf2.powerOf2(userInput,power);
           System.out.println(returnedResult);
       }
       else
           System.out.println("enter Valid Input");
    }
}
