package leetcode;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by bhuvanabellala on 2/14/17.
 */
public class TowersofHanoi {

    public static void TowersOfHanoi(List<Deque<Integer>> tower){

    }

    public static void main(String[] args) {
        List<Deque<Integer>> pegs = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            pegs.add(new LinkedList<Integer>());
        }

        for(int i = 10; i >= 1; --i){
            pegs.get(0).addFirst(i);
        }
    }



}
