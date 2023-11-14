import java.util.Scanner;

public class Tree {
    Node root;

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
}
