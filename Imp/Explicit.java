package Imp;
import java.util.Scanner;

public class Explicit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" Enter the value of double  : ");
		double g = sc.nextDouble() ;
		System.out.println("");
		//Explicit TypeCasting
		System.out.println("Explicit TypeCasting");
		System.out.println("-----------------------------");
		
		float h = (float)g;
		System.out.println("float value is : " +h);
		
		long i = (long)h;
		System.out.println("long value is : " +i);
		
		int j = (int)i;
		System.out.println("int value is : " +j);
		
		short k = (short)j;
		System.out.println("short value is : " +k);
		
		byte l = (byte)k;
		System.out.println("byte value is : " +l);
      }

}

