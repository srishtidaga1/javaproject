package com.binary;

public class binarySearch {

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10,12,14};
		int key = 10;
		int arrlength = arr.length;
		binarysearch(arr,0,key,arrlength);

	}
	public static void binarysearch(int[]arr,int start,int key,int length) {
		int midValue=(start+length)/2;
		while(start<=length) {
			if(arr[midValue]<key){
				start=midValue+1;
			}else if(arr[midValue]==key) {
				System.out.println("Element is found at index: "+midValue);
				break;
			}else {
				length=midValue-1;
			}
			midValue=(start+length)/2;
		}
		if(start>length) {
			System.out.println("Element is not found");
		}
	}

}
