class mylinkedlist {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertionatend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            tail = head = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void deletionAtBeg(){
        if (head==null) {
            System.out.println("nothing to delete");
        }else if(head == tail){
            head = tail = null;
        }else{
            head=head.next;
        }
    }
    public void printLinked(){
        if(head==null){
            System.out.println("linked list is empty");
        }else{
            Node currentnode = head;
            while (currentnode!=null) {
                System.out.print(currentnode.data);
                currentnode=currentnode.next;
            }
            System.out.println();
        }
    }

}

public class LinkedlistDelBeg {
    public static void main(String[] args) {
        mylinkedlist n = new mylinkedlist();
        n.insertionatend(12);
        n.insertionatend(3);
        n.insertionatend(5);
        n.insertionatend(8);
        n.printLinked();
        n.deletionAtBeg();
        n.printLinked();

    }

}