public class MainClass {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int [] nodes = {15,6,8,-1,-1,-1,4,-1,-1};
        tree.root = tree.getRootNode(nodes);
        tree.displayPreOrder(tree.root);
        System.out.println();
        tree.displayPostOrder(tree.root);
        System.out.println();
        tree.displayInOrder(tree.root);
        System.out.println();
        tree.displayLevelTraversal();
    }
}
