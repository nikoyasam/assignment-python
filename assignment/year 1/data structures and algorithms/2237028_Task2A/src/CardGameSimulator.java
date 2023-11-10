import java.util.*;

public class CardGameSimulator {
    public static void finalDeal(List<Player> players) {
        System.out.println("\n\nFinal Deal:");
        for (Player player : players) {
            System.out.println(player.name + ": " + player.hand);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of players (between 2, 4 or 13):");
        int numPlayers = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                numPlayers = Integer.parseInt(scanner.nextLine());
                if (numPlayers == 2 || numPlayers == 4 || numPlayers == 13) {
                    validInput = true;
                } else {
                    System.out.println("Invalid number of players. Enter a number between 2, 4 or 13:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a valid integer.");
            }
        }

        Player[] players = new Player[numPlayers]; //create an array of Player objects named players,
        // with a length equal to the numPlayers variable.
        for (int i = 0; i < numPlayers; i++) {
            String playerName = "Player " + (i + 1);
            players[i] = new Player(playerName);
        }

        int dealCount = 1;
        int cardIndex = 0;
        ArrayList<String> mainDeck = new ArrayList<>();
        //main deck with all the cards
        for (String suit : new String[]{"S", "H", "D", "C"}) { //creates a standard deck of cards by
            // iterating over each combination of rank and suit,
            for (String rank : new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"}) {
                mainDeck.add(rank + "-" + String.valueOf(suit)); //adding each card to the deck
            }
        }
        Collections.shuffle(mainDeck); //shuffles the main deck randomly
        while(!mainDeck.isEmpty()){  //This loop deals out the cards to the players
            String card = mainDeck.get(0); //iterates as long as mainDeck is not empty
            //each iteration deals a card to the next player in the players array and increments the
            // cardIndex
            mainDeck.remove(0);
            String rank = card.split("-")[0];
            String suitInString = card.split("-")[1];
            char suit =suitInString.charAt(0);
            players[cardIndex % numPlayers].addCard(Integer.parseInt(rank), suit);
            cardIndex++;


            if (dealCount % numPlayers == 0) { // to print out the hands of the players,
                System.out.println("Deal " + (dealCount / numPlayers));// number of cards dealt so
                // far is a multiple of the number of players
                for (Player player : players) {
                    System.out.println(player);
                }
                System.out.println();
            }
            dealCount++;
        }

        finalDeal(List.of(players));//ine passes a list of the players array to a function named finalDeal()

        // Sort the cards in each player's hand
        for (Player player : players) { //loop iterates through each player in the players array
            player.sortHand();  //sorts the cards in the player's hand field in ascending order.
        }

        // User input for playing cards
        boolean cardsLeft = true;
        while (cardsLeft) {
            for (int i = 0; i < numPlayers; i++) {
                System.out.println("\nCards currently in hand:");
                for (Player player : players) {
                    System.out.printf("%s: %s%n", player.name, player.hand);
                }

                System.out.println("Enter the card you want to play (suit) or type 'q' to quit:");
                String input = scanner.nextLine();

                if (input.equals("q")) {
                    System.out.println("Quitting the game...");
                    System.exit(0);
                }

                char suit;
                try {
                    suit = input.trim().charAt(0); //parse the user's input
                    if (suit != 'C' && suit != 'D' && suit != 'H' && suit != 'S') {
                        //extract the first character as a suit (i.e., 'C', 'D', 'H', or 'S').
                        throw new IndexOutOfBoundsException();
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid input. Suit must be Clubs, Diamonds, Hearts, or Spades.");
                    i--;
                    continue;
                }

                // Play the card
                for (Player player : players) {
                    try {
                        Card playedCard = player.playACard(suit);
                        System.out.printf("%s played: %s%n", player.name, playedCard);
                    } catch (IllegalStateException e) {
                        System.out.println(player.name + " has no cards left in hand");
                    } catch (NoSuchElementException e) {
                        System.out.printf("%s does not have the %s card in hand%n", player.name, suit);
                    } catch (IllegalArgumentException e) {
                        System.out.printf("%s tried to play a card that is not in their hand%n", player.name);
                    }
                }
            }

            // Check if all cards have been played
            cardsLeft = false;
            for (Player player : players) {
                if (player.hand.size() > 0) {
                    cardsLeft = true;
                    break;
                }
            }
        }

        scanner.close();
    }
}
