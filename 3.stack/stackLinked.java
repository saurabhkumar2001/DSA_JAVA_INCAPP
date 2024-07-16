class Linkedstack {
    private class node {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private node top;
    private int size;

    public Linkedstack(){
        top = null; 
        size = 0;
    }

    public void push(int data) {
        node newnode = new node(data);
        newnode.next = top;
        size++;
        top = newnode;
        System.out.println(data + " is added in the stack");
    }

    public void pop() {
        if (top == null) {
            System.out.println(" stack is underflow");
        } else {
            int value = top.data;
            top = top.next;
            size--;
            System.out.println(value + "is deleted");
        }
    }

    public void traverse() {
        node currentnode = top;
        if (top != null) {
            while (top != null) {
                System.out.println(top.data + ", ");
                top = top.next;
            }
        } else {
            System.out.println("no value for traversing");
        }

    }

}

public class stackLinked {
public static void main(String[] args) {
    Linkedstack stack = new Linkedstack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.pop();
    stack.traverse();
}
}