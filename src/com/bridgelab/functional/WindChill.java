package com.bridgelab.functional;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter t");
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        System.out.println("Enter v");
        double v = sc.nextDouble();
        effectiveTemperature( t , v );
    }
    public static void effectiveTemperature(double t , gdouble v){

        double w = 35.74 + 0.625*t + (0.425*t - 35.75) * Math.pow(v,0.16);
        System.out.println(Math.round(w));
    }
}
