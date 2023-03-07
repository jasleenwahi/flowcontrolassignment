package com.knoldus.Question2;
import java.util.Scanner;
public class LargestOfThreeNumbers
{
    public static void main(String args[])
    {
        int number1, number2, number3, result=0;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        number1 = takeInput.nextInt();
        System.out.println("Enter 2nd number: ");
        number2 = takeInput.nextInt();
        System.out.println("Enter 3rd number: ");
        number3 = takeInput.nextInt();
        if (number1 >= number2 && number1 >= number3)
            result = number1;
        else if (number2 >= number1 && number2 >= number3)
            result = number2;
        else
            result = number3;
        System.out.println("The largest number is: "+result);
    }
}
