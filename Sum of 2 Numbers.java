import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the program Name: ");
        String fullName = input.nextLine();
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two numbers is: "+ sum);
        input.close();
    }
}