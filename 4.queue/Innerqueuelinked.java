class queuelinked {
    private class node {
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
         }
    }
    private node rear;
    private node front;
    private int size;

    public queuelinked() {
        node rear = front = null;
        int size = 0;
    }

    public void enqueue(int data) {
        node newnode = new node(data);
        size++;
        if (rear == null) {
            rear = front= newnode;
            System.out.println(data + " is added to Queue");
        } else {
            rear.next = newnode;
            rear = newnode;
            System.out.println(data + " is added to Queue");
        }
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("queue is empty");
        }
        else {
            if (front == rear) {
                front = rear = null;
            }
            else {
                int value = front.data;
                front = front.next;
                System.out.println(value+" is deleted to Queue");
            }
            size--;
        }
    }

    public void traverse() {
        node currentnode = front;
        if(front!=null){
            while (currentnode!=null) {
                System.out.print(currentnode.data+" ");
                currentnode = currentnode.next;
            }
        }else{
            System.out.print("queue is empty");
        }
      
    }
}

public class Innerqueuelinked {
public static void main(String[] args) {
    queuelinked ql = new queuelinked();
    ql.enqueue(10);
    ql.enqueue(20);
    ql.enqueue(30);
    ql.enqueue(40);
    ql.enqueue(50);
    ql.enqueue(50);
    ql.dequeue();
    ql.traverse();
}
    
}
