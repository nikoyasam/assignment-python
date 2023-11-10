import java.util.NoSuchElementException;


public class PositionalList {
    Node header;
    Node trailer;
    int size;

    PositionalList() {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.next = trailer;
        size = 0;
    }

    // Adds a new card with rank r and suit s to the hand
    void addACard(int rank, char suit) {  //adds a new card with the given rank and suit to the hand
        // represented by the PositionalList.
        Card card = new Card(rank, suit); // creates a new Card object using the given rank and suit.
        Node node = new Node(card, trailer.prev, trailer); //it creates a new Node object with the
        // Card object, trailer.prev (the node before the trailer), and trailer as its previous,
        // current, and next nodes, respectively.
        trailer.prev.next = node;
        trailer.prev = node;
        size++;  //The Node is inserted between the trailer.prev node and the trailer node by updating
        // the next and prev pointers of the adjacent nodes.
    }

    public int size() {
        return size;
    }  //This method returns the size of the PositionalList.

    // CustomIterator class
    class CustomIterator {  // iterate over all cards in the hand.
        Node current; //Node object representing the current position of the iterator.

        CustomIterator(Node start) {
            current = start;
        }  //object representing the starting position of the iterator.

        boolean hasNext() {
            return current != trailer;
        }

        Card next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the iterator");
            }
            Card card = current.card;
            current = current.next;
            return card;
        }
    }

    // SuitIterator class
    class SuitIterator {  // used to iterate over all cards of a given suit that are currently in the hand.
        Node current;
        char suit;


        SuitIterator(Node start, char suit) {
            this.suit = suit;
            current = start;
            while (current != trailer && current.card.suit != suit) {
                current = current.next;
            }
        }

        boolean hasNext() {
            return current != trailer;
        }

        Card next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the iterator");
            }
            Card card = current.card;
            current = current.next;
            while (current != trailer && current.card.suit != suit) {
                current = current.next;
            }
            return card;
        }
    }

    CustomIterator iterator() {
        return new CustomIterator(header.next);
    }

    SuitIterator suitIterator(char suit) {
        return new SuitIterator(header.next, suit);
    }
    //Node object representing the starting position of the iterator, and a char representing the
    // suit of cards to iterate over

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = header.next;
        while (current != trailer) {
            sb.append(current.card.toString());
            if (current.next != trailer) {
                sb.append(", ");
            }
            current = current.next;
        }
        return sb.toString();
    }


    void removeCard(Card card) {
        Node current = header.next;
        while (current != trailer) {
            if (current.card.equals(card)) {
                Node prevNode = current.prev;
                Node nextNode = current.next;
                prevNode.next = nextNode;
                nextNode.prev = prevNode;
                size--;
                break;
            }
            current = current.next;
        }
    }
}
