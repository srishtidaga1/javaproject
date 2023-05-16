package small;
import java.util.Random;
public class fourthSmallestElement {
	 public static void main(String[] args) {
	        int[] arr = {45,34,87,90,23,76,25,12}; 
	        int k = 4; 
	        int fourthSmallest = findKthSmallestElement(arr, 0, arr.length-1, k); 
	        System.out.println("The " + k + "th smallest element is: " + fourthSmallest);
	    }
            public static int findKthSmallestElement(int[] arr, int left, int right, int k) {
	        if (k > 0 && k <= right - left + 1) {
	            int pos = partition(arr, left, right); 
	            if (pos - left == k - 1) {
	                return arr[pos];
	            } else if (pos - left > k - 1) {
	                return findKthSmallestElement(arr, left, pos-1, k);
	            } else {
	                return findKthSmallestElement(arr, pos+1, right, k-pos+left-1);
	            }
	        }
	        return Integer.MAX_VALUE; 
	   }
            public static int partition(int[] arr, int left, int right) {
	        int pivot = arr[right]; 
	        int i = left;
	        for (int j = left; j < right; j++) {
	            if (arr[j] <= pivot) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                i++;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[right];
	        arr[right] = temp;
	        return i;
	    }
	}


	


