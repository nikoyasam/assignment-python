import java.util.*;

public class Player {
    String name;  //represents the name of the player
    PositionalList hand;  //The player's hand is represented using a PositionalList
    //The hand is sorted by suit and then by rank

    Player(String name) { //constructor for the Player class
        this.name = name;  //takes a string argument name
        hand = new PositionalList();  //initializes the instance variables name and hand.


    }

    void addCard(int rank, char suit) {  //method takes an integer representing the rank of the card
        // and a character representing the suit of the card.

        hand.addACard(rank, suit);  // It adds a new card with the given rank and suit to the player's
        // hand.
    }

    Card playACard(char suit) {  //method takes a character representing the suit of the card to be played.
        if (hand.size == 0) {  //checks if there are any cards left in the player's hand
            throw new IllegalStateException("No cards left in hand");// If there are no cards left,
            // it throws an exception.
        }


        PositionalList.SuitIterator iterator = hand.suitIterator(suit);  //If there are cards left,
        // it gets an iterator for all cards of the specified suit using the suitIterator() method of
        // hand
        if (iterator.hasNext()) {
            Card card = iterator.next();  //If there are cards of the specified suit, it removes
            // the first card and returns it.
            hand.removeCard(card);
            return card;
        } else {
            throw new NoSuchElementException("No cards of that suit in hand"); // If there are no
            // cards of the specified suit, it removes an arbitrary card and returns it.
        }
    }

    java.util.Iterator<Card> iterator() {
        return (Iterator<Card>) hand.iterator();
    }
    //This method returns an iterator for all cards currently in the player's hand.


    PositionalList.SuitIterator suitIterator(char suit) {
        return hand.suitIterator(suit);
    }
    //takes a character suit representing the suit of the cards to iterate over, and returns an
    // iterator for all cards of that suit that are currently in the player's hand.


    void finalDeal(List<Card> deals, int numCards) { //a list of Card objects named deals, and an
        // integer numCards.
        List<Card> allCards = new ArrayList<>(); //creates a new ArrayList object named allCards that
        // will be used to store all the Card objects from the hand and the deals list.
        PositionalList.CustomIterator iterator = hand.iterator(); //used to iterate over the Card
        // objects in the hand list.
        while (iterator.hasNext()) {  //iterator object to loop through all the Card objects in the
            // hand list
            allCards.add(iterator.next());   // add them to the allCards list.
        }
        allCards.addAll(deals);  //adds all the Card objects from the deals list to the allCards list.
        Random random = new Random();
        for (int i = 0; i < numCards; i++) {
            if (allCards.size() == 0) {
                break;
            }
            int index = random.nextInt(allCards.size());  // select a random Card object from the allCards list.
            Card card = allCards.remove(index);  //selected Card object is then removed from the allCards list
            addCard(card.getRank(), card.getSuit()); // added to the hand using the addCard method
        }
    }

    void sortHand() {
        PositionalList sortedHand = new PositionalList(); //list used to sort the cards
        for (char suit : new char[]{'C', 'D', 'H', 'S'}) { //uses a for each loop to assign each suit to
            //variable suit
            for (int rank = 2; rank <= 14; rank++) { //iterates over each rank from 2 to 14 (inclusive)
                PositionalList.SuitIterator iterator = hand.suitIterator(suit);
                //This line creates a new "SuitIterator" object for the current suit and assigns it to the variable "iterator"
                while (iterator.hasNext()) { //iterates over each card in the hand with the current suit.
                    Card card = iterator.next(); // gets the next card from the iterator and assigns it to the variable "card".
                    if (card.rank == rank) { // checks if the rank of the current card matches the rank being searched for in the outer loop.
                        sortedHand.addACard(rank, suit); // checks if the rank of the current card matches the rank being searched for in the outer loop.
                        hand.removeCard(card); // line removes the current card from the "hand" object.
                    }
                }
            }
        }
        hand = sortedHand; //replaces the original unsorted hand with the sorted one.


    }

    @Override
    public String toString() {
        return name + ": " + hand.toString();
    }
}
