package oop.Abstraction;

public class Area {

    // write a method that calculate the area of a triangle
    // .5 *b *h
    // write a method that calculates the area of a circle
    // pi * r~2
    // pi = 3.14
    // find areaOfACircle(???)

    // write a method that calculates the area of a rectangle
    // l * w
    // findAreaOfARectangle(???)


    public static double findAreaOfATriangle (double base, double height) {
        return  .5 * base *height;
    }

    public static double findAreaOfACircle(double radius) {
        return  Math.PI * radius * radius;

    }
    public  static double findAreaOfARectangel(double length, double width)
    {
        return  length * length;
    }




}
