//java program to implement circular queue with array 
class Arraycircularqueue {
    private int front, rear, capacity;
    private int size = 0;
    private int Queue[];

    public Arraycircularqueue(int capacity) {
        this.capacity = capacity;
        Queue = new int[capacity];
        front = rear = 0;
    }

    public void enqueue(int data) {
        // queue is empty
        if (size == capacity) {
            System.out.println("queue is full");
        }
        // kya mera queue ander se toh khali nhi h
        if (rear == capacity) {
            rear = 0;
        }
        Queue[rear] = data;
        rear++;
        size++;
        System.out.println(data + " is added");
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("queue is empty");
        }
        if (front == capacity) {
            front = 0;
        }
        int value = Queue[front];
        front++;
        size--;
        System.out.println(value+" is deleted");
    }

    public void traverse() {
        if (size == 0) {
            System.out.println("queue is empty");
        }
        if (front < rear) {
            for (int i = front; i < rear; i++) {
                System.out.print(Queue[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = front; i < capacity; i++) {
                System.out.print(Queue[i] + " ");
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(Queue[i] + " ");

            }
            System.out.println();
        }
    }
}

public class circularqueue {
public static void main(String[] args) {
    Arraycircularqueue q = new Arraycircularqueue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        
        q.traverse();
       
        q.dequeue();
        q.dequeue();
        
        q.traverse();
        
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        
        q.traverse();
        
        q.dequeue();
        q.traverse();
}
    
}