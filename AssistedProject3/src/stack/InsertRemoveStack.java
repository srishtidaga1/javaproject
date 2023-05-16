package stack;
import java.util.*;

public class InsertRemoveStack {

	        public static void main(String[] args) {
		        Stack<Integer> stack = new Stack<Integer>(); 
		        stack.push(25);
		        stack.push(20);
		        stack.push(30);
		        System.out.println("Stack elements: " + stack);
		        int poppedElement = stack.pop();
		        System.out.println("Popped element: " + poppedElement);
		        System.out.println("Stack elements after popping: " + stack);
		        stack.push(40);
		        System.out.println("Stack elements after pushing: " + stack);
		    }
		

	}


