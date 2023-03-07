package com.knoldus.Question4;
import java.util.Scanner;
public class CheckPositiveNegativeZero
{
    public static void checkNumber(int number)
    {
        if(number>0)
        {
            System.out.println("Number is positive");
        }
        else if(number<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is 0");
        }
    }
    public static void main(String args[])
    {
        int number;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = takeInput.nextInt();
        checkNumber(number);
    }
}
