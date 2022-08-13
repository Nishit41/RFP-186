package com.bridgelab.functional;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextInt();
        System.out.println("Enter b");
        double b = sc.nextInt();
        System.out.println("Enter c");
        double c = sc.nextInt();
        double delta = b*b - 4*a*c;
        double Root_1 = (-b + Math.sqrt(delta)/(2*a));
        double Root_2 = (-b - Math.sqrt(delta)/(2*a));
        System.out.println(Root_1);
        System.out.println(Root_2);
    }
}
