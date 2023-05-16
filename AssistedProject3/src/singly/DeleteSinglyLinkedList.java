package singly;

public class DeleteSinglyLinkedList {

	
		
		    private Node head;

		    private static class Node {
		        int data;
		        Node next;

		        Node(int data) {
		            this.data = data;
		            next = null;
		        }
		    }

		    public void delete(int key) {
		        Node current = head;
		        Node previous = null;

		        // if head contains the key
		        if (current != null && current.data == key) {
		            head = current.next;
		            return;
		        }

		        // search for the key in the linked list
		        while (current != null && current.data != key) {
		            previous = current;
		            current = current.next;
		        }

		        // if key not found in the linked list
		        if (current == null) {
		            return;
		        }

		        // remove the first occurrence of key
		        previous.next = current.next;
		    }

		    public void insert(int data) {
		        Node new_node = new Node(data);
		        new_node.next = head;
		        head = new_node;
		    }

		    public void display() {
		        Node current = head;
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		    	DeleteSinglyLinkedList linkedList = new DeleteSinglyLinkedList();

		        linkedList.insert(15);
		        linkedList.insert(88);
		        linkedList.insert(90);
		        linkedList.insert(72);
		        linkedList.insert(65);

		        System.out.println("Original List: ");
		        linkedList.display();

		        int key = 72;
		        linkedList.delete(key);
		        System.out.println("After deleting " + key + ": ");
		        linkedList.display();
		    }
		

	}


