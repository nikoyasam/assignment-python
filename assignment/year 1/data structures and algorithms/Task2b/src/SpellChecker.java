import java.util.ArrayList;
import java.util.List;

public class SpellChecker {
    private Node root;

    public void addWord(String word) {
        if (root == null) {
            root = new Node(word);
        } else {
            root.addWord(word);
        }
    }

    public List<String> spellChecker(String a) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (root.contains(a)) {
            result.add(a);
            return result;
        }
        result.addAll(root.searchSwaps(a));
        result.addAll(root.searchInserts(a));
        result.addAll(root.searchDeletes(a));
        result.addAll(root.searchReplacements(a));
        return result;
    }

    private static class Node {
        private String word;
        private Node left, right;

        public Node(String word) {
            this.word = word;
        }

        public void addWord(String word) {
            int comparison = word.compareTo(this.word);
            if (comparison == 0) {
                return;
            } else if (comparison < 0) {
                if (left == null) {
                    left = new Node(word);
                } else {
                    left.addWord(word);
                }
            } else {
                if (right == null) {
                    right = new Node(word);
                } else {
                    right.addWord(word);
                }
            }
        }

        public boolean contains(String word) {
            int comparison = word.compareTo(this.word);
            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                return left != null && left.contains(word);
            } else {
                return right != null && right.contains(word);
            }
        }

        public List<String> searchSwaps(String word) {
            List<String> result = new ArrayList<>();
            if (word.length() < 2) {
                return result;
            }
            for (int i = 0; i < word.length() - 1; i++) {
                char[] chars = word.toCharArray();
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
                String swapped = new String(chars);
                if (contains(swapped)) {
                    result.add(swapped);
                }
            }
            return result;
        }

        public List<String> searchInserts(String word) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i <= word.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    StringBuilder sb = new StringBuilder(word);
                    sb.insert(i, c);
                    String inserted = sb.toString();
                    if (contains(inserted)) {
                        result.add(inserted);
                    }
                }
            }
            return result;
        }

        public List<String> searchDeletes(String word) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String deleted = sb.toString();
                if (contains(deleted)) {
                    result.add(deleted);
                }
            }
            return result;
        }

        public List<String> searchReplacements(String word) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char[] chars = word.toCharArray();
                    chars[i] = c;
                    String replaced = new String(chars);
                    if (contains(replaced)) {
                        result.add(replaced);
                    }
                }
            }
            return result;
        }

    }

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker();
        String[] words = {"apple", "banana", "cherry", "during", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "ugly", "vanilla", "watermelon", "xylophone", "zucchini"};
        for (String word : words) {
            spellChecker.addWord(word);
        }

        String wordToCheck = "banna";
        List<String> corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }

        wordToCheck = "lemeon";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }

        wordToCheck = "honeyduw";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }

        wordToCheck = "fgi";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }

        wordToCheck = "chrery";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }

        wordToCheck = "kiiw";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }
        
        wordToCheck = "grpae";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }

        wordToCheck = "xylofhone";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
            System.out.println();
        }

        wordToCheck = "watermelom";
        corrections = spellChecker.spellChecker(wordToCheck);
        if (corrections.isEmpty()) {
            System.out.println("The input is spelled correctly.");
        } else {
            System.out.println("The input may be misspelled. Suggestions:");
            for (String suggestion : corrections) {
                System.out.println(suggestion);
            }
        }
        System.out.println();
    }

}

