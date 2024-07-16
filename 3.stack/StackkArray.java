import java.util.*;

class ArrayStack {
    private int stack[];
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("no item added stack is full");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " is added in the stack");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack is empty no item is deleted");
        } else {
            int value = stack[top];
            top--;
            System.out.println(value + " is deleted");
        }
    }

    public void traverse() {
        if (top != 1) {
            for (int i = top; i > -1; i--) {
                System.out.print(stack[i] + ", ");
            }
        } else {
            System.out.println("stack is empty");
        }
    }
}

public class StackkArray {
    public static void main(String[] args) {
        ArrayStack Stack = new ArrayStack(5);
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        // Stack.pop();
        Stack.traverse();
    }

}