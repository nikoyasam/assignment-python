import java.util.*;

public class Player {
    String name;
    PositionalList hand;

    Player(String name) {
        this.name = name;
        hand = new PositionalList();
    }

    void addCard(int rank, char suit) {
        Card card = new Card(rank, suit);
        hand.addACard(rank, suit);
    }

    Card playACard(char suit) {
        if (hand.size == 0) {
            throw new IllegalStateException("No cards left in hand");
        }


        PositionalList.SuitIterator iterator = hand.suitIterator(suit);
        if (iterator.hasNext()) {
            Card card = iterator.next();
            hand.removeCard(card);
            return card;
        } else {
            throw new NoSuchElementException("No cards of that suit in hand");
        }
    }

    java.util.Iterator<Card> iterator() {
        return (Iterator<Card>) hand.iterator();
    }


    PositionalList.SuitIterator suitIterator(char suit) {
        return hand.suitIterator(suit);
    }


    void finalDeal() {
        List<Card> cards = new ArrayList<>();
        PositionalList.CustomIterator iterator = hand.iterator();
        while (iterator.hasNext()) {

            cards.add(iterator.next());
        }
        cards.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        hand = new PositionalList();
        for (Card card : cards) {
            hand.addACard(card.rank, card.suit);
        }
    }


    void sortHand() {
        PositionalList sortedHand = new PositionalList();
        for (char suit : new char[]{'C', 'D', 'H', 'S'}) {
            for (int rank = 2; rank <= 14; rank++) {
                PositionalList.SuitIterator iterator = hand.suitIterator(suit);
                while (iterator.hasNext()) {
                    Card card = iterator.next();
                    if (card.rank == rank) {
                        sortedHand.addACard(rank, suit);
                        hand.removeCard(card);
                    }
                }
            }
        }
        hand = sortedHand;
    }

    @Override
    public String toString() {
        return name + ": " + hand.toString();
    }
}
