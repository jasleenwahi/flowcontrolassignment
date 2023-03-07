package com.knoldus.Question1;
import java.util.Scanner;
public class CheckEvenOdd
{
    public static void main(String args[])
    {
        int number;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = takeInput.nextInt();
        if(number%2 == 0)
        {
            System.out.println("The given number is even");
        }
        else
        {
            System.out.println("The given number is odd");
        }
    }
}
