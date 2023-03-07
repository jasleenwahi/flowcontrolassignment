package com.knoldus.Question7;
import java.util.Scanner;
public class FirstN_NaturalNumbers
{
    public static void main(String args[])
    {
        int naturalNumber=1,limit;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the number till you want to print natural numbers");
        limit = takeInput.nextInt();
        while(naturalNumber<=limit)
        {
            System.out.println(naturalNumber);
            naturalNumber++;
        }
    }
}
