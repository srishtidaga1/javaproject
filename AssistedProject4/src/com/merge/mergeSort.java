package com.merge;
public class mergeSort {
		    public static void mergeSort(int[] array) {
		        int length = array.length;
		        
		        if (length < 2) {
		            return;
		        }
		        int mid = length / 2;
		        int[] left = new int[mid];
		        int[] right = new int[length - mid];
		        for (int i = 0; i < mid; i++) {
		            left[i] = array[i];
		        }
		        for (int i = mid; i < length; i++) {
		            right[i - mid] = array[i];
		        }
		        mergeSort(left);
		        mergeSort(right);
		        merge(left, right, array);
		    }
		   public static void merge(int[] left, int[] right, int[] array) {
		        int leftLength = left.length;
		        int rightLength = right.length;
		        int i = 0, j = 0, k = 0;
		        while (i < leftLength && j < rightLength) {
		            if (left[i] <= right[j]) {
		                array[k] = left[i];
		                i++;
		            } else {
		                array[k] = right[j];
		                j++;
		            }
		            k++;
		        }
		       while (i < leftLength) {
		            array[k] = left[i];
		            i++;
		            k++;
		        }
		        while (j < rightLength) {
		            array[k] = right[j];
		            j++;
		            k++;
		        }
		    }
		    
		    public static void main(String[] args) {
		        int[] array = {9, 5, 2, 8, 1, 10};
		        mergeSort(array);
		        System.out.println("Sorted array:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		    }
		  }


