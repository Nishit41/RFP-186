package com.bridgelab.functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Input Ist number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int y = sc.nextInt();
       double calDistance = calDistance(x,y);
        System.out.println(calDistance);
    }
    public static double calDistance(int x , int y ){
        int origin1 = 0;
        int origin2 = 0;
       double Distance = (double) Math.sqrt((x*x)+(y*y));
       return Distance;
    }
}
