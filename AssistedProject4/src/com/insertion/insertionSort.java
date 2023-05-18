package com.insertion;

public class insertionSort {
             public static void insertionSort(int[] array) {
		        int length = array.length;
		        
		        for (int i = 1; i < length; i++) {
		            int key = array[i];
		            int j = i - 1;
		            
		            
		            while (j >= 0 && array[j] > key) {
		                array[j + 1] = array[j];
		                j--;
		            }
		            
		            
		            array[j + 1] = key;
		        }
		    }
		    
		    public static void main(String[] args) {
		        int[] array = {9, 5, 2, 8, 1, 10};
		        
		        
		        insertionSort(array);
		        
		        
		        System.out.println("Sorted array:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		    }
		}


