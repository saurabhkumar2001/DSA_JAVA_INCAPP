class mylinkedlist {
    public class Node {
        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    void addNodeAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            tail = n;
            head = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    void addNodeAtBeg(int data) {
        Node n = new Node(data);
        if (head == null) {
            tail = n;
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void addNodeAfterSpecificNodeValue(int locationValue, int data) {
		Node currentNode = head;
		Node locationNode = null;
		while (currentNode != null) {
			if (currentNode.data == locationValue) {
				locationNode = currentNode;
				break;
			}
			currentNode = currentNode.next;
		}
		if (locationNode == null) {
			System.out.println("Location Value does not exist.");
		} else {
			// Create a new node
			Node newNode = new Node(data);
			newNode.next = locationNode.next;
			locationNode.next = newNode;
			if(locationNode==tail) {
				tail=newNode;
			}
		}
	}
    
    void printLinkedlist() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("Linked list is empty!");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
}

public class linklistinsertionSpecific {

    public static void main(String[] args) {
        mylinkedlist ll = new mylinkedlist();
        ll.addNodeAtEnd(12);
        ll.addNodeAtEnd(12);
        ll.addNodeAtEnd(12);
        ll.addNodeAtEnd(12);
        ll.addNodeAtBeg(23);
        ll.addNodeAtEnd(24);
        ll.addNodeAfterSpecificNodeValue(12,13);
        ll.printLinkedlist();

    }
}
