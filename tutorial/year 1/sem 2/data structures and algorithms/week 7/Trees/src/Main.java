public class Main{
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(51);
        tree.insert(80);
        tree.insert(100);
        tree.insert(28);
        tree.insert(40);
        tree.insert(65);
        tree.insert(11);
        tree.insert(19);
        tree.insert(26);
        tree.insert(71);
        tree.insert(15);
        tree.insert(9);
        tree.insert(12);
        tree.insert(24);
        tree.insert(38);
        tree.insert(18);
        tree.insert(59);
        tree.insert(22);

        // output initial tree
        System.out.println("Initial tree:");
        tree.output();

        // delete 59
        tree.remove(59);
        System.out.println("\nTree after deleting 59:");
        tree.output();

        // delete 40
        tree.remove(40);
        System.out.println("\nTree after deleting 40:");
        tree.output();

        // delete 51
        tree.remove(51);
        System.out.println("\nTree after deleting 51:");
        tree.output();
    }

}
