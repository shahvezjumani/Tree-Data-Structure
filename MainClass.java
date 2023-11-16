public class MainClass {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree();
//        int [] nodes = {15,6,8,-1,-1,-1,4,-1,-1};
//        tree.root = tree.getRootNode(nodes);
//        tree.displayPreOrder(tree.root);
//        System.out.println();
//        tree.displayPostOrder(tree.root);
//        System.out.println();
//        tree.displayInOrder(tree.root);
//        System.out.println();
//        tree.displayLevelTraversal();
        tree.insert(34);
        tree.insert(10);
        tree.insert(36);
        tree.insert(14);
        tree.insert(16);
        tree.insert(100);
        tree.displayLevelTraversal();
        System.out.println();
        tree.displayInOrder();
    }
}
