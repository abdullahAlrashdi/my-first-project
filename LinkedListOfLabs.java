
public class LinkedListOfLabs {

	private Node head;

	LinkedListOfLabs(){
		head = null;
	}
	public void insertAtFront(lab i) {
		Node newNode = new Node(i);
		newNode.setNext(head);
		head = newNode;
	}
	public void insertAtBack(lab i) {
		Node newNode = new Node(i);
		if(head == null) {
			head = newNode;
		}
		else {
			Node curr = head;
			while(curr.getNext() != null) {
			curr = curr.getNext();
			}
			curr.setNext(newNode);
		}
	}
	public int countLabs(int s){
		int x = 0;
		Node curr = head;
		lab obj;
		int number = 0;
		while(curr != null) {
			try {
		if(curr.getData().getNbPrinters(s) >= 15) 
			number++;
			} catch(Exception e) {}
		curr = curr.getNext();
			}
		return number;
		}
	public void split(LinkedListOfLabs labList1 , LinkedListOfLabs labList2 , int speed) {
		
		Node current = head;
		while(current != null) {
			try {
				if(current.getData().getNbPrinters(speed) >= 15) {
					labList1.insertAtBack(current.getData());
				}
			} catch (Exception e) {
				labList2.insertAtFront(current.getData());
			  }
	   }
	}
}

