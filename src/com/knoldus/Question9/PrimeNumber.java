package com.knoldus.Question9;
import java.util.Scanner;
public class PrimeNumber
{
    public static void checkPrime(int number, int limit)
    {
        boolean isPrime = true;
        if(number == 1)
        {
            isPrime = false;
        }
        if (number == 2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            do
            {
                if (number % limit == 0) {
                    isPrime = false;
                    break;
                }
                limit++;
            } while (limit < number);
            if (isPrime == true)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }
        }
    }
    public static void main(String args[]) {

        int number, limit = 2;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the number you want to check if prime or not");
        number = takeInput.nextInt();
        checkPrime(number, limit);
    }
}
