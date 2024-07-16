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

    public void insertionAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    public void deletionAtBeg(){
        if(head == null){
            System.out.println("no node to delete");
        }else{
            head = head.next;
            head.previous = null;
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

public class doublylinkedlistdeletion2 {
    public static void main(String[] args) {
        mylinkedlist list = new mylinkedlist();
        list.insertionAtEnd(12);
        list.insertionAtEnd(23);
        list.insertionAtEnd(34);
        list.insertionAtEnd(56);
        list.insertionAtEnd(67);
        list.printForward();
        list.deletionAtBeg();
        list.printForward();
    }


}
