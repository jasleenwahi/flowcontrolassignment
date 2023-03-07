package com.knoldus.Question11;
import java.util.Scanner;
enum Shapes{Circle, Square, Rectangle, Triangle}
public class ShapesArea
{
    static Scanner takeInput = new Scanner(System.in);
    public static void circleArea()
    {
        System.out.println("Enter radius: ");
        double radius = takeInput.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("The area of circle is: "+area);
    }
    public static void squareArea()
    {
        System.out.println("Enter side: ");
        double side = takeInput.nextDouble();
        double area = side*side;
        System.out.println("The area of square is: "+area);
    }
    public static void rectangleArea()
    {
        System.out.println("Enter length: ");
        double length = takeInput.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = takeInput.nextDouble();
        double area = length*breadth;
        System.out.println("The area of rectangle is: "+area);
    }
    public static void triangleArea()
    {
        System.out.println("Enter base: ");
        double base = takeInput.nextDouble();
        System.out.println("Enter height: ");
        double height = takeInput.nextDouble();
        double area = 0.5*base*height;
        System.out.println("The area of triangle is: "+area);
    }
    public static void main(String args[])
    {

        for(Shapes shape: Shapes.values())
        {
            if(shape == Shapes.Circle)
            {
                circleArea();
            }
            if(shape == Shapes.Square)
            {
                squareArea();
            }
            if(shape == Shapes.Rectangle)
            {
                rectangleArea();
            }
            if(shape == Shapes.Triangle)
            {
                triangleArea();
            }
        }

    }


}
