package stack;

public class StackFromArray {
    int[] myStack;
    int top;
    int capacity;
    public StackFromArray(int size) {
        myStack = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    public boolean isEmpty() {
        return top == -1; // If top is -1, stack is empty
    }  

    public boolean isFull() {
        return top == capacity - 1; // If top is at the last index, stack is full
    }

    public void push(int value){
        if(isFull())
        {
            System.out.println("Stack overflow");
        }
        else
        {
            top++;
            myStack[top] = value; // Add the value to the top of the stack
            System.out.println(value+" pushed to stack");
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return myStack[top--];
        }
    }

    public int peek(){
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return myStack[top];
        }
    }

    

}
