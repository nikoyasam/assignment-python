import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creates a new Scanner object that reads input from the console and initializes a String variable
        // called word_check to an empty string.
        Scanner scanner = new Scanner(System.in);
        String wordtocheck = "";

        while (!wordtocheck.equals("exit")) {//while loop that keeps running until the user types "exit" as the input.
            System.out.print("Enter a word (type 'exit' to quit): ");//reads the user's input, and stores
            // it in the word_check variable.
            wordtocheck = scanner.nextLine();

            if (wordtocheck.equals("exit")) {
                // checks whether the user entered "exit" as the input
                break;//loop breaks
            }

            try {
                SpellChecker spellChecker = new SpellChecker("dictionary.txt");//passes the name of the
                // dictionary file to the constructor
                List<String> results = spellChecker.spellChecker(wordtocheck);
                //calls the method with the word entered by the user and stores the result in a List called results.
                if (results.contains(wordtocheck)) {//checks whether the word entered by the user is in the list of results
                    System.out.println("Word is correct.");
                } else if (results.size() > 0) {
                    System.out.println("Word is incorrect.");
                    System.out.println("Suggestions:");
                    for (String result : results) {
                        System.out.println(result);
                    }
                } else {
                    System.out.println("No similar word found in dictionary.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
