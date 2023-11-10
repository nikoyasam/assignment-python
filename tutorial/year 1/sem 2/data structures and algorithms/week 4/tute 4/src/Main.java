class Stack{
    int[] Stack = new int[8];
    int maxSize; // is an integer that will hold the maximum size of the stack.
    int top; //is an integer that will keep track of the top element in the stack.
    int stackArray[]; //is an integer array that will hold the elements of the stack.
    Stack(int max){ //constructor created to pass the argument
        top=-1;
        maxSize = max;
        stackArray = new int[maxSize];

    }

    public boolean isEmpty(){  //check if stack is empty
        return  (top == -1);  //It returns a boolean value based on whether the top variable is equal to -1 or not.

    }
    void push (int x){  //method to add an element to the stack
        if (isFull()){
            System.out.println("Stack overflow");

        }
        else{
            stackArray[++top] = x ;
        }
    }

    public int pop(){  // method to remove the top element from the stack.
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return-1; //It returns the element that was removed.
        }
        else{
            return stackArray[top--]; //it returns the value of the stackArray at the current top index and then decrements top.
        }

    }

    public int peek(){  //get the value of the top element without removing it.
        if (isEmpty()){  //first checks if the stack is empty by calling the isEmpty() method. If it is, it prints "System underflow" and returns -1.
            System.out.println("System underflow");
            return-1;
        }
        else{
            return stackArray[top];
        }
    }

    public boolean isFull(){

        return (top == (maxSize-1));
    }  //check if stack is full

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