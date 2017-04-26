package LinkedLists;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by bhuvanabellala on 2/25/17.
 */
public class sll {

    private Node head;

    private static class Node{

        public int val;
        public Node next;

        public Node(int x, Node n){
            val = x;
            next = n;
        }

    }

    public sll(){
        head = null;
    }

    public void insertAtX(int position, int item){

        if(head == null || position == 0){
            Node n = new Node(item, head);
            head = n;
            return;
        }

        Node temp = head;
        while(position > 1 && temp.next != null){
            temp = temp.next;
            position--;
        }

        Node n = new Node(item, temp.next);
        temp.next = n;

    }

    public void insertAtXR(Node n, int position, int item){

        if(head == null || position == 0){
            Node w = new Node(item, head);
            head = w;
            return;
        }

        if(position > 1){
            position--;
            insertAtXR(n.next, position, item);
        }else{
            Node w = new Node(item, n.next);
            n.next = w;
        }





    }


    public static void print(Node n){

        if(n != null){
            System.out.println(n.val);
            print(n.next);
        }

    }

    private static Node mergeTwo(Node f1, Node f2){

        return null;
    }

    public static void main(String[] args) {

        sll s1 = new sll();
        sll s2 = new sll();
        s1.insertAtX(0, 0);

        for(int i = 2; i < 20; i+= 2){
            s1.insertAtX(i-1, i);
        }

        for(int i = 1; i < 20; i+= 2){
            s2.insertAtX(i-1, i);
        }

        print(s1.head);
        print(s2.head);

    }

}
