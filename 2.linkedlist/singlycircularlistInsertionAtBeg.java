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

    public void InsertionAtBeg(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
        }else{
            Node currentNode = head;
            while (currentNode.next != head) {
                currentNode=currentNode.next;
            }
            currentNode.next =newNode;
            newNode.next = head;
        }
        head = newNode;
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

public class singlycircularlistInsertionAtBeg {
public static void main(String[] args) {
    mycircularlinkedlist list = new mycircularlinkedlist();
    list.InsertionAtEnd(5);   
    list.InsertionAtEnd(13);   
    list.InsertionAtEnd(63);   
    list.InsertionAtEnd(45); 
    list.print(); 
    list.InsertionAtBeg(34); 
    list.print();   
}
}
