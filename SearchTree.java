import java.util.LinkedList;
import java.util.Queue;

public class SearchTree {
    Node root;
    // insert method
    public void insert(int data){
        root = insert(data,root);
    }
    public Node insert(int data, Node node){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data < node.data){
            node.left = insert(data,node.left);
        }
        if(data > node.data){
            node.right = insert(data,node.right);
        }

        return node;
    }

    // insert by an array
//    public Node insert(int [] nodes){
//        if(node == null){
//            node = new Node(data);
//            return node;
//        }
//        if(data < node.data){
//            node.left = insert(data,node.left);
//        }
//        if(data > node.data){
//            node.right = insert(data,node.right);
//        }
//
//        return node;
//    }

    // method for pre-order traversal
    public void displayPreOrder(){
        if(root == null){
            return;
        }
        displayPreOrder(root);
    }
    public void displayPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        displayPreOrder(node.left);
        displayPreOrder(node.right);
    }

    // method for In-order traversal
    public void displayInOrder(){
        if(root == null){
            return;
        }
        displayInOrder(root);
    }
    public void displayInOrder(Node node){
        if(node == null){
            return;
        }
        displayInOrder(node.left);
        System.out.print(node.data+" ");
        displayInOrder(node.right);
    }


    // method for Level traversal
    public void displayLevelTraversal(){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
}
