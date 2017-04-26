package Trees;

/**
 * Created by bhuvanabellala on 2/14/17.
 */
public class Traversal {

    private static class  Node{

        private int key;
        private Node left, right;

        private Node(int v){
            key = v;
        }

    }


    public static void preOrder(Node n){


        if(n == null){
            return;
        }

        System.out.println(n.key);
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void postOrder(Node n){


        if(n == null){
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.key);
    }

   public static void inOrder(Node n){


        if(n == null){
            return;
        }


        inOrder(n.left);
       System.out.println(n.key);
        inOrder(n.right);
    }
    public static void main(String[] args) {


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.right.left = new Node(10);
        root.left.left.right = new Node(9);
        root.left.right.right = new Node(11);

        //Traversal hel = new Traversal();
        preOrder(root);
        System.out.println("\nPost order");
        postOrder(root);
        System.out.println("\nIn order");
        inOrder(root);

    }
}
