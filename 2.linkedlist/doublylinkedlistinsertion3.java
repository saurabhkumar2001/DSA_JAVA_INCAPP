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

    public void insertionAtSpecificAfter(int data,int locationValue) {
        if(head == null){
            System.out.println("there is no such node in the linkedlist");
        }else if(locationValue == tail.data){
            Node newNode = new Node(data);
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        else{
            Node newNode = new Node(data);
            Node currentNode = head;
            Node locationNode = null;
            while(currentNode!=null){
                if(currentNode.data == locationValue){
                    locationNode = currentNode;
                    break;
                }
                currentNode = currentNode.next;
            }
            if(locationNode == null){
                System.out.println("no location found!");
            }else{
                locationNode.next.previous = newNode;
                newNode.next = locationNode.next;
                locationNode.next = newNode;
                newNode.previous = locationNode;
            }
           
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

public class doublylinkedlistinsertion3 {
    public static void main(String[] args) {
        mylinkedlist list = new mylinkedlist();
        list.insertionAtEnd(12);
        list.insertionAtEnd(23);
        list.insertionAtEnd(5);
        list.insertionAtEnd(33);
        list.insertionAtSpecificAfter(55, 5);
       list.printForward();
       list.printBackward();
    }


}
