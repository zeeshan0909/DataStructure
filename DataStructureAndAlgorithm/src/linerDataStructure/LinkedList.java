package linerDataStructure;
class Node{
	int data;
	Node next;
	private int size;
	Node(int data){
		this.data = data;
		this.next = null;
		size++;
	}
}


class MyList{
	
	Node head;
	int size = 0;
	MyList(){
		head = null;
	}
	
	public void addFirst(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}else {
			node.next = head;
			head = node;
		}
	}
	
	public void addLast(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = node;
		}
	} 
	
	public void printList() {
		if(head == null)
			System.out.println("list is empty");
		
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
		System.out.print("null");
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("linkedlist is null");
			return;
		}
		size--;
		System.out.println("delete element is : " + head);
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node secondlast = head;
		Node last = head.next;
		while(last.next != null) {
			last = last.next;
			secondlast = secondlast.next;
		}
		secondlast.next = null;
		size--;
	}
}


public class LinkedList {
	public static void main(String[] args) {
		MyList ll = new MyList();
				ll.addLast(10);
				ll.addLast(20);
				ll.addLast(30);
				ll.printList();
		
	}

}
