public class Node {
    Card card;
    Node next;
    Node prev;

    Node(Card card, Node prev, Node next) {
        this.card = card;
        this.prev = prev;
        this.next = next;
    }
}
