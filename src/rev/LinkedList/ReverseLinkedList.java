package rev.LinkedList;

public class ReverseLinkedList {
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	Node head = null;
	
	void addElement(int element) {
		Node newNode = new Node(element);
		Node temp = head;
		if(head==null)
			head = newNode;
		else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		newNode.next = null;
	}
	
	void reverseList() {
		Node prev = null;
		Node current = null;
		Node temp = head;
		while (temp!=null) {
			current = temp;
			temp = temp.next;
			current.next = prev;
			prev = current;
		}
		head = current;
	}
	
	void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList obj = new ReverseLinkedList();
		obj.addElement(10);
		obj.addElement(90);
		obj.addElement(50);
		obj.print();
		obj.reverseList();
		System.out.println("Reversed Linked List");
		obj.print();
		
	}

}
