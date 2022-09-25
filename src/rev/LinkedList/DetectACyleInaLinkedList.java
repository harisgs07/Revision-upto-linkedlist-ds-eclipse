package rev.LinkedList;

public class DetectACyleInaLinkedList {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	Node head = null;
	
	Node checkElement(int element) {
		Node temp = head;
		while (temp != null) {
			if(temp.data == element)
				return temp;
			temp = temp.next;
		}
		return null;
	}
	
	void addElement(int element) {
		Node newNode = new Node(element);
		Node temp = head;
		if(head==null) {
			head = newNode;
			newNode.next = null;
		}
		else {
			while (temp.next != null) {
				temp = temp.next;
			}
			Node cycleElement = checkElement(element); 
			if( cycleElement == null) {
				temp.next = newNode;
				newNode.next = null;
			}
			else
				temp.next = cycleElement;
		}
	}
	
	void detectCycle() {
		Node slow = head;
		Node faster = head;
		while((faster != null) && faster.next != null) {
			System.out.print(slow.data+"->");
			slow = slow.next;
			faster =  faster.next.next;
			if(faster == slow) {
				System.out.println("Detect Cycle And they are at");
				System.out.println(faster.next.data);
				System.out.println("Last Element is "+ faster.data);
				break;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DetectACyleInaLinkedList obj = new DetectACyleInaLinkedList();
		obj.addElement(10);
		obj.addElement(90);
		obj.addElement(50);
		obj.addElement(90);
		obj.detectCycle();
	}
}
