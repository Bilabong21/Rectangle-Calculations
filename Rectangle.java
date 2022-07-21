import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
    {
        double length, height, area, perimeter;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("The length of the rectangle? ");
        length = keyboard.nextDouble();
        System.out.print("The height of the rectangle? ");
        height = keyboard.nextDouble();
        area = calculateArea(length, height);
        perimeter = calculatePerimeter(length, height);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
    // method to calculate area
    static double calculateArea(double lengthIn, double heightIn)
    {
        return lengthIn * heightIn;
    }
    // method to calculate perimeter
    static double calculatePerimeter(double lengthIn, double heightIn)
    {
        return 2 * (lengthIn + heightIn);
    }
}