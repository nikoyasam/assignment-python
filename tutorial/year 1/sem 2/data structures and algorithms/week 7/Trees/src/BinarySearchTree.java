
public class BinarySearchTree {
    public class TreeNode{
        public int data;
        public TreeNode leftChild,rightChild,parent;

        public TreeNode(int d){
            data = d;
            leftChild = null;
            rightChild = null;
            parent = null;
        }
    }

    private TreeNode root;

    public void output(){
        TreeNode n = root;
        inorderRec(n);
    }
    private void inorderRec(TreeNode node){
        if (node!=null){
            inorderRec(node.leftChild);
            System.out.println(node.data);
            inorderRec(node.rightChild);
        }
    }

    public void insert(int value){
        root = insertRec(root, value);
    }
    private TreeNode insertRec(TreeNode node, int value){
        if (node== null){
            node = new TreeNode(value);
            return node;
        }
        if (value < node.data)
            node.leftChild = insertRec(node.leftChild,value);
        else if(value>node.data)
            node.rightChild = insertRec(node.rightChild,value);
        return node;
    }
    public void remove(int value ){
        root = deleteRec(root,value);
    }
    private TreeNode deleteRec(TreeNode node, int value){
        if(node==null)
            return node;
        if (value < node.data)
            node.leftChild = deleteRec(node.leftChild,value);
        else if(value>node.data)
            node.rightChild = deleteRec(node.rightChild,value);
        else{
            if (node.leftChild == null)
                return node.rightChild;
            else if(node.rightChild == null)
                return node.leftChild;

            node.data = minValue(node.rightChild);
            node.rightChild = deleteRec(node.rightChild, node.data);

        }
        return node;

    }
    int minValue(TreeNode node){
        int minv = node.data;
        while (node.leftChild!=null){
            minv = node.leftChild.data;
            node = node.leftChild;
        }
        return minv;

    }
}
