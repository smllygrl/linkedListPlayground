package nabPrep;

public class Runner {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.insert(24);
		list.insert(34);
		list.insert(44);
		list.insertAtStart(14);
		list.insertAt(2, 100);
		list.insertAt(0, 0);
	
		list.print();
		
		list.deleteAt(2);
			
		list.print();
		
		list.deleteAt(0);
		
		list.print();
	}

}
