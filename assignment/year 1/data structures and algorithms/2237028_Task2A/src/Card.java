public class Card {
    int rank;


    char suit;

    Card(int rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String rankStr;
        String suitStr;
        switch (rank) {
            case 11:
                rankStr = "Jack";
                break;
            case 12:
                rankStr = "Queen";
                break;
            case 13:
                rankStr = "King";
                break;
            case 14:
                rankStr = "Ace";
                break;
            default:
                rankStr = String.valueOf(rank);
        }
        switch (suit) {
            case 'C':
                suitStr = "Clubs";
                break;
            case 'D':
                suitStr = "Diamonds";
                break;
            case 'H':
                suitStr = "Hearts";
                break;
            case 'S':
                suitStr = "Spades";
                break;
            default:
                suitStr = "";
        }
        return rankStr + "-" + suitStr;


    }

}
