package circle;

public class CircularLinkedList {

	
		    private Node head;

		    private static class Node {
		        int data;
		        Node next;

		        Node(int data) {
		            this.data = data;
		            next = null;
		        }
		    }

		    public void insert(int data) {
		        Node new_node = new Node(data);
		        Node current = head;

		        
		        if (head == null) {
		            head = new_node;
		            new_node.next = head;
		            return;
		        }

		        
		        if (data < head.data) {
		            new_node.next = head;
		            head = new_node;
		            return;
		        }

		        
		        while (current.next != head && current.next.data < data) {
		            current = current.next;
		        }

		        new_node.next = current.next;
		        current.next = new_node;
		    }

		    public void display() {
		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }

		        Node current = head;
		        do {
		            System.out.print(current.data + " ");
		            current = current.next;
		        } while (current != head);
		        System.out.println();
		    }

		    public static void main(String[] args) {
		    	CircularLinkedList linkedList = new CircularLinkedList();

		        linkedList.insert(10);
		        linkedList.insert(30);
		        linkedList.insert(20);
		        linkedList.insert(50);
		        linkedList.insert(40);

		        System.out.println("List after insertion: ");
		        linkedList.display();
		    }
		

	}


