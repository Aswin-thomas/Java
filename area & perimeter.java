import java.util.*;

public class main{
    public static void main(String[] args){
        scanner input = new scanner(System.in);
        System.out.println("Enter length: ");
        int length = input.nextInt();
        System.out.println("Enter width: ");
        int width = input.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}