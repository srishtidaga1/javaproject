package com.selection;

public class selectionSort {
                public static void selectionSort(int[] array) {
		        int length = array.length;
		        
		        for (int i = 0; i < length - 1; i++) {
		            int minIndex = i;
		            
		            
		            for (int j = i + 1; j < length; j++) {
		                if (array[j] < array[minIndex]) {
		                    minIndex = j;
		                }
		            }
		            
		            
		            int temp = array[minIndex];
		            array[minIndex] = array[i];
		            array[i] = temp;
		        }
		    }
		    
		    public static void main(String[] args) {
		        int[] array = {9, 5, 2, 8, 1, 10};
		        
		        
		        selectionSort(array);
		        
		        
		        System.out.println("Sorted array:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		    }
		}


