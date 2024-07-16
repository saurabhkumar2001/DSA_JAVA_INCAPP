class mylinkedlist {
    public class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertionAtBeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode; 
        }
    }

    public void printForward() {
        if (head == null) {
            System.out.println("nothing to print linked list is empty ");

        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
    public void printBackward() {
        if (head == null) {
            System.out.println("nothing to print linked list is empty ");

        } else {
            Node currentNode = tail;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.previous;
            }
            System.out.println();
        }
    }

}

public class doublylinkedlistinsertion2 {
    public static void main(String[] args) {
        mylinkedlist list = new mylinkedlist();
       list.insertionAtBeg(23);
       list.insertionAtBeg(3);
       list.insertionAtBeg(13);
       list.insertionAtBeg(53);
       list.printForward();
       list.printBackward();
    }


}
