/*
class Stack{
    int[] Stack = new int[8];
    int maxSize;
    int top;
    int stackArray[];
    Stack(int max){
        top=-1;
        maxSize = max;
        stackArray = new int[maxSize];

    }

    public boolean isEmpty(){
        return  (top == -1);

    }
    void push (int x){
        if (isFull()){
            System.out.println("Stack overflow");

        }
        else{
            stackArray[++top] = x;
        }
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return-1;
        }
        else{
            return stackArray[top--];
        }

    }

    public int peek(){
        if (isEmpty()){
            System.out.println("System underflow");
            return-1;
        }
        else{
            return stackArray[top];
        }
    }

    public boolean isFull(){
        return (top == (maxSize-1));
    }

}
public class Main {
    public static void main(String[] args) {
       Stack stack = new Stack(8);

        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(62);
        stack.push(89);
        stack.push(32);
        stack.push(67);
        stack.push(21);
        stack.push(39);
        stack.push(88);
        stack.push(55);
        stack.push(94);

        System.out.println("Popped item: " + stack.pop());
        System.out.println("Popped item: " + stack.pop());
        System.out.println("Popped item: " + stack.pop());

        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("Peek item: " + stack.peek());
        System.out.println("Peek item: " + stack.peek());

    }

}


/*
import java.util.LinkedList;

public class stackExample {
    private LinkedList<Integer> stack;

    public stackExample() {
        stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int data) {
        stack.addFirst(data);
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack.removeFirst();
        }
    }

    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack.getFirst();
        }
    }

    public static void main(String[] args) {
        stackExample stack = new stackExample();

        // Check if stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        // Insert elements into the stack
        stack.push(62);
        stack.push(89);
        stack.push(32);
        stack.push(67);
        stack.push(21);
        stack.push(39);
        stack.push(88);
        stack.push(55);
        stack.push(94);

        // Call pop method 3 times
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Call peek method 2 times
        System.out.println("Peek element: " + stack.peek());
        System.out.println("Peek element: " + stack.peek());
    }
}
*/

