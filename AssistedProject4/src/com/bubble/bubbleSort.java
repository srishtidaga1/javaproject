package com.bubble;

public class bubbleSort {
            public static void bubbleSort(int[] array) {
		        int length = array.length;
		        
		        for (int i = 0; i < length - 1; i++) {
		            // Last i elements are already in place, so no need to iterate through them
		            for (int j = 0; j < length - i - 1; j++) {
		                // Compare adjacent elements and swap them if the order is incorrect
		                if (array[j] > array[j + 1]) {
		                    int temp = array[j];
		                    array[j] = array[j + 1];
		                    array[j + 1] = temp;
		                }
		            }
		        }
		    }
		    
		    public static void main(String[] args) {
		        int[] array = {9, 5, 2, 8, 1, 10};
		        
		        // Call the bubbleSort method to sort the array
		        bubbleSort(array);
		        
		        // Print the sorted array
		        System.out.println("Sorted array:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		    }
		

	}


