package Imp;
import java.util.Scanner;

public class Implicit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of byte  : ");
		byte a = sc.nextByte() ;
		System.out.println("");
		
		// Implicit TypeCasting
		System.out.println("Implicit TypeCasting");
		System.out.println("--------------------------");
		
		short b = a;
		System.out.println("short value is : " +b );
		
		int c = b;
		System.out.println("int value is : " +c );
		
		long d = c;
		System.out.println("long value is : " +d );
		
		float e = d;
		System.out.println("float value is : " +e );
		
		double f = e;
		System.out.println("double value is : " +f );
		}

}

