public class Queue {
    private int front; //keep track of the front of the queue
    private int rear;  //will keep track of the rear of the queue
    private int noOfItems;  //track of the number of items  in the queue,
    private int maxSize;  //
    private int queueArray[];

    public Queue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        noOfItems = 0;
        queueArray = new int[maxSize];
    }

    public boolean isEmpty() {  //method returns true if the queue is empty
        return (noOfItems == 0);
    }

    public boolean isFull() { //This method returns true if the queue is full
        return (noOfItems == maxSize);
    }

    public boolean enqueue(int item) {  //method adds an item to the rear of the queue. If the queue is full, it prints a message saying so and returns false
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        } else {
            rear = (rear + 1) % maxSize;  //increments rear (using modular arithmetic to wrap around to the front of the array if necessary), sets the element at the new rear position to item, increments noOfItems, and returns true.
            queueArray[++rear] = item;
            noOfItems++;
            return true;
        }
    }

    public int dequeue() {  //method removes an item from the front of the queue.
        if (isEmpty()) {
            System.out.println("Queue is Empty"); // If the queue is empty, it prints a message saying so and returns -1
            return -1;
        } else {
            noOfItems--; //Otherwise, it decrements noOfItems,
            // saves the element at the front of the queue to a variable dequeuedItem,
            // increments front and returns dequeuedItem.
            return queueArray[front++];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(8);

        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }

        queue.enqueue(62);
        queue.enqueue(89);
        queue.enqueue(32);
        queue.enqueue(67);
        queue.enqueue(67);
        queue.enqueue(21);
        queue.enqueue(39);
        queue.enqueue(88);
        queue.enqueue(55);
        queue.enqueue(94);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        queue.enqueue(89);

        if (queue.isFull()) {
            System.out.println("The queue is full");
        } else {
            System.out.println("The queue is not full");
        }
    }
}



