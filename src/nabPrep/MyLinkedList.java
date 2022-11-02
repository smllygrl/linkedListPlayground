package nabPrep;

public class MyLinkedList {
	
	Node head;
	
	// For building content in list
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if(head==null) {
			// If there is no head node, the newNode is the head
			head = newNode;
		} else {
			Node currentNode = head;
			// When the node.next = null, it indicates the end of a LinkedList
			while(currentNode.next!=null) {
				currentNode = currentNode.next;
			}
			// We then change the node.next value to point to the newNode
			currentNode.next = newNode;
		}
	}
	
	public void insertAtStart(int data) {
		// Create a new Node
		Node newNode = new Node();
		// Assign values
		newNode.data = data;
		newNode.next = null;
		// Grab the node which is currently head
		// Make the new node point to it
		newNode.next = head;
		// Assign head to the new node we have created
		head = newNode;
	}
	
	public void insertAt(int index, int data) {
		if(index == 0) {
			insertAtStart(data);
		} else {
		// Create a new Node
		Node newNode = new Node();
		// Assign values
		newNode.data = data;
		newNode.next = null;
		// Assign head for traveling
		Node currentNode = head;
		// Travel to the node 1 before proposed index
		for(int i = 0; i < index-1; i++) {
			currentNode = currentNode.next;
		}
		// We make our newNode point to where the currentNode is pointing
		newNode.next = currentNode.next;
		// We make the currentNode point to our newNode
		currentNode.next = newNode;
		}
	}
	
	public void deleteAt(int index) {
		Node nodeToBeDeleted = null;
		if(index == 0) {
			nodeToBeDeleted = head;
			head = head.next;
		} else {
			Node currentNode = head;
			// Travel to the node 1 before node to be deleted
			for(int i = 0; i < index-1; i++) {
				currentNode = currentNode.next;
			}
			// Assign it to be deleted
			nodeToBeDeleted = currentNode.next;
			// Reassign what the current node is pointing at
			// To what the nodeToBeDeleted was pointing at
			currentNode.next = nodeToBeDeleted.next;
		}
		System.out.println("Deleted " + nodeToBeDeleted.data);
	}
	
	public void print() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
