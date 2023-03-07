package com.knoldus.Question5;
import java.util.Scanner;
public class AssignGrade
{
    public static void assignGrades(double percentage)
    {
        char grade;
        if(percentage>=95)
        {
            grade='O';
        }
        else
        {
            if(percentage>=90 && percentage<95)
            {
                grade='A';
            }
            else
            {
                if(percentage>=80 && percentage<90)
                {
                    grade='B';
                }
                else
                {
                    if(percentage>=70 && percentage<80)
                    {
                        grade='C';
                    }
                    else
                    {
                        if(percentage>=60 && percentage<70)
                        {
                            grade='D';
                        }
                        else
                        {
                            if(percentage>=33 && percentage<60)
                            {
                                grade='E';
                            }
                            else
                            {
                                grade='F';
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The grade of the student is: "+grade);

    }
    public static void main(String args[])
    {
        double percentage;
        char grade;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter the percentage");
        percentage = takeInput.nextDouble();
        assignGrades(percentage);
    }
}
