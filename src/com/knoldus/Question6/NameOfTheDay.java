package com.knoldus.Question6;
import java.util.Scanner;
public class NameOfTheDay
{
    public static void printNameOfTheDay(int dayNumber)
    {
        switch (dayNumber)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid day number");
                break;
        }
    }
    public static void main(String args[])
    {
        int dayNumber;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the day number");
        dayNumber=takeInput.nextInt();
        printNameOfTheDay(dayNumber);
    }
}
