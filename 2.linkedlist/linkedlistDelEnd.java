class mylinkedlist {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertionatEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void deletionatEnd() {
        if (head == null) {
            System.out.println("nothing to delete");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node currentnode = head;
            while (currentnode.next != tail) {
                currentnode = currentnode.next;
            }
            tail = currentnode;
            currentnode.next = null;
        }
    }

    public void printlinkedlist() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("mylinkedlist is empty");
        } else {
            while (currentNode!=null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
}

public class linkedlistDelEnd {
    public static void main(String[] args) {
        mylinkedlist ll = new mylinkedlist();
        ll.insertionatEnd(2);
        ll.insertionatEnd(3);
        ll.insertionatEnd(4);
        ll.printlinkedlist();
        ll.deletionatEnd();
        ll.printlinkedlist();

    }
}
