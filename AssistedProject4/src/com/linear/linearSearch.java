package com.linear;
import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int [] arr = {5,10,15,20,25,30};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int searchingvalue = sc.nextInt();
		int res = (int) linear(arr,searchingvalue);
		if(res==-1) {
			System.out.println("Element not in the array");
			
		}else {
			System.out.println("Element found at "+res+" and the search key is "+arr[res]);
		}
		
	}
	
	public static int linear(int arr[],int x) {
		int arrlength=arr.length;
		for(int i=0;i<arrlength - 1;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return-1;
	}

}
