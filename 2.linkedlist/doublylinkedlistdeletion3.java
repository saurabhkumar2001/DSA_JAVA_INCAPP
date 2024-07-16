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

    public void deletionForSpecific(int locationvalue){
        if(head == null){
            System.out.println("no node to delete");
        }
        else if(locationvalue == head.data && head==tail){
            head = tail = null;
        }
        else if(locationvalue == head.data){
            head = head.next;
            head.previous =null;
        }
        else if(locationvalue == tail.data){
            tail=tail.previous;
            tail.next =null; 
        }
        
        else{
            Node currentNode = head;
            Node locationNode = null;
           while(currentNode!=null){
            if(currentNode.data == locationvalue){
                locationNode = currentNode;
                break;
            }
            currentNode = currentNode.next;
           }
           if(locationNode == null){
            System.out.println("nothing to print");
           }else{
               locationNode.previous.next = locationNode.next;
            locationNode.next.previous = locationNode.previous;
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

public class doublylinkedlistdeletion3{
    public static void main(String[] args) {
        mylinkedlist list = new mylinkedlist();
        list.insertionAtEnd(12);
        list.insertionAtEnd(23);
        list.insertionAtEnd(34);
        list.insertionAtEnd(56);
        list.insertionAtEnd(67);
        list.printForward();
        list.deletionForSpecific(12);
        list.deletionForSpecific(34);
        list.deletionForSpecific(67);
        list.printForward();
    }


}
