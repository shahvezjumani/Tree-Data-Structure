public class Tree2 {
    Node root;
    public void insert(int value){
        root = insert(value,root);
    }
    public Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(node.data > value){
            node.left = insert(value,node.left);
        }else {
            node.right = insert(value,node.right);
        }

        return node;
    }
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    public void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }
    public boolean search(int key){
        return search(key,root);
    }
    public boolean search(int key,Node node){
        if(node == null){
            return false;
        }
        if(node.data > key){
           return search(key,node.left);
        } else if (node.data == key) {
            return true;
        } else {
           return search(key,node.right);
        }
    }

    public void deleteNode(int key){
        root = deleteNode(key,root);
    }
    public Node deleteNode(int key,Node node){
        if(node.data > key){
           node.left = deleteNode(key,node.left);
        } else if (node.data < key) {
            node.right = deleteNode(key,node.right);
        } else {
            if(node.left == null && node.right == null){
                return null;
            }
            if(node.left == null){
                return node.right;
            }
            else if (node.right == null){
                return node.right;
            }

            Node IS = inOrderSuccessor(node.right);
            node.data = IS.data;
            node.right = deleteNode(IS.data,node);
        }

        return node;
    }
    public Node inOrderSuccessor(Node node){
        while (node.left != null){
            node = node.left;
        }

        return node;
    }
}
