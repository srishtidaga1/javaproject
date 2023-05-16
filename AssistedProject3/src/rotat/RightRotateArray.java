package rotat;
import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int a = 5;
        System.out.println("Original Array: " + Arrays.toString(arr));
        rightRotate(arr, a);
        System.out.println("Right Rotated Array: " + Arrays.toString(arr));
    }
        public static void rightRotate(int[] arr, int a) {
        int n = arr.length;
        a = a % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, a - 1);
        reverse(arr, a, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
