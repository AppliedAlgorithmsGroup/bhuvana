package leetcode;

/**
 * Created by bhuvanabellala on 2/15/17.
 */
public class Palindrome {


    private static class Node{
        int val;
        Node next;

        private Node(int x, Node w){
            val = x;
            next = w;

        }
    }

    public boolean isPalindrome(Node head){


        Node slowNode = head;
        Node fastNode = head;

        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        Palindrome h = this;

        System.out.println(slowNode.val);

        return true;
    }


    public static Node reverse(Node node){


        Node rest = node.next;
        Node head = node;

        while(rest.next != null){

        }

        return rest;

    }

    public static void main(String[] args) {

        Node head = new Node(5, new Node(6, new Node(6, new Node(5, null))));

        Node reversed = reverse(head);


    }

}
