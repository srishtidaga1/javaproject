package PracticeProject5;
import java.io.*;
public class throwKeyword {
	public static void Validate(int age) {
		try {
		if (age<18)	{
			 throw new ArithmeticException("Person is not eligible to vote"); 
		}
		else {
			System.out.println("Person is eligible to vote!!");
		}
		
	}
		catch(ArithmeticException e) {
			System.out.println("Error occured!!");
		}
		System.out.println("End of the program");
	}

	public static void main(String[] args) {
		Validate(25);
		 

	}
	
}
