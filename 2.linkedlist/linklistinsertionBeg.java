class linkedlist{
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public node head = null;
    public node tail = null;

    public void addNodeAtBeg(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addNodeAtEnd(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            //newnode ek object h jiska naam tail h and tail class  k ander do variable h data and next toh next k ander new node k refernce ko paas krte h baad m vhi tail ko newnode assign kr dete h 
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printLinkedlist(){
        if(head==tail){
            System.out.println("Linked list is empty");
        }else{
            node currentnode = head;
            while (currentnode!=null) {
                System.out.print(currentnode.data+" -> ");
                currentnode = currentnode.next;
        }
        System.out.println();
    }
}
}
public class linklistinsertionBeg
{
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addNodeAtEnd(10);
        list.addNodeAtEnd(10);
        list.addNodeAtEnd(10);
        list.addNodeAtBeg(45);
        list.addNodeAtEnd(10);
        list.addNodeAtEnd(10);
        list.addNodeAtEnd(10);
        list.addNodeAtEnd(10);
        list.addNodeAtBeg(23);
        list.printLinkedlist();
    }
}
