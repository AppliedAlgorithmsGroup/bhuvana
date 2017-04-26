package nested;

/**
 * Created by bhuvanabellala on 12/30/16.
 */
public class Binary {

    private int _here = 5;
    public Node head;

    public Binary(int val){
            head = new Node(val);
    }

    private class Node{

        private int _val;
        private Node _next;

        private Node(int val){
            _val = val;
            _next = null;
            System.out.println(_here);

        }

    }

    public static void main(String[] args){

       Binary newO = new Binary(1);
    }
}
