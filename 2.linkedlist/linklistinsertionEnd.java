 class mylinkedlist {
     class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public node head = null;
    public node tail = null;
    public void addNodeAtEnd(int data){
        node n = new node(data);
        if (head == null) {
            head = n;
            tail = n;
        }else{
            //new node will added after tail
            tail.next = n;
            //new node will become new tail
            tail = n;
        }
    }
    public void printlist(){
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
public class linklistinsertionEnd{
    public static void main(String[] args) {
        mylinkedlist my = new mylinkedlist();
        my.printlist();
        my.addNodeAtEnd(10);
        my.addNodeAtEnd(1);
        my.addNodeAtEnd(13);
        my.addNodeAtEnd(17);
        my.printlist();
    }
}