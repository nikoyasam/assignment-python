import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker {
    private Node root;

    // Node class
    private class Node {
        String word;
        Node left;
        Node right;

        public Node(String word) {
            this.word = word;
            left = null;
            right = null;
        }
    }

    // Constructor to create the binary search tree
    public SpellChecker(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNext()) {
                String word = scanner.next();
                root = insert(root, word.toLowerCase());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    // Method to insert a word into the binary search tree
    private Node insert(Node node, String word) {
        if (node == null) {
            return new Node(word);
        }

        if (word.compareTo(node.word) < 0) {
            node.left = insert(node.left, word);
        } else if (word.compareTo(node.word) > 0) {
            node.right = insert(node.right, word);
        }

        return node;
    }

    // Method to check if a word is spelled correctly
    public ArrayList<String> spellCheck(String word) {
        ArrayList<String> suggestions = new ArrayList<String>();
        if (search(word.toLowerCase(), root)) {
            suggestions.add(word.toLowerCase());
            return suggestions;
        }

        // Perform spell-checking operations
        suggestions.addAll(checkDeletion(word.toLowerCase(), root));
        suggestions.addAll(checkInsertion(word.toLowerCase(), root));
        suggestions.addAll(checkReplacement(word.toLowerCase(), root));
        suggestions.addAll(checkTransposition(word.toLowerCase(), root));

        return suggestions;
    }

    // Method to search for a word in the binary search tree
    private boolean search(String word, Node node) {
        if (node == null) {
            return false;
        }

        if (word.equals(node.word)) {
            return true;
        } else if (word.compareTo(node.word) < 0) {
            return search(word, node.left);
        } else {
            return search(word, node.right);
        }
    }

    // Method to check for suggestions with one character deleted
    private ArrayList<String> checkDeletion(String word, Node node) {
        ArrayList<String> suggestions = new ArrayList<String>();
        for (int i = 0; i < word.length(); i++) {
            String deleted = word.substring(0, i) + word.substring(i+1);
            if (search(deleted, node)) {
                suggestions.add(deleted);
            }
        }
        return suggestions;
    }

    // Method to check for suggestions with one character inserted
    private ArrayList<String> checkInsertion(String word, Node node) {
        ArrayList<String> suggestions = new ArrayList<String>();
        for (int i = 0; i <= word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String inserted = word.substring(0, i) + c + word.substring(i);
                if (search(inserted, node)) {
                    suggestions.add(inserted);
                }
            }
        }
        return suggestions;
    }

    // Method to check for suggestions with one character replaced
    // Method to check for suggestions with one character replaced
    private ArrayList<String> checkReplacement(String word, Node node) {
        ArrayList<String> suggestions = new ArrayList<String>();
        for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String replaced = word.substring(0, i) + c + word.substring(i+1);
                if (search(replaced, node)) {
                    suggestions.add(replaced);
                }
            }
        }
        return suggestions;
    }
    private ArrayList<String> checkTransposition(String word, Node node) {
        ArrayList<String> suggestions = new ArrayList<String>();
        for (int i = 0; i < word.length() - 1; i++) {
            String transposed = word.substring(0, i) + word.charAt(i+1) + word.charAt(i) + word.substring(i+2);
            if (search(transposed, node)) {
                suggestions.add(transposed);
            }
        }
        return suggestions;
    }
    public void printSuggestions(String word) {
        ArrayList<String> suggestions = spellCheck(word.toLowerCase());
        if (suggestions.isEmpty()) {
            System.out.println("No suggestions found for " + word);
        } else {
            System.out.println("Suggestions for " + word + ":");
            for (String suggestion : suggestions) {
                System.out.println("- " + suggestion);
            }
        }
    }
    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker("words.txt");

        spellChecker.printSuggestions("wrogn");
        spellChecker.printSuggestions("speling");
        spellChecker.printSuggestions("grammer");
    }
}
