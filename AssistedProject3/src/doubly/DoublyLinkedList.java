package doubly;

public class DoublyLinkedList {

	
		
		    private Node head;

		    private static class Node {
		        int data;
		        Node prev;
		        Node next;

		        Node(int data) {
		            this.data = data;
		            prev = null;
		            next = null;
		        }
		    }

		    public void insert(int data) {
		        Node new_node = new Node(data);

		        if (head == null) {
		            head = new_node;
		            return;
		        }

		        Node current = head;
		        while (current.next != null) {
		            current = current.next;
		        }
		        current.next = new_node;
		        new_node.prev = current;
		    }

		    public void forwardTraversal() {
		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }

		        Node current = head;
		        System.out.print("Forward traversal: ");
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }

		    public void backwardTraversal() {
		        if (head == null) {
		            System.out.println("List is empty");
		            return;
		        }

		        Node current = head;
		        while (current.next != null) {
		            current = current.next;
		        }

		        System.out.print("Backward traversal: ");
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.prev;
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        DoublyLinkedList linkedList = new DoublyLinkedList();

		        linkedList.insert(10);
		        linkedList.insert(20);
		        linkedList.insert(30);
		        linkedList.insert(40);
		        linkedList.insert(50);

		        linkedList.forwardTraversal();
		        linkedList.backwardTraversal();
		    }
		}


	


