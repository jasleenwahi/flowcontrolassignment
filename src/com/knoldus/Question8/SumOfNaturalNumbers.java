package com.knoldus.Question8;
import java.util.Scanner;
public class SumOfNaturalNumbers
{
    public static int sumNaturalNumbers(int naturalNumber, int limit)
    {
        int sum = 0;
        while(naturalNumber<=limit)
        {
            sum+=naturalNumber;
            naturalNumber++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int naturalNumber=1, limit, sum;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the natural number till you want to calculate the sum");
        limit = takeInput.nextInt();
        sum = sumNaturalNumbers(naturalNumber, limit);
        System.out.println("The sum of natural numbers is: "+sum);
    }
}
