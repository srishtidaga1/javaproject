package mul;
import java.util.Scanner;
public class MultipyMatrix {
	     public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows of the first matrix: ");
		        int rows1 = scanner.nextInt();
		        System.out.print("Enter the number of columns of the first matrix: ");
		        int cols1 = scanner.nextInt();
		        System.out.print("Enter the number of rows of the second matrix: ");
		        int rows2 = scanner.nextInt();
		        System.out.print("Enter the number of columns of the second matrix: ");
		        int cols2 = scanner.nextInt();
                if (cols1 != rows2) {
		            System.out.println("Error: Cannot multiply the matrices.");
		            System.exit(0); }
                int[][] A = new int[rows1][cols1];
		        int[][] B = new int[rows2][cols2];
		        System.out.println("Enter the elements of the first matrix: ");
		        for (int i = 0; i < rows1; i++) {
		            for (int j = 0; j < cols1; j++) {
		                A[i][j] = scanner.nextInt(); }}
                System.out.println("Enter the elements of the second matrix: ");
		        for (int i = 0; i < rows2; i++) {
		            for (int j = 0; j < cols2; j++) {
		                B[i][j] = scanner.nextInt(); }
		        }
                int[][] C = new int[rows1][cols2];
                for (int i = 0; i < rows1; i++) {
		            for (int j = 0; j < cols2; j++) {
		                for (int k = 0; k < cols1; k++) {
		                    C[i][j] += A[i][k] * B[k][j];}
		            }
		        }
                System.out.println("The product of the two matrices is:");
		        for (int i = 0; i < rows1; i++) {
		            for (int j = 0; j < cols2; j++) {
		                System.out.print(C[i][j] + " ");  }
		            System.out.println();
		        }
		    }
		}


