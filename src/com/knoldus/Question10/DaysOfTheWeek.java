package com.knoldus.Question10;
enum Day{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
public class DaysOfTheWeek
{
    public static void main(String args[])
    {
        for (Day dayiterator : Day.values()){
            System.out.println("The day is: "+dayiterator);
        }
    }
}
