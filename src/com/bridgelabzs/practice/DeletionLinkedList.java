package com.bridgelabzs.practice;
import java.util.*;
public class DeletionLinkedList  {

	int data;
	Node next;
	
	public  Node(int data) {
		this.data=data;
		this.next=null;
	}

}
class CircularLinkedList{
	Node head;
	
	void insert(int data) {
		Node newNode = new Node(data);
            if(head ==null) {
			head = newNode;
			newNode.next = head;
		}else {
			Node current = head;
			while (current = current!= head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
		}
	}
	void display() {
		if(head == null) {
			System.out.println("CircularLinkrd Listis empty.");
			return;
		}
		Node current = head;
		do {
			System.out.println(current.data+" ");
			current = current.next;
		
		}while (current != head);
		System.out.println();
	}
	void delete (int value) {
		if (head == null) {
			System.out.println("Circular Linked List is empty.Cannot delete.");
			return;
		}
		Node current = head;
		Node prev = null;
		do {
			if(current.data == value) {
				if (prev  == null) {
					Node lastNode = head;
					while (lastNode.next != head) {
						lastNode = lastNode.next;
					}
					head = head.next;
					lastNode.next = head;
				}else {
					prev.next = current.next;
				}
				System.out.println("Node with value"+ value+"deleted." );
				return;
			}
			prev = current;
			current = current.next;
		}
		while(current = != head);
		System.out.println("Node with value"+ "not found.");
	}
}
public class circularLinkedList{
	public static void main(String[] args) {
		CircularLinkedList circularList = new CircularLinkedList();
	circularList.insert(1);
	circularList.insert(2);
	
	System.out.println("Original Circular Linked List:");
	circularList.delete(2);
	
	
	System.out.println("Modified Circular Linked List:");
	
	circularList.display();
	
				
					}
				

		}
		
		
	
	



	
	


