import java.io.*;
import java.util.*;

public class SpellChecker {
    private Node root;

    private class Node {
        String word;
        Node left, right;

        public Node(String wordtocheck) {
            this.word = wordtocheck; //The constructor takes a string called wordtocheck as input
            this.left = null;
            this.right = null;
        }
    }

    public SpellChecker(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename)); //which reads the specified file.
        String line = null;
        List<String> words = new ArrayList<>(); //creates a new ArrayList called words to store the words read from the file.

        while ((line = reader.readLine()) != null) {////reads each line of the file and adds it to the words ArrayList
            // after trimming any whitespace.
            words.add(line.trim());
        }
        reader.close();
        for (String wordtocheck : words) {//iterates through each word in the words ArrayList and inserts it into the
            // SpellChecker object by calling the insert method.
            insert(wordtocheck);
        }
    }
    public void insert(String wordtocheck) {
        root = insert(root, wordtocheck);
    }

    private Node insert(Node node, String wordtocheck) {
        if (node == null) { //f the Node is null, it creates a new Node with the input word
            return new Node(wordtocheck);//return the input word
        }
        int compare = wordtocheck.compareTo(node.word); //compares the input word with the Node's word
        if (compare < 0) {
            //determine whether to insert the word to the left or right of the current nod
            node.left = insert(node.left, wordtocheck);
        } else if (compare > 0) {
            node.right = insert(node.right, wordtocheck);
        }
        return node; //returns the node it was passed.
    }

    public List<String> spellChecker(String wordtocheck) {
        List<String> results = new ArrayList<>();//returns a List of Strings that contains suggestions for correctly spelled
        // words
        if (search(wordtocheck)) {
            // input word is found in the SpellChecker object, it is added to the results list and returned
            results.add(wordtocheck);
            return results;
        }
        List<Node> nodes = new ArrayList<>();
        searchNodes(root, wordtocheck, nodes); //if word not found search nodes is called to see for similar words to the
        //input word
        for (Node node : nodes) {
            results.add(node.word); // adds their words to the results list
        }
        return results;
    }

    private void searchNodes(Node node, String wordtocheck, List<Node> nodes) {
        //takes a Node object and a String called wordtocheck as input.
        if (node == null) {
            return;
            //searches the SpellChecker object's tree structure to find Nodes that contain words similar
            // to the input word.
        }
        if (isSwapped(wordtocheck, node.word) || isInserted(wordtocheck, node.word) || isDeleted(wordtocheck, node.word) || isReplaced(wordtocheck, node.word)) {
            ////checks if the input word is one of four types of spelling errors
            nodes.add(node);
            //If a node's word contains a similar word to the input word, it adds the node to the list of nodes
        }
        searchNodes(node.left, wordtocheck, nodes);
        searchNodes(node.right, wordtocheck, nodes);
    }

    private boolean search(String wordtocheck) { //takes the words as input and returns a node object that has the input word
        Node node = search(root, wordtocheck);
        //compares the input word to the current node word
        if (node == null) {
            return false;
        }
        return true;
    }

    private Node search(Node node, String wordtocheck) { //if words there searches the tree structure
        if (node == null) {
            return null;
        }
        ////compares the input word to the current node word
        int compare = wordtocheck.compareTo(node.word);
        if (compare < 0) {
            return search(node.left, wordtocheck); //If the input word is less than the current Node's word calls itself
            //on the left child of the node
        } else if (compare > 0) {
            return search(node.right, wordtocheck); //if greater calls itself on the right child
        } else {
            return node;
        }
    }

    private boolean isSwapped(String wordtocheck1, String wordtocheck2) {
        if (wordtocheck1.length() != wordtocheck2.length()) {//checks if the lengths of the 2 words are different.
            return false;//so they can't be swapped so returns false
        }
        char[] chars1 = wordtocheck1.toCharArray(); //converts string to character
        char[] chars2 = wordtocheck2.toCharArray();
        int count = 0;//variable will be used to count the number of characters that are different between the two input Strings.
        for (int i = 0; i < chars1.length; i++) { //oop that goes through each character in the chars1 array.
            if (chars1[i] != chars2[i]) {
                //checks if the character at index i in chars1 is different from the character at the same index in chars2.
                count++;// characters are different, the count variable is incremented.
            }
            if (count > 2) { //This checks if the count variable has exceeded 2. If it has,
                // it means that more than two characters are different between the two Strings,
            }
        }
        return count == 2;
    }

    private boolean isInserted(String wordtocheck1, String wordtocheck2) {
        if (Math.abs(wordtocheck1.length() - wordtocheck2.length()) != 1) {//length of the two strings differs by exactly one character
            return false;//if its not returns false
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < wordtocheck1.length() && j < wordtocheck2.length()) { // iterates over the characters of both strings
            if (wordtocheck1.charAt(i) != wordtocheck2.charAt(j)) {
                //checks whether the characters at index i in wordtocheck1 and j in wordtocheck2 differ
                count++;//that means character inserted
                if (count > 1) { //check whether more than one character has been inserted.
                    return false;
                }
                if (wordtocheck1.length() > wordtocheck2.length()) { //ncrement either i or j, depending on which
                    // string is longer.

                    i++;
                } else {
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
        return true; //it has not found more than one difference between the two strings
        //wordcheck2 can be obtained by wordcheck1 by inserting a character
    }

    private boolean isDeleted(String wordtocheck1, String wordtocheck2) {
        return isInserted(wordtocheck2, wordtocheck1);
        //returns the result of calling the isInserted method with the parameters reversed.
    }

    private boolean isReplaced(String wordtocheck1, String wordtocheck2) {
        if (wordtocheck1.length() != wordtocheck2.length()) {//checks if the two words have different lengths
            return false;
        }
        int count = 0;
        for (int i = 0; i < wordtocheck1.length(); i++) {
            //starts a loop that iterates through the characters in the two words.
            if (wordtocheck1.charAt(i) != wordtocheck2.charAt(i)) {
                // increments the counter if the characters at the current position are different.
                count++;
            }
            if (count > 1) {
                //returns false if the counter is greater than 1, meaning more than one character was replaced.
                return false;
            }
        }
        return count == 1;
    }
}

