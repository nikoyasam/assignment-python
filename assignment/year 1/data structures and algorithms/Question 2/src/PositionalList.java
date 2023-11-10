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
    void addACard(int rank, char suit) {
        Card card = new Card(rank, suit);
        Node node = new Node(card, trailer.prev, trailer);
        trailer.prev.next = node;
        trailer.prev = node;
        size++;
    }

    public int size() {
        return size;
    }

    // CustomIterator class
    class CustomIterator {
        Node current;

        CustomIterator(Node start) {
            current = start;
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
            return card;
        }
    }

    // SuitIterator class
    class SuitIterator {
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
