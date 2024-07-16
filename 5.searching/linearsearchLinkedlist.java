class linkedlist{
     class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void insertionLinked(int data){
        Node n = new Node(data);
        if(head == null){
            head = tail = n;
        }else{
            tail.next = n;
            tail = n;
        }
    }

    public void printlist(){
        if (head == null) {
            System.out.print("linked list is empty");
        }else{
            Node currentNode = head;
            while (currentNode!=null) {
                System.out.print(currentNode.data+" ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    void search(int value){
        boolean flag = true;
        Node currentNode = head;
        while (currentNode!=null) {
            if(value == currentNode.data){
                System.out.println(value + " found ");
                flag = false;
                break;
            }
            currentNode = currentNode.next;
        }
        if (flag) {
            System.out.println("value not found");
        }
    }
}
public class linearsearchLinkedlist {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertionLinked(3);
        list.insertionLinked(13);
        list.insertionLinked(23);
        list.insertionLinked(33);
        list.insertionLinked(43);
        list.insertionLinked(53);
        list.printlist();
        list.search(83);
    }
}
