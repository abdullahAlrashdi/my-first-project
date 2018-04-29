
public class Node {

	private lab data;
	public lab getData() {
		return data;
	}

	public void setData(lab data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	private Node next;
	
	Node(lab n){
		this.data =n;
	}
	
}
