package com.exponential;
public class exponentialSearch {
       public static int exponentialSearch(int[] array, int target) {
		        int length = array.length;
		        if (array[0] == target) {
		            return 0;
		        }
		        int i = 1;
		        while (i < length && array[i] <= target) {
		            i = i * 2;
		        }
		        return binarySearch(array, target, i / 2, Math.min(i, length - 1));
		    }
		    public static int binarySearch(int[] array, int target, int left, int right) {
		        while (left <= right) {
		            int mid = left + (right - left) / 2;
		             if (array[mid] == target) {
		                return mid;
		            }
		             if (array[mid] > target) {
		                right = mid - 1;
		            }
		            else {
		                left = mid + 1;
		            }
		        }
		      return -1;
		    }
		    public static void main(String[] args) {
		        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};
		        int target = 11;
		        int index = exponentialSearch(array, target);
		        if (index != -1) {
		            System.out.println("Element found at index: " + index);
		        } else {
		            System.out.println("Element not found in the array.");
		        }
		    }
		}


