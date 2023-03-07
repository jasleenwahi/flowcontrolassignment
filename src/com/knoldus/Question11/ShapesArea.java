package com.knoldus.Question11;
import java.util.Scanner;
enum Shapes{Circle, Square, Rectangle, Triangle}
public class ShapesArea
{
    public static void main(String args[])
    {
        Scanner takeInput = new Scanner(System.in);
        for(Shapes shape: Shapes.values())
        {
            if(shape == Shapes.Circle)
            {
                System.out.println("Enter radius: ");
                double radius = takeInput.nextDouble();
                double area = 3.14*radius*radius;
                System.out.println("The area of circle is: "+area);
            }
            if(shape == Shapes.Square)
            {
                System.out.println("Enter side: ");
                double side = takeInput.nextDouble();
                double area = side*side;
                System.out.println("The area of square is: "+area);
            }
            if(shape == Shapes.Rectangle)
            {
                System.out.println("Enter length: ");
                double length = takeInput.nextDouble();
                System.out.println("Enter breadth: ");
                double breadth = takeInput.nextDouble();
                double area = length*breadth;
                System.out.println("The area of rectangle is: "+area);
            }
            if(shape == Shapes.Rectangle)
            {
                System.out.println("Enter base: ");
                double base = takeInput.nextDouble();
                System.out.println("Enter height: ");
                double height = takeInput.nextDouble();
                double area = 0.5*base*height;
                System.out.println("The area of triangle is: "+area);
            }
        }

    }


}
