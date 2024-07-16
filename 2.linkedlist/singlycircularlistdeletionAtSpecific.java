class mycircularlinkedlist {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void InsertionAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }
    }

    public void deletionAtSpecific(int locationValue) {
        if (head == null) {
            System.out.println("linkedlist is empty");
        } else {
            Node currentNode = head;
            Node previousNode = null;
            do {
                if (currentNode.data == locationValue) {
                    if (currentNode == head) {
                        head = head.next;
                        break; // Exit loop since head is deleted
                    } else {
                        previousNode.next = currentNode.next;
                        break; // Exit loop after deletion
                    }
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            } while (currentNode != head);
            currentNode = currentNode.next;
            if (currentNode == head) {
                System.out.println("Node not found in the list");
            }
        }

    }

    

    public void print() {
        if (head == null) {
            System.out.println("circular linked list is empty");
        } else {
            Node currentNode = head;
            do {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            } while (currentNode != head);
        }
        System.out.println();
    }
}

public class singlycircularlistdeletionAtSpecific {

    public static void main(String[] args) {
        mycircularlinkedlist list = new mycircularlinkedlist();
        list.InsertionAtEnd(5);
        list.InsertionAtEnd(13);
        list.InsertionAtEnd(63);
        list.InsertionAtEnd(45);
        list.deletionAtSpecific(13);
        list.print();

    }
}
