package linerDataStructure;

class Mystack {
	private int arr[];
	private int top;
	private int capacity;

	Mystack(int capacity) {
		this.capacity = capacity;
		top = -1;
		arr = new int[capacity];
	}

	public void push(int num) {

		if (isFull()) {
			System.out.println("stack is full ::");
		} else {
			arr[++top] = num;
			System.out.println(num + " added");
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty ::");
			return -1;
		} else {
			System.out.println(arr[top]+ "pop element form stack");
			return arr[top--];
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty ::");
			return -1;
		}else {
			System.out.println(arr[top]+"is the peek element");
			return arr[top];
		}
	}
	
	public boolean isEmpty() {
		if (top <= 1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == capacity - 1) {
			return true;
		}
		return false;
	}

	public int size() {
		return top - 1;
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
			for(int i=0; i<=top; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}


public class Stack {
	public static void main(String[] args) {
		int size = 10;
		Mystack ss = new Mystack(size);
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		ss.push(50);
		ss.push(60);
		ss.display();
	}
	
}
