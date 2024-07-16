class queue {
    private int queue[];
    private int front;
    private int rear;
    private int capacity;

    public queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        int rear = 0;
        int front = 0;
    }

    public void enqueue(int data){
    if (rear == capacity) {
        System.out.println("queue is overflow");
    }else{
        queue[rear]=data;
        rear++;
        System.out.println(data+"is added in the queue");
    }
    }

    public void dequeue() {
        if (rear!=front) {
            int value = queue[front];
            front++;
            System.out.println(value+" is deleted from the queue");
        }else{
            System.out.println("queue is underflow");
        }
    }

    public void traverse() {
        for (int i=front; i <=rear; i++) {
            System.out.print(queue[i]+" ");
        }
    }
}

public class queueArray {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.traverse();
    }

}