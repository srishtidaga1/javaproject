package PracticeProject6;
import java.util.Scanner;

public class ExceptionHandling {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    try {
      System.out.print("Enter the first number: ");
      int num1 = input.nextInt();
      
      System.out.print("Enter the second number: ");
      int num2 = input.nextInt();
      
      int result = num1 / num2;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Exception caught: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Generic exception caught: " + e.getMessage());
    } finally {
      System.out.println("The program has exited the try-catch block.");
    }
    
    System.out.println("Program continues execution...");
  }
}

