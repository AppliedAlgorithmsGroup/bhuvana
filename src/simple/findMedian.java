package simple;
import edu.princeton.cs.algs4.In;

import java.util.*;

/**
 * Find median of an unsorted array using quickselect
 * Created by bhuvanabellala on 2/26/17.
 */
public class findMedian {


    public static void merge(int n){

        Integer[] arr = {1,2,3,0};

        Arrays.sort(arr, new Comparator<Integer>(){


            public int compare(Integer x, Integer y){
                System.out.println(n);
                return n;
            }
        });

    }

    public static boolean overlap(int x1, int x2, int y1, int y2){

        return x1 <= y2 && y1 <= x2;

    }


    public static void main(String[] args) {

//        ArrayList hi = new ArrayList<Integer>();
//        ArrayList w = new ArrayList<String>();
//        w.add("hello");
//        hi.add(1);
//
//        for( Object x: hi){
//            System.out.println((String) x + (String)  w.get(0));
//        }

        System.out.println(1/2);

//        merge(523);
//        int[] arr = new int[]{};
//
//        arr[1] = 4;
    }
}
