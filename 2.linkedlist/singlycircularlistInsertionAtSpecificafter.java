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
        if(head == null){
            head = newNode;
            newNode.next = head;
        }else{
            Node currentNode = head;
            while (currentNode.next!=head) {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
            newNode.next = head;
        }
    }

    public void insertionAtSpecificAfter(int data,int locationValue){
        Node newNode = new Node(data);
        Node currentNode = head;
        Node locationNode = null;
       do {
        if(currentNode.data == locationValue){
            locationNode = currentNode;
        }
        currentNode = currentNode.next;
       } while (currentNode!=head);
        if(locationNode == null){
            System.out.println("there is no as such location");
        }else{
            if(locationNode.next==head){
                newNode.next = head;
                locationNode.next = newNode;
            }else{
                 newNode.next = locationNode.next;
                 locationNode.next = newNode;
            }
        }

    }

    public void print(){
        if(head==null){
            System.out.println("circular linked list is empty");
        }else{
            Node currentNode = head;
           do{
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
           }while(currentNode!=head);
        }
        System.out.println();
    }
}

public class singlycircularlistInsertionAtSpecificafter {
    public static void main(String[] args) {
        mycircularlinkedlist list = new mycircularlinkedlist();
        list.InsertionAtEnd(5);   
        list.InsertionAtEnd(13);   
        list.InsertionAtEnd(63);   
        list.InsertionAtEnd(45); 
        list.insertionAtSpecificAfter(3, 13);
        list.insertionAtSpecificAfter(50, 45);
        list.print();   
    } 
}
