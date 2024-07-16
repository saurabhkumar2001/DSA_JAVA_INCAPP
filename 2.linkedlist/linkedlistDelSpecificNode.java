class mylinkedlist {
     class Node {
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

    public void deletionatSpecificNode(int locationValue) {
        if (head == null) {
            System.out.println("this linked list is empty");
        }else if(head.data==locationValue){
            head = head.next;
        }else{
            Node currentNode = head;
            Node loacationNode = null;
            Node previousNode = null;
            while (currentNode!=null) {
                if(currentNode.data==locationValue){
                    loacationNode  = currentNode;
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            if(loacationNode == null){
                System.out.println("there is no element present at this value");
            }else{
                previousNode.next = loacationNode.next;
                if(loacationNode==tail){
                    tail=previousNode;
                }
            }
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
public class linkedlistDelSpecificNode {
    public static void main(String[] args) {
        mylinkedlist list = new mylinkedlist();
        list.insertionatEnd(3);
        list.insertionatEnd(5);
        list.insertionatEnd(7);
        list.printlinkedlist();  
        list.deletionatSpecificNode(5);
        list.printlinkedlist();  
    }
 
}
