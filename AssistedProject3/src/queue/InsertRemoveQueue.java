package queue;
import java.util.*;
public class InsertRemoveQueue {

	public static void main(String[] args) {
		 Queue<Integer> queue = new LinkedList<Integer>(); 
		        queue.offer(10);
		        queue.offer(20);
		        queue.offer(30);
		        System.out.println("Queue elements: " + queue);
		        
		        
		        int polled = queue.poll();
		        System.out.println("Polled element: " + polled);
		        
		        
		        System.out.println("Queue elements after polling: " + queue);
		        
		        
		        queue.offer(50);
		        
		        
		        System.out.println("Queue elements after offering: " + queue);
		    }
		
}


