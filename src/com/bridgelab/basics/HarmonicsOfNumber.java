package com.bridgelab.basics;
import java.util.Scanner;
public class HarmonicsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N ");
        int n = sc.nextInt();
        Harmonics obj1 = new Harmonics(n);

    }
}
class Harmonics {
    public  Harmonics(int n)
    {
        double result = 0.0;
        for (int i = 1 ; i <= n ; i++) {
            result = result + (double) 1 / i;
        }
        System.out.println(result);
    }
}

