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
			curr = node;
		}
	} 
	
	public void printList() {
		if(head == null)
			System.out.println("list is empty");
		
		Node curr = head;
		while(curr.next != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
		System.out.print("null");
	}
	
	
}


public class LinkedList {
	public static void main(String[] args) {
		
	}

}
