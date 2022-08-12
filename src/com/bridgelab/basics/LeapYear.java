package com.bridgelab.basics;

import java.util.Scanner;

public class LeapYear {
    static String ifLeapYearLogic(int year){
        if( year % 400 == 0 )
            return "Leapyear";
        else if ( year % 100 == 0 )
            return  "Not Leapyear";
        else if ( year % 4 == 0 )
            return  "LeapYear";
        else
            return "NotLeapYear";
    }
}
class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
       int year = sc.nextInt();
       int temp = year;
       int count = 0;
       while ( year != 0 ){
           year /= 10;
           ++count;
       }
       if( count == 4 ){
        String yearIs =  LeapYear.ifLeapYearLogic(temp);
           System.out.println(yearIs);
       }
       else{
           System.out.println("not a leap year");
       }
    }
}
