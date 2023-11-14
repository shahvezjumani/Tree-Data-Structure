import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    Node root;
    static int ind ;
    public Tree(){
        ind = -1;
    }

    // custom insert method
    public void insert(Scanner scanner){
        System.out.print("Enter the value of root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner,root);

    }
    public void insert(Scanner scanner,Node node){
        System.out.print("Do you want to insert node in the left of the : "+node.data);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of Node that is left to : "+node.data);
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner,node.left);
        }

        System.out.print("Do you want to insert node in the right of the : "+node.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of Node that is right to : "+node.data);
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner,node.right);
        }
    }

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

    // method for post-order traversal
    public void displayPostOrder(){
        if(root == null){
            return;
        }
        displayPreOrder(root);
    }
    public void displayPostOrder(Node node){
        if(node == null){
            return;
        }
        displayPreOrder(node.left);
        displayPreOrder(node.right);
        System.out.print(node.data+" ");
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

    // insert nodes by using array
    public Node getRootNode(int [] nodes){
        ind++;
        if(nodes[ind] == -1){
            return null;
        }
        Node node = new Node(nodes[ind]);
        node.left = getRootNode(nodes);
        node.right = getRootNode(nodes);

        return node;
    }
}
