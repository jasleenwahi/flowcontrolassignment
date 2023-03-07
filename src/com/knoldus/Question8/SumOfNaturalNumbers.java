package com.knoldus.Question8;
import java.util.Scanner;
public class SumOfNaturalNumbers
{
    public static void main(String args[])
    {
        int Naturalnumber=1, limit, sum=0;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the natural number till you want to calculate the sum");
        limit = takeInput.nextInt();
        while(Naturalnumber<=limit)
        {
            sum+=Naturalnumber;
            Naturalnumber++;
        }
        System.out.println("The sum of natural numbers is: "+sum);
    }
}
