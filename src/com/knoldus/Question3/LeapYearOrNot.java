package com.knoldus.Question3;
import java.util.Scanner;
public class LeapYearOrNot
{
    public static void main(String args[])
    {
        int year;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter an year: ");
        year = takeInput.nextInt();
        if(year%400 == 0)
        {
            System.out.println("The given year is leap year");
        }
        else if(year%100 == 0)
        {
            System.out.println("The given year is not a leap year");
        }
        else if(year%4 == 0)
        {
            System.out.println("The given year is leap year");
        }
        else
        {
            System.out.println("The given year is not a leap year");
        }
    }
}
