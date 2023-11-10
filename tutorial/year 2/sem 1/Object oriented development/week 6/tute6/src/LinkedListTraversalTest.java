import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTraversalTest {
    public static void main(String[] args) {
        int numElements = 5_000_000;
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Populate the linked list with 5 million integers
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }

        // Measure time to traverse the list using an iterator
        long startTimeIterator = System.currentTimeMillis();
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
        }
        long endTimeIterator = System.currentTimeMillis();
        long durationIterator = endTimeIterator - startTimeIterator;
        System.out.println("Traversing with iterator took " + durationIterator + " milliseconds");

        // Measure time to traverse the list using the get(index) method
        long startTimeGet = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            Integer value = linkedList.get(i);
        }
        long endTimeGet = System.currentTimeMillis();
        long durationGet = endTimeGet - startTimeGet;
        System.out.println("Traversing with get(index) took " + durationGet + " milliseconds");
    }
}
